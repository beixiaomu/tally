package com.bei.tally.interceptor;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.bei.tally.cts.Constants;





/**
 * 登录拦截器
 * 
 * @author Boost
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

	private List<String> url = new ArrayList<>();
	Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	/**
	 * 开始进入地址请求拦截
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("---------------------开始进入请求地址拦截----------------------------");

		HttpSession session = request.getSession();

		if (session.getAttribute(Constants.CURRENT_USER) != null || session.getAttribute(Constants.CURRENT_ADMIN) != null) {
			session.setAttribute(Constants.CURRENT_USER, session.getAttribute(Constants.CURRENT_USER));
			session.setAttribute(Constants.CURRENT_ADMIN, session.getAttribute(Constants.CURRENT_ADMIN));
			return true;
		} else {
			response.sendRedirect(request.getContextPath() + "/teacher/loginUI");
			return false;
		}

		/*
		 * if (session.getAttribute("admin") != null) { return true; } else {
		 * response.sendRedirect("/admin/login"); // 未登录，跳转到登录页 return false; }
		 */
	}

	/**
	 * 处理请求完成后视图渲染之前的处理操作
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("--------------处理请求完成后视图渲染之前的处理操作---------------");
	}

	/**
	 * 视图渲染之后的操作
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("---------------视图渲染之后的操作-------------------------0");
	}

	/**
	 * 定义排除拦截URL
	 * 
	 * @return
	 */
	public List<String> getUrl() {
		url.add("/index/*"); // 登录页
		url.add("/user/view"); // 登录页
		url.add("/teacher/loginUI"); // 登录页
		url.add("/fnotice/findTwo");

		url.add("/redis/test");
		url.add("/jump/toVueBill");

		url.add("/fbill/exportFamily");

		// 网站静态资源
		url.add("/resources/static/**");
		url.add("/static/**");
		url.add("/css/**");
		url.add("/js/**");
		url.add("/layui/**");
		url.add("/static/lib/**");
		url.add("/static/fonts/**");
		url.add("/static/images/**");
		url.add("/static/icon/**");
		url.add("/static/iconfont/**");
		url.add("/static/img/**");
		url.add("/static/pages/**");
		return url;
	}
}
