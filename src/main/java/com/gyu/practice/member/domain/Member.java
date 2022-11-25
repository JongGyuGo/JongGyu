package com.gyu.practice.member.domain;

public class Member {
	private String name;
	private String id;
	private String pw;
	private String nick;
	private String phone;
	
	public Member(String memberId, String memberPw) {
		super();
		this.id = memberId;
		this.pw = memberPw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", pw=" + pw + ", nick=" + nick + ", phone=" + phone + "]";
	}

}
