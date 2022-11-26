package com.gyu.practice.banner.store;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.gyu.practice.banner.domain.Banner;

@Repository
public class bannerStore implements bannerStoreInter{

	@Override
	public int chkBanner(SqlSessionTemplate session, int bennerNo) {
		int result = session.selectOne("BannerMapper.chkBanner", bennerNo);
		return result;
	}

	@Override
	public int renewBanner(SqlSessionTemplate session, Banner banner) {
		int result = session.update("BannerMapper, updateBanner", banner);
		return result;
	}

	@Override
	public int registerBanner(SqlSessionTemplate session, Banner banner) {
		int result = session.insert("BannerMapper.registerBanner", banner);
		return result;
	}

	@Override
	public Banner printOneBanner(SqlSessionTemplate session, int i) {
		Banner oneBanner = session.selectOne("BannerMapper.printOneBanner", i);
		return oneBanner;
	}

	@Override
	public List<Banner> bannerList(SqlSessionTemplate session) {
		List<Banner> bList = session.selectList("BannerMapper.bannerList");
		return bList;
	}

}
