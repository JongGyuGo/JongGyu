package com.gyu.practice.board.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gyu.practice.board.domain.Board;

@Repository
public class boardStore implements boardStoreInter{

	
	@Override
	public int writeBoard(SqlSession session, Board board) {
		int result = session.insert("BoardMapper.writeBoard", board);
		return result;
	}

	@Override
	public List<Board> boardList(SqlSession session) {
		List<Board> bList = session.selectList("BoardMapper.boardList");
		return bList;
	}

	@Override
	public int boardCount(SqlSession session) {
		int result = session.selectOne("BoardMapper.boardCount");
		return result;
	}

	@Override
	public Board boardDetail(SqlSession session, Integer boardNo) {
		Board board = session.selectOne("BoardMapper.boardDetail", boardNo);
		return board;
	}

}
