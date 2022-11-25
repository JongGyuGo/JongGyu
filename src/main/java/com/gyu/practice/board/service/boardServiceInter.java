package com.gyu.practice.board.service;

import java.util.List;

import com.gyu.practice.board.domain.Board;

public interface boardServiceInter {

	int writeBoard(Board board);

	List<Board> boardList();

	int boardCount();

	Board boardDetail(Integer boardNo);

}
