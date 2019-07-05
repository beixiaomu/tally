/** 
 * @Title: IndexController.java 
 * @Package com.bei.tally.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年6月27日 下午4:11:42 
 * @version V1.0 
 */
package com.bei.tally.controller;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bei.tally.cts.Resp;
import com.bei.tally.entity.Source;
import com.bei.tally.entity.TypeCost;
import com.bei.tally.service.SourceService;
import com.bei.tally.service.TypeCostService;

/**
 * @ClassName: IndexController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年6月27日 下午4:11:42
 * 
 */
@Controller
@RequestMapping(value = "source")
public class SourceController {
	@Autowired
	private SourceService sourceService;
	@Autowired
	private TypeCostService typeCostService;

	@RequestMapping(value = "addSourceUI", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String toSourceUI(Model model, Source source, String productId) {
		System.out.println("****************addSourceUI*******************");
		TypeCost typeSource = new TypeCost();
		typeSource.setProductId(productId);
		List<TypeCost> tcList = typeCostService.findList(typeSource);

		Source source2 = null;
		if (null != source.getId()) {
			System.out.println("****************edit*******************");
			source2 = sourceService.get(source.getId());
		}

		model.addAttribute("tcList", tcList);
		model.addAttribute("source", source2);
		return "admin/addSource";
	}

	@ResponseBody
	@RequestMapping(value = "save", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<Source> save(Model model, Resp<Source> resp, Source source) {
		System.out.println("****************save*******************");

		source.setDelFlag(0);
		source.setCreateBy("0");
		source.setCreateDate(new Date());

		sourceService.save(source);
		model.addAttribute("code", 200);
		resp.setCode(200);
		resp.setMsg("操作成功！");
		return resp;
	}

	@ResponseBody
	@RequestMapping(value = "delete", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<Source> delete(Resp<Source> resp, Integer id) {
		System.out.println("****************delete*******************");
		int rel = 0;
		if (StringUtils.isNotBlank(id.toString())) {
			rel = sourceService.delete(id);
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
		sourceService.get(id);
		return "admin/welcome";
	}

	@RequestMapping(value = "findList", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String findList(Model model, Source source) {
		System.out.println("****************find*******************");
		List<Source> sourceList = sourceService.findList(source);
		model.addAttribute("sourceList", sourceList);
		model.addAttribute("code", 200);
		return "admin/listSource";
	}

}
