package com.ams.api.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class NgiAuditInterceptorConfig {

	/*private static final Logger logger = LoggerFactory.getLogger(NgiAuditInterceptorConfig.class);

	@Autowired
	private NgiAuditInterceptor auditFilter;

	@Value("${global.audit}")
	private Boolean globalAudit;

	@Bean
	public FilterRegistrationBean<NgiAuditInterceptor> auditFilterRegistrationBean() {

		FilterRegistrationBean<NgiAuditInterceptor> registrationBean = new FilterRegistrationBean<NgiAuditInterceptor>();
		registrationBean.setName("audit");
		registrationBean.setFilter(auditFilter);
		registrationBean.setOrder(1);
		registrationBean.setEnabled(globalAudit);
		logger.info("Audit Filter Set Active to :{}", globalAudit);
		return registrationBean;
	}*/
}
