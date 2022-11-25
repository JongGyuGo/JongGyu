package com.gyu.practice.board.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gyu.practice.board.domain.Board;

public interface boardStoreInter {

	int writeBoard(SqlSession session, Board board);

	List<Board> boardList(SqlSession session);

	int boardCount(SqlSession session);

	Board boardDetail(SqlSession session, Integer boardNo);

}
