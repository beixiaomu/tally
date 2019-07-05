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
import com.bei.tally.entity.TypeCost;
import com.bei.tally.service.ProduceService;
import com.bei.tally.service.TypeCostService;

/**
 * @ClassName: IndexController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年6月27日 下午4:11:42
 * 
 */
@Controller
@RequestMapping(value = "typeCost")
public class TypeCostController {
	@Autowired
	private TypeCostService typeCostService;
	@Autowired
	private ProduceService produceService;

	@RequestMapping(value = "addTypeCostUI", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String toTypeCostUI(Model model,TypeCost typeCost) {
		System.out.println("****************addTypeCostUI*******************");
		List<Produce> producesList = produceService.findList(null);
		TypeCost typeCost2 = null;
		if (null != typeCost.getId()) {
			System.out.println("****************edit*******************");
			typeCost2 = typeCostService.get(typeCost.getId());
			model.addAttribute("typeCost",typeCost2);
			model.addAttribute("producesList",producesList);
			return "admin/addTypeCost";
		}
		model.addAttribute("typeCost",typeCost2);
		model.addAttribute("producesList",producesList);
		return "admin/addTypeCost";
	}

	@ResponseBody
	@RequestMapping(value = "save", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<TypeCost> save(Model model, Resp<TypeCost> resp, TypeCost typeCost) {
		System.out.println("****************save*******************");
		typeCost.setDelFlag(0);
		typeCost.setCreateBy("0");
		typeCost.setCreateDate(new Date());

		typeCostService.save(typeCost);
		model.addAttribute("code", 200);
		resp.setCode(200);
		resp.setMsg("操作成功！");
		return resp;
	}

	@ResponseBody
	@RequestMapping(value = "delete", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<TypeCost> delete(Resp<TypeCost> resp, Integer id) {
		System.out.println("****************delete*******************");
		int rel = 0;
		if (StringUtils.isNotBlank(id.toString())) {
			rel = typeCostService.delete(id);
		}
		if (rel > 0) {
			resp.setCode(200);
			resp.setMsg("操作成功！");
			return resp;
		}
		resp.setCode(400);
		resp.setMsg("操作失败！");
		return resp;
	}

	@RequestMapping(value = "get", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String get(Integer id) {

		System.out.println("****************get*******************");
		typeCostService.get(id);
		return "admin/welcome";
	}

	@RequestMapping(value = "findList", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String findList(Model model, TypeCost typeCost) {
		System.out.println("****************find*******************");
		List<TypeCost> typeList = typeCostService.findList(typeCost);
		model.addAttribute("typeList", typeList);
		model.addAttribute("code", 200);
		return "admin/listTypeCost";
	}

}
