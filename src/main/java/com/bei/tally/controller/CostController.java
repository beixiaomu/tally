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
import com.bei.tally.entity.Cost;
import com.bei.tally.entity.TypeCost;
import com.bei.tally.service.CostService;
import com.bei.tally.service.TypeCostService;

/**
 * @ClassName: IndexController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年6月27日 下午4:11:42
 * 
 */
@Controller
@RequestMapping(value = "cost")
public class CostController {
	@Autowired
	private CostService costService;
	@Autowired
	private TypeCostService typeCostService;

	@RequestMapping(value = "addCostUI", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String toCostUI(Model model, Cost cost, String productId) {
		System.out.println("****************addCostUI*******************");
		TypeCost typeCost = new TypeCost();
		typeCost.setProductId(productId);
		List<TypeCost> tcList = typeCostService.findList(typeCost);

		Cost cost2 = null;
		if (null != cost.getId()) {
			System.out.println("****************edit*******************");
			cost2 = costService.get(cost.getId());
		}

		model.addAttribute("tcList", tcList);
		model.addAttribute("cost", cost2);
		return "admin/addCost";
	}

	@ResponseBody
	@RequestMapping(value = "save", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<Cost> save(Model model, Resp<Cost> resp, Cost cost) {
		System.out.println("****************save*******************");

		cost.setDelFlag(0);
		cost.setCreateBy("0");
		cost.setCreateDate(new Date());

		costService.save(cost);
		model.addAttribute("code", 200);
		resp.setCode(200);
		resp.setMsg("操作成功！");
		return resp;
	}

	@ResponseBody
	@RequestMapping(value = "delete", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<Cost> delete(Resp<Cost> resp, Integer id) {
		System.out.println("****************delete*******************");
		int rel = 0;
		if (StringUtils.isNotBlank(id.toString())) {
			rel = costService.delete(id);
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
		costService.get(id);
		return "admin/welcome";
	}

	@RequestMapping(value = "findList", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String findList(Model model, Cost cost) {
		System.out.println("****************find*******************");
		List<Cost> costList = costService.findList(cost);
		model.addAttribute("costList", costList);
		model.addAttribute("code", 200);
		return "admin/listCost";
	}

}
