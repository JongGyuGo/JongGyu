package com.gyu.practice.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyu.practice.board.domain.Board;
import com.gyu.practice.board.store.boardStoreInter;
@Service
public class boardService implements boardServiceInter {

	@Autowired
	private boardStoreInter bStore;
	@Autowired
	private SqlSession session;
	
	@Override
	public int writeBoard(Board board) {
		int result = bStore.writeBoard(session, board); 
		return result;
	}

	@Override
	public List<Board> boardList() {
		List<Board> bList = bStore.boardList(session);
		return bList;
	}

	@Override
	public int boardCount() {
		int result = bStore.boardCount(session);
		return result;
	}

	@Override
	public Board boardDetail(Integer boardNo) {
		Board board = bStore.boardDetail(session, boardNo);
		return board;
	}


}
