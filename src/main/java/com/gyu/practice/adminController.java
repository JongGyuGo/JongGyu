package com.gyu.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController {
	
	@RequestMapping(value="/admin/adminPageView")
	public String adminPageView() {
		return "/admin/adminPage";
	}
	
	@RequestMapping(value="/admin/bannerListView")
	public String bannerListView() {
		return "/admin/banner/list";
	}
}
