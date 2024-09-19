package com.ams.api.service;

import com.ams.api.entity.GLConfigDetail;

public interface GLConfigDetailCacheService {

	public GLConfigDetail findByAppVersionAndPlatformAndFlagActive(String appVersion, String platform,
                                                                   Boolean flagActive);

}
