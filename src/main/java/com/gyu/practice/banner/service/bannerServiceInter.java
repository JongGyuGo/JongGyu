package com.gyu.practice.banner.service;

import java.util.List;

import com.gyu.practice.banner.domain.Banner;

public interface bannerServiceInter {
	
	int chkBanner(int bennerNo);

	int renewBanner(Banner banner);

	int registerBanner(Banner banner);

	Banner printOneBanner(int i);

	List<Banner> bannerList();

}
