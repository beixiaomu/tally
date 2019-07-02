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
@RequestMapping(value = "produce")
public class ProduceController {
	@Autowired
	private ProduceService produceService;

	@RequestMapping(value = "addProduceUI", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String toProduceUI() {
		System.out.println("****************addProduceUI*******************");
		return "admin/addProduce";
	}
	
	@ResponseBody
	@RequestMapping(value = "save", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<Produce> save(Model model, Resp<Produce> resp,  Produce produce) {
		System.out.println("****************save*******************");
		Produce produce2 = new Produce();
		produce2.setProductName(produce.getProductName());
		if(null!=produceService.findList(produce2)){
			resp.setCode(400);
			resp.setMsg("项目名已经存在，添加失败！");
			return resp;
		};
		produce.setDelFlag("0");
		produce.setCreateBy("0");
		produce.setCreateDate(new Date());
		
		produceService.save(produce);
		model.addAttribute("code", 200);
		resp.setCode(200);
		resp.setMsg("添加成功！");
		return resp;
	}

	@RequestMapping(value = "delete", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String delete() {
		System.out.println("****************delete*******************");

		return "admin/welcome";
	}

	@ResponseBody
	@RequestMapping(value = "getapp", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<Produce> getapp(Resp<Produce> resp, Integer id) {
		System.out.println("****************get*******************");
		Produce entity = null;
		if (StringUtils.isNotBlank(id.toString())) {
			entity = produceService.get(id);
		}
		if (entity == null) {
			entity = new Produce();
		}
		resp.setData(entity);
		System.out.println(resp.toString());
		return resp;
	}

	@RequestMapping(value = "get", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String get(Integer id) {

		System.out.println("****************get*******************");
		produceService.get(id);
		return "admin/welcome";
	}

	@RequestMapping(value = "findList", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String findList(Model model, Produce produce) {
		System.out.println("****************find*******************");
		List<Produce> pList = produceService.findList(produce);
		model.addAttribute("pList", pList);
		model.addAttribute("code", 200);
		return "admin/listProduce";
	}

}
