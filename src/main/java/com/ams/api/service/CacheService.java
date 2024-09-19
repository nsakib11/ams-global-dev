package com.ams.api.service;

import java.util.List;

import com.ams.api.entity.GLConfigDetail;

public interface CacheService {

	public List<GLConfigDetail> findGLConfigDetail(String key);

}
