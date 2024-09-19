package com.ams.api.service.impl;

import java.util.List;

import com.ams.api.entity.GLConfigDetail;
import com.ams.api.service.CacheService;
import com.ams.api.service.GLConfigDetailCacheService;
import com.ams.api.util.GlobalConstant;
import com.ams.api.util.SessionMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class GLConfigDetailCacheServiceImpl /*implements GLConfigDetailCacheService*/ {

	/*private static final Logger logger = LoggerFactory.getLogger(GLConfigDetailCacheServiceImpl.class);

	private List<GLConfigDetail> entities;

	@Autowired
	private CacheService cacheService;

	public void init() {
		entities = cacheService.findGLConfigDetail("all");
	}

	@Override
	public GLConfigDetail findByAppVersionAndPlatformAndFlagActive(String appVersion, String platform,
			Boolean flagActive) {

		long startTime = System.currentTimeMillis();
		init();
		logger.info("find by {} {} {}", appVersion, platform, flagActive);

		for (GLConfigDetail entity : entities) {

			if (entity.getAppVersion().equals(appVersion) && entity.getFlagActive().equals(flagActive)) {
				GLConfigDetail detail = entity;
				SessionMap.addContext(GlobalConstant.KEY_MAP_MESSAGE, "Cache findByAppVersionAndFlagActive", startTime);
				return detail;
			}
		}
		SessionMap.addContext(GlobalConstant.KEY_MAP_MESSAGE, "Cache findByAppVersionAndFlagActive", startTime);
		return null;
	}*/
}
