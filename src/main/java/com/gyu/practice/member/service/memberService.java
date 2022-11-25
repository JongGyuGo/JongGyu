package com.gyu.practice.member.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyu.practice.member.domain.Member;
import com.gyu.practice.member.store.memberStoreinter;

@Service
public class memberService implements memberServiceinter{

	@Autowired
	SqlSession session;
	@Autowired
	memberStoreinter memberStore;
	
	@Override
	public int registerMember(Member member) {
		int result =  memberStore.registerMember(session, member);
		return result;
	}

	@Override
	public Member loginMember(Member member) {
		Member mOne = memberStore.loginMember(session, member);
		return mOne;
	}

}
