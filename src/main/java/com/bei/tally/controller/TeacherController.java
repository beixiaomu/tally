/** 
 * @Title: TeacherController.java 
 * @Package com.bei.tally.contraller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年5月10日 下午5:45:05 
 * @version V1.0 
 */ 
package com.bei.tally.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * @ClassName: TeacherController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年5月10日 下午5:45:05 
 *  
 */
@Controller
@RequestMapping(value="index")
public class TeacherController {
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
