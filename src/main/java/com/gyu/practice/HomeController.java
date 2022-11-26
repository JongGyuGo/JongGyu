package com.gyu.practice;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gyu.practice.banner.domain.Banner;
import com.gyu.practice.banner.service.bannerServiceInter;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private bannerServiceInter bService;
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView home(Locale locale, ModelAndView mv) {
//		
//		ArrayList<Banner> bList = new ArrayList<Banner>();
//		for(int i = 1; i < 6; i++) {
//			Banner oneBanner = bService.printOneBanner(i);
//			if(!oneBanner.toString().contains("null")) {
//				bList.add(oneBanner);
//			}
//		}
//		mv.addObject("bList", bList);
//		mv.setViewName("home");
//		
//		return mv;
//	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
	return "home";
}
	
}
