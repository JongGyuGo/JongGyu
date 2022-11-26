package com.gyu.practice.banner.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.gyu.practice.banner.domain.Banner;
import com.gyu.practice.banner.service.bannerServiceInter;

@Controller
public class bannerController {
	
	@Autowired
	private bannerServiceInter bService;
	
	/**
	 * ��ʵ��
	 * @param mv
	 * @param banner
	 * @param uploadFile
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/banner/register", method = RequestMethod.POST)
	public ModelAndView registerBanner(
			ModelAndView mv,
			@ModelAttribute Banner banner,
			@RequestParam(value = "uploadFile", required = false) MultipartFile uploadFile,
			HttpServletRequest request) {
		
		
		String root = request.getSession().getServletContext().getRealPath("resources");
		String savePath = root + "\\images\\slider";	// ���� ��� ����
		String bannerFileName = uploadFile.getOriginalFilename();
		
		try {
			if(!bannerFileName.equals("")) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
				File file = new File(savePath);
				String bannerRename = sdf.format(new Date(System.currentTimeMillis())) + "."
						+ bannerFileName.substring(bannerFileName.lastIndexOf(".")+1); // .�������� ������ �߶� ��ȯ
				if(!file.exists()) { // ��� ������ ������ ���� ����
					file.mkdir();
				}
				uploadFile.transferTo(new File(savePath + "\\" + bannerRename));
				String bannerpath = savePath + "\\" + bannerRename; // ������
				
				banner.setBennerFileName(bannerFileName);
				banner.setBennerFileRename(bannerRename);
				banner.setBennerPath(bannerpath);
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int chkBanner = bService.chkBanner(banner.getBennerNo());
			if(chkBanner > 0) { // ���� ��ʰ� ������ ������Ʈ
				int result = bService.renewBanner(banner);
			}else {	// ���� ��ʰ� ������ �μ�Ʈ
				int result = bService.registerBanner(banner);
			}
		mv.setViewName("redirect:/admin/banner/list");
		return mv;
	}
	
	/**
	 * ��� ����Ʈ
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/banner/bannerList", method = RequestMethod.GET)
	public ModelAndView bannerList(ModelAndView mv) {
		
		List<Banner> bList = bService.bannerList();
		if(!bList.isEmpty()) {
			mv.addObject("bList", bList);
			mv.setViewName("/admin/banner/list");
		}else {
			mv.setViewName("/admin/banner/list");
		}
		return mv;
	}
	
}
