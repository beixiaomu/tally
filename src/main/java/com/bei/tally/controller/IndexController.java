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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bei.tally.cts.Resp;
import com.bei.tally.entity.FileUpload;
import com.bei.tally.entity.Produce;
import com.bei.tally.service.FileUploadService;
import com.bei.tally.service.ProduceService;
import com.bei.tally.util.ftp.FtpUtil;

/**
 * @ClassName: IndexController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年6月27日 下午4:11:42
 * 
 */
@Controller
@RequestMapping(value = "index")
public class IndexController {
	@Autowired
	private ProduceService produceService;
	@Autowired
	private FileUploadService fileUploadService;

	@ResponseBody
	@RequestMapping(value = "getapp", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<Produce> getapp(Resp<Produce> resp, String id) {
		System.out.println("****************get*******************");
		Produce entity = null;
		if (StringUtils.isNotBlank(id.toString())) {
			entity = produceService.get(Integer.parseInt(id));
		}
		if (entity == null) {
			entity = new Produce();
		}
		resp.setData(entity);
		resp.setCode(200);
		return resp;
	}

	@RequestMapping(value = "index", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String index() {
		System.out.println("****************index首页*******************");
		return "admin/index";
	}

	@RequestMapping(value = "welcome", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String welcome() {
		System.out.println("****************index首页*******************");
		return "admin/welcome";
	}

	@RequestMapping(value = "center", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String center() {
		System.out.println("****************index首页*******************");
		return "admin/center";
	}

	// @RequestMapping(value = "fileUpload", method = { RequestMethod.POST,
	// RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	// public String fileUpload() {
	// System.out.println("****************index首页*******************");
	// return "admin/fileUpload";
	// }
	@RequestMapping(value = "inStorage", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String inStorage() {
		System.out.println("****************index首页*******************");
		return "admin/inStorage";
	}

	@RequestMapping(value = "personalCenter", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String personalCenter() {
		System.out.println("****************index首页*******************");
		return "admin/personalCenter";
	}

	// ******************//
	@RequestMapping(value = "loginUI", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String loginUI() {
		System.out.println("***********************************");
		return "login/index";
	}

	@RequestMapping(value = "login", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String login() {
		System.out.println("****************1*******************");
		return "login/index";
	}

	@RequestMapping(value = "blue", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String blue() {
		System.out.println("***********************************");
		return "login/index";
	}

	@RequestMapping(value = "green", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String green() {
		System.out.println("***********************************");
		return "login/index";
	}

	@RequestMapping(value = "purple", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String purple() {
		System.out.println("***********************************");
		return "login/purple";
	}

	@RequestMapping(value = "red", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String red() {
		System.out.println("***********************************");
		return "login/red";
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

		//
		// String name = file.getName();
		// Long size = file.getSize();
		// String type = file.getContentType();
		// String typeName = file.getOriginalFilename();
		// System.out.println("文件名：" + name + "文件大小：" + size + "mime类型：" + type +
		// "文件类型:" + typeName);
		//
		// InputStream fis = (InputStream) file.getInputStream();
		//
		// System.out.println("******************fis*****************" + fis);
		//
		// System.out.println("******************file*****************");
		//
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//
		// String date = sdf.format(new Date());
		//
		// // 避免文件名重复使用uuid来避免,产生一个随机的uuid字符
		// String realFileName = Uuidd.getStringRandom(6);
		// int intold =typeName.lastIndexOf('.');
		// String old = typeName.substring(intold);
		// String ttype = typeName.substring(intold+1);
		// String news = realFileName+realFileName + old;
		// System.out.println("intold" + intold);
		// System.out.println("date" + date);
		// System.out.println("old" + old);
		// System.out.println("news" + news);
		// System.out.println("realFileName" + realFileName);
		// String repaht = FtpUtil.ftpUpload(ttype+"/"+date, news, fis);
		// System.out.println("repaht" + repaht);
		return resp;
	}

}
