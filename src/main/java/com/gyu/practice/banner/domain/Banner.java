package com.gyu.practice.banner.domain;

public class Banner {

	private int bennerNo;
	private String bennerPath;
	private String bennerFileName;
	private String bennerFileRename;
	private String bennerMsg;
	private String bennerLink;
	private String writer;
	
	public int getBennerNo() {
		return bennerNo;
	}
	public void setBennerNo(int bennerNo) {
		this.bennerNo = bennerNo;
	}
	public String getBennerPath() {
		return bennerPath;
	}
	public void setBennerPath(String bennerPath) {
		this.bennerPath = bennerPath;
	}
	public String getBennerFileName() {
		return bennerFileName;
	}
	public void setBennerFileName(String bennerFileName) {
		this.bennerFileName = bennerFileName;
	}
	public String getBennerFileRename() {
		return bennerFileRename;
	}
	public void setBennerFileRename(String bennerFileRename) {
		this.bennerFileRename = bennerFileRename;
	}
	public String getBennerMsg() {
		return bennerMsg;
	}
	public void setBennerMsg(String bennerMsg) {
		this.bennerMsg = bennerMsg;
	}
	public String getBennerLink() {
		return bennerLink;
	}
	public void setBennerLink(String bennerLink) {
		this.bennerLink = bennerLink;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "banner [bennerNo=" + bennerNo + ", bennerPath=" + bennerPath + ", bennerFileName=" + bennerFileName
				+ ", bennerFileRename=" + bennerFileRename + ", bennerMsg=" + bennerMsg + ", bennerLink=" + bennerLink
				+ ", writer=" + writer + "]";
	}
	
}
