package com.gyu.practice.member.store;

import org.apache.ibatis.session.SqlSession;

import com.gyu.practice.member.domain.Member;

public interface memberStoreinter {

	int registerMember(SqlSession session, Member member);

	Member loginMember(SqlSession session, Member member);

}
