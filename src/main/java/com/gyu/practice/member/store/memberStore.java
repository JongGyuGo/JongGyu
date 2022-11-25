package com.gyu.practice.member.store;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gyu.practice.member.domain.Member;

@Repository
public class memberStore implements memberStoreinter{

	@Override
	public int registerMember(SqlSession session, Member member) {
		int result = session.insert("MemberMapper.registerMember",member);
		return result;
	}

	@Override
	public Member loginMember(SqlSession session, Member member) {
		Member mOne = session.selectOne("MemberMapper.loginMember", member);
		return mOne;
	}

}
