package com.hcc.advWeb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping

public class DetailInfoController {
	
	
	@Autowired
	private DetailInfoService detailInfoService;
	
	public DetailInfoController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/services", method= RequestMethod.GET)
	public ModelAndView getDetailInfosList(ModelAndView model) {
		ArrayList<DetailInfo> detailInfosList = detailInfoService.getDetailInfosList();
		model.addObject("services",detailInfosList);
		model.setViewName("services");
		return model;
	}
	
	@RequestMapping(value="/index", method= RequestMethod.GET)
	public String getDetailInfosList2(Model model) {
//		ArrayList<DetailInfo> detailInfosList = detailInfoService.getDetailInfosList();
//		model.addObject("services",detailInfosList);
//		model.setViewName("services");
		return "index";
	}
	
	@RequestMapping(value="/contact", method= RequestMethod.GET)
	public String getDetailInfosList4(Model model) {
//		ArrayList<DetailInfo> detailInfosList = detailInfoService.getDetailInfosList();
//		model.addObject("services",detailInfosList);
//		model.setViewName("services");
		return "contact";
	}
	
	@RequestMapping(value="/company", method= RequestMethod.GET)
	public String getDetailInfosList3(Model model) {
//		ArrayList<DetailInfo> detailInfosList = detailInfoService.getDetailInfosList();
//		model.addObject("services",detailInfosList);
//		model.setViewName("services");
		return "company";
	}
	
	

}
