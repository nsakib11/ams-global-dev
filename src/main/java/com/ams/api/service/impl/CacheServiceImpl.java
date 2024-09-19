package com.ams.api.service.impl;

import java.util.List;

import com.ams.api.entity.GLConfigDetail;
import com.ams.api.repository.GLConfigDetailRepository;
import com.ams.api.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

//@Service
public class CacheServiceImpl /*implements CacheService*/ {

	/*@Autowired
	private GLConfigDetailRepository glConfigDetailRepository;

	@Cacheable(cacheNames = "glConfigDetailCache", key = "#key")
	@Override
	public List<GLConfigDetail> findGLConfigDetail(String key) {

		return glConfigDetailRepository.findAll();
	}*/
}
