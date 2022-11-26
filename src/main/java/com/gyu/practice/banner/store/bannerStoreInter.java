package com.gyu.practice.banner.store;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.gyu.practice.banner.domain.Banner;

public interface bannerStoreInter {

	int chkBanner(SqlSessionTemplate session, int bennerNo);

	int renewBanner(SqlSessionTemplate session, Banner banner);

	int registerBanner(SqlSessionTemplate session, Banner banner);

	Banner printOneBanner(SqlSessionTemplate session, int i);

	List<Banner> bannerList(SqlSessionTemplate session);

}
