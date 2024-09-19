package com.ams.api.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class NgiAuthInterceptorConfig {

	/*private static final Logger logger = LoggerFactory.getLogger(NgiAuthInterceptorConfig.class);

	@Autowired
	private NgiAuthInterceptor accessFilter;

	@Bean
	public FilterRegistrationBean<NgiAuthInterceptor> greetingFilterRegistrationBean() {

		FilterRegistrationBean<NgiAuthInterceptor> registrationBean = new FilterRegistrationBean<NgiAuthInterceptor>();
		registrationBean.setName("accessFilter");
		registrationBean.setFilter(accessFilter);
		registrationBean.setOrder(2);
		registrationBean.setEnabled(true);
		logger.info("Access Filter Set Active to :{}", true);
		return registrationBean;
	}*/
}