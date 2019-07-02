/** 
 * @Title: IndexController.java 
 * @Package com.bei.tally.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年6月27日 下午4:11:42 
 * @version V1.0 
 */
package com.bei.tally.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bei.tally.cts.Resp;
import com.bei.tally.entity.Produce;
import com.bei.tally.service.ProduceService;

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
		System.out.println("***********************************");
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
}
