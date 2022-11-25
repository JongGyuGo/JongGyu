package com.gyu.practice.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gyu.practice.board.domain.Board;
import com.gyu.practice.board.service.boardServiceInter;
import com.gyu.practice.member.domain.Member;

@Controller
public class boardController {

	@Autowired
	private boardServiceInter bService;
	
	
	
	/**
	 * 게시물 등록 페이지
	 * @return
	 */
	@RequestMapping(value="/board/writeBoardView", method = RequestMethod.GET)
	public ModelAndView writeBoardView(ModelAndView mv, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("loginUser");
		String memberId = member.getId();
		
		mv.addObject("memberId", memberId);
		mv.setViewName("board/writeBoard");
		return mv;
	}
	
	
	/**
	 * 게시물 등록
	 * @param mv
	 * @param board
	 * @return
	 */
	@RequestMapping(value="/board/writeBoard", method = RequestMethod.GET)
	public ModelAndView writeBoard(ModelAndView mv,@ModelAttribute Board board,HttpServletRequest request) {
		
		try {
			int result = bService.writeBoard(board);
			if(result > 0) {
				mv.setViewName("redirect:/board/freeboardView");
			}else {
				mv.addObject("msg", "게시물 등록 실패");
				mv.setViewName("common.errorPage");
			}
			
		} catch (Exception e) {
			mv.addObject("msg", e.getMessage());
			mv.setViewName("common.errorPage");
		}
		return mv;
	}
	
	@RequestMapping(value="/board/boardDetail", method = RequestMethod.GET)
	public ModelAndView boardDetailView(ModelAndView mv, @RequestParam("boardNo") Integer boardNo) {
		
		try {
			Board board = bService.boardDetail(boardNo);
			if(board != null) {
				mv.addObject("board", board);
				mv.setViewName("board/boardDetail");
			}
		} catch (Exception e) {

		}
		return mv;
	}
	
	
	/**
	 * 게시판 리스트
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/board/freeboardView", method = RequestMethod.GET)
	public ModelAndView freeboardView(ModelAndView mv) {
		List<Board> bList = bService.boardList();
		int boardCount = bService.boardCount();
		try {
			if(!bList.isEmpty()) {
				mv.addObject("bList", bList);
				mv.addObject("boardCount", boardCount);
				mv.setViewName("freeBoard");
			}else {
				mv.setViewName("freeBoard");
			}
		} catch (Exception e) {
			mv.addObject("msg", e.getMessage());
			mv.setViewName("common/errorPage");
		}
		return mv;
	}

}



