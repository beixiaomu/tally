/** 
 * @Title: IndexController.java 
 * @Package com.bei.tally.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年6月27日 下午4:11:42 
 * @version V1.0 
 */
package com.bei.tally.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bei.tally.cts.Resp;
import com.bei.tally.entity.FileUpload;
import com.bei.tally.service.FileUploadService;
import com.bei.tally.util.ftp.FtpUtil;

/**
 * @ClassName: IndexController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年6月27日 下午4:11:42
 * 
 */
@Controller
@RequestMapping(value = "fileUpload")
public class FileUploadController {
	@Autowired
	private FileUploadService fileUploadService;

	@RequestMapping(value = "addFileUploadUI", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String toFileUploadUI(Model model, FileUpload fileUpload, String productId) {
		System.out.println("****************addFileUploadUI*******************");

		FileUpload fileUpload2 = null;
		if (null != fileUpload.getId()) {
			System.out.println("****************edit*******************");
			fileUpload2 = fileUploadService.get(fileUpload.getId());
		}

		model.addAttribute("fileUpload", fileUpload2);
		return "admin/addFileUpload";
	}

	@ResponseBody
	@RequestMapping(value = "save", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<FileUpload> save(Model model, Resp<FileUpload> resp, FileUpload fileUpload) {
		System.out.println("****************save*******************");

		fileUpload.settCreateBy(1);
		fileUpload.settCreateDate(new Date());

		fileUploadService.save(fileUpload);
		model.addAttribute("code", 200);
		resp.setCode(200);
		resp.setMsg("操作成功！");
		return resp;
	}

	@ResponseBody
	@RequestMapping(value = "delete", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<FileUpload> delete(Resp<FileUpload> resp, Integer id) {
		System.out.println("****************delete*******************");
		int rel = 0;
		if (StringUtils.isNotBlank(id.toString())) {
			rel = fileUploadService.delete(id);
		}
		if (rel > 0) {
			resp.setCode(200);
			resp.setMsg("操作成功！");
			return resp;
		}
		resp.setCode(400);
		resp.setMsg("操作成功！");
		return resp;
	}

	@RequestMapping(value = "get", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String get(Integer id) {

		System.out.println("****************get*******************");
		fileUploadService.get(id);
		return "admin/welcome";
	}

	@RequestMapping(value = "findList", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String findList(Model model, FileUpload fileUpload) {
		System.out.println("****************find*******************");
		List<FileUpload> fileUploadList = fileUploadService.findList(fileUpload);
		model.addAttribute("fileUploadList", fileUploadList);
		model.addAttribute("code", 200);
		return "admin/listFileUpload";
	}

	@ResponseBody
	@RequestMapping(value = "upload", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<FileUpload> upload(Resp<FileUpload> resp, @RequestParam("file") MultipartFile file,
			FileUpload fileUpload, HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("******************upload*****************");
		resp.setCode(400);
		resp.setMsg("上传失败");
		resp.setData(null);
		String path = FtpUtil.ftpUp(file);

		if (null != path || "".equals(path)) {
			String typeName = file.getOriginalFilename();
			int intold = typeName.lastIndexOf('.');
			// String old = typeName.substring(intold);
			String ttype = typeName.substring(intold + 1);
			fileUpload.settCreateBy(1);
			fileUpload.settFileTitle(file.getOriginalFilename());
			fileUpload.settFileUrl(path);
			Long size = file.getSize();

			fileUpload.settFileSize(size.toString());
			fileUpload.settFileType(ttype);
			fileUpload.settFileDescribe("这是一个文件...");
			fileUpload.settFileCount("0");

			fileUploadService.save(fileUpload);

			resp.setCode(200);
			resp.setMsg("上传成功");
			resp.setData(fileUpload);
		}
		return resp;
	}

	/**
	 * @param remotePath
	 *            FTP服务器上的相对路径
	 * @param fileName
	 *            要下载的文件名
	 * @param localPath
	 *            下载后保存到本地的路径
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "download", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<FileUpload> downLoad(Resp<FileUpload> resp, FileUpload fileUpload, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		System.out.println("******************downLoad*****************");
		System.out.println("id:" + fileUpload.getId());
		resp.setCode(400);
		resp.setMsg("上传失败");
		resp.setData(null);
		FileUpload upload = fileUploadService.get(fileUpload.getId());

		String remotePath = upload.gettFileUrl();
		String fileName = upload.gettFileTitle();
		String localPath = "";

		boolean relst = FtpUtil.download(remotePath, fileName, localPath);
		if (true == relst) {
			resp.setCode(200);
			resp.setMsg("下载桌面成功");
			resp.setData(upload);
			Integer abc = Integer.parseInt(upload.gettFileCount())+1;
			
			upload.settFileCount(abc.toString());
			fileUploadService.save(upload);
		}
		

		return resp;
	}
}
