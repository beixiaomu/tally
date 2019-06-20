/** 
 * @Title: UserController.java 
 * @Package com.zhwl.pos.controller 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author ������--���ܻ�   -.- 
 * @date 2019��5��8�� ����2:59:18 
 * @version V1.0 
 */
package com.bei.tally.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/indexs")
public class UserController {
	/*
	 * @Resource private UserDao userDao;
	 */

	@RequestMapping(value = "loginUI", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String loginUI() {
		System.out.println("***********************************");
		return "login/index";
	}

	@RequestMapping("/views")
	public String views() {
		return "login/index";
	}

	@RequestMapping("/indexview")
	public String index() {
		return "main/index";
	}

	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.POST) public
	 * ModelAndView login(User model, HttpSession session) { User user =
	 * userDao.findByUsername(model.getUsername());
	 * 
	 * if (user == null || !user.getPassword().equals(model.getPassword())) { return
	 * new ModelAndView("redirect:/login.jsp"); } else {
	 * session.setAttribute("user", user); ModelAndView mav = new ModelAndView();
	 * mav.setViewName("index"); return mav; } }
	 */
}