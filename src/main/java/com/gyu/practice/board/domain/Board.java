package com.gyu.practice.board.domain;

public class Board {

	private String boardNo;
	private String boardTitle;
	private String boardWiter;
	private String boardContent;
	private String boardDate;
	private String boardStatus;
	private String viewCount;
	
	public String getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardWiter() {
		return boardWiter;
	}
	public void setBoardWiter(String boardWiter) {
		this.boardWiter = boardWiter;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	public String getBoardStatus() {
		return boardStatus;
	}
	public void setBoardStatus(String boardStatus) {
		this.boardStatus = boardStatus;
	}
	public String getViewCount() {
		return viewCount;
	}
	public void setViewCount(String viewCount) {
		this.viewCount = viewCount;
	}
	
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardWiter=" + boardWiter
				+ ", boardContent=" + boardContent + ", boardDate=" + boardDate + ", boardStatus=" + boardStatus
				+ ", viewCount=" + viewCount + "]";
	}
	
}
