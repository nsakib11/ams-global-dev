package com.ams.api.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.Cache;
import org.springframework.cache.interceptor.CacheErrorHandler;

public class RedisCacheErrorHandler implements CacheErrorHandler {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void handleCacheGetError(RuntimeException exception, Cache cache, Object key) {
		logger.warn("Unable to fetch the cache from Redis server. "
				+ "Check Redis server availability or disbale the Redis the redis cache from property.");
		logger.error("handleCacheGetError - " + exception.getMessage());
	}

	@Override
	public void handleCachePutError(RuntimeException exception, Cache cache, Object key, Object value) {
		logger.warn("unable to put the cache from Redis server. "
				+ "Check Redis server availability or disbale the Redis the redis cache from property.");
		logger.error("handleCachePutError" + exception.getMessage());

	}

	@Override
	public void handleCacheEvictError(RuntimeException exception, Cache cache, Object key) {
		logger.error("handleCacheEvictError" + exception.getMessage());
	}

	@Override
	public void handleCacheClearError(RuntimeException exception, Cache cache) {
		logger.error("handleCacheClearError" + exception.getMessage());
	}
}
