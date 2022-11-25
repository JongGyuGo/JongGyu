package com.gyu.practice.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gyu.practice.board.domain.Board;
import com.gyu.practice.member.domain.Member;
import com.gyu.practice.member.service.memberServiceinter;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private memberServiceinter memberService;
	
	@RequestMapping(value="/gyu/home", method = RequestMethod.GET)
	public String communityView() {
		return "home";
	}
	
	@RequestMapping(value="/gyu/registerMemberView", method = RequestMethod.GET)
	public String registerMemberView() {
		return "member/registerMember";
	}
	
	
	
	/**
	 * 회원가입
	 * @param mv
	 * @param member
	 * @return
	 */
	@RequestMapping(value="/gyu/registerMember", method = RequestMethod.POST)
	public ModelAndView registerMember(
			ModelAndView mv,
			@ModelAttribute Member member) {
		try {
			int result = memberService.registerMember(member);
			mv.setViewName("redirect:/");
		} catch (Exception e) {
			mv.addObject("msg", e.getMessage());
			mv.setViewName("common/errorPage");
		}
		
		return mv;
	}
	
	/**
	 * 로그인
	 * @param mv
	 * @param id
	 * @param pw
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/gyu/loginUser", method = RequestMethod.POST)
	public ModelAndView loginUser(
			ModelAndView mv,
			@RequestParam("id") String id,
			@RequestParam("pw") String pw,
			HttpServletRequest request) {
		try {
			Member member = new Member(id, pw);
			Member loginUser = memberService.loginMember(member);
			if(loginUser != null) {
				HttpSession session = request.getSession();
				session.setAttribute("loginUser", loginUser);
				mv.setViewName("redirect:/");
			}else {
				mv.addObject("msg","회원정보없음");
				mv.setViewName("commmon.errorPage");
			}
		} catch (Exception e) {
			mv.addObject("msg", e.getMessage());
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
	/**
	 * 로그아웃
	 * @param mv
	 * @param request
	 * @return
	 */
	@RequestMapping(value="gyu/logout", method = RequestMethod.GET)
	public ModelAndView logOut(ModelAndView mv, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		if(session != null) {
			session.invalidate();
			mv.setViewName("redirect:/");
		}else {
			mv.addObject("msg", "로그아웃 실패");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
}
