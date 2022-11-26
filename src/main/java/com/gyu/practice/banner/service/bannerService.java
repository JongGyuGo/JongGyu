package com.gyu.practice.banner.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyu.practice.banner.domain.Banner;
import com.gyu.practice.banner.store.bannerStoreInter;

@Service
public class bannerService implements bannerServiceInter{

	@Autowired
	private bannerStoreInter bStore;
	
	private SqlSessionTemplate session;
	
	@Override
	public int chkBanner(int bennerNo) {
		int result = bStore.chkBanner(session, bennerNo);
		return result;
	}

	@Override
	public int renewBanner(Banner banner) {
		int result = bStore.renewBanner(session, banner);
		return result;
	}

	@Override
	public int registerBanner(Banner banner) {
		int result = bStore.registerBanner(session, banner);
		return result;
	}

	@Override
	public Banner printOneBanner(int i) {
		Banner oneBanner = bStore.printOneBanner(session, i);
		return oneBanner;
	}

	@Override
	public List<Banner> bannerList() {
		List<Banner> bList = bStore.bannerList(session);
		return bList;
	}

}
