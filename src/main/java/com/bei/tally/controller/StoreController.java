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
import com.bei.tally.entity.Analyse;
import com.bei.tally.entity.Produce;
import com.bei.tally.entity.Store;
import com.bei.tally.service.ProduceService;
import com.bei.tally.service.StoreService;

/**
 * @ClassName: IndexController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年6月27日 下午4:11:42
 * 
 */
@Controller
@RequestMapping(value = "store")
public class StoreController {
	@Autowired
	private StoreService storeService;
	@Autowired
	private ProduceService produceService;
	// @Autowired
	// private CostService costService;
	// @Autowired
	// private CostService costService;

	@RequestMapping(value = "analyseUI", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String analyseUI(Model model, Store store, Produce produce) {
		System.out.println("****************analyseUI*******************");
		/**
		 * 通过入库编号查询出杂七杂八的费用，
		 */
		Analyse analyse = new Analyse();
		Analyse analyse2 = new Analyse();
		System.out.println("******:"+store.getId());
		analyse = storeService.findAnalyseOne(store.getId());
		List<Analyse> analysesList = storeService.findAnalyse(store.getId());
		analyse2 = storeService.findCount(store.getId());

		model.addAttribute("analyse", analyse);
		model.addAttribute("analysesList", analysesList);
		model.addAttribute("analyse2", analyse2);
		return "admin/listAnalyse";
	}

	@RequestMapping(value = "addStoreUI", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String toStoreUI(Model model, Store store, Produce produce) {
		System.out.println(produce.getId());
		System.out.println("****************addStoreUI*******************");
		List<Produce> proList = produceService.findList(new Produce());
		Store store2 = null;
		if (null != store.getId()) {
			System.out.println("****************edit*******************");
			store2 = storeService.get(store.getId());
		}
		model.addAttribute("proList", proList);
		model.addAttribute("store", store2);
		return "admin/addStore";
	}

	@ResponseBody
	@RequestMapping(value = "save", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<Store> save(Model model, Resp<Store> resp, Store store) {
		System.out.println("****************save*******************");
		// System.out.println("*******"+store.getCreateDate());

		store.setStoreStatu(1);
		store.setDelFlag(0);
		store.setCreateBy("0");
		store.setCreateDate(new Date());

		storeService.save(store);
		model.addAttribute("code", 200);
		resp.setCode(200);
		resp.setMsg("操作成功！");
		return resp;
	}

	@ResponseBody
	@RequestMapping(value = "delete", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public Resp<Store> delete(Resp<Store> resp, Integer id) {
		System.out.println("****************delete*******************");
		int rel = 0;
		if (StringUtils.isNotBlank(id.toString())) {
			rel = storeService.delete(id);
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
		storeService.get(id);
		return "admin/welcome";
	}

	@RequestMapping(value = "findList", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String findList(Model model, Store store) {
		System.out.println("****************find*******************");
		List<Store> storeList = storeService.findList(store);
		model.addAttribute("storeList", storeList);
		model.addAttribute("code", 200);
		return "admin/listStore";
	}

}
