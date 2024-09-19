package com.ams.api.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

//import javax.jms.ConnectionFactory;

/*@Configuration
@EnableJms*/
public class JmsQueueConfig {

	/*private static final Logger LOGGER = LoggerFactory.getLogger(JmsQueueConfig.class);

	@Autowired
	private AsyncJmsConfig asyncAuditConfig;

	@Bean
	public ConnectionFactory activeMQConnectionFactory() {
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
		factory.setBrokerURL(asyncAuditConfig.getQueueBrokerUrl());
		factory.setSendTimeout(asyncAuditConfig.getQueueTimeout());
		factory.setCloseTimeout(asyncAuditConfig.getQueueTimeout());
		factory.setConnectResponseTimeout(asyncAuditConfig.getQueueTimeout());
		factory.setTrustAllPackages(true);
		LOGGER.info("Register JMS ConnectionFactory {}", asyncAuditConfig.getQueueBrokerUrl());
		return factory;
	}

	@Bean
	@Primary
	public ConnectionFactory cachingConnectionFactory() {
		CachingConnectionFactory factory = new CachingConnectionFactory();
		factory.setSessionCacheSize(asyncAuditConfig.getQueueSessionCacheSize());
		factory.setTargetConnectionFactory(activeMQConnectionFactory());
		return factory;
	}

	@Bean
	public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		factory.setConnectionFactory(cachingConnectionFactory());
		factory.setConcurrency(asyncAuditConfig.getQueueConcurrency());
		factory.setMessageConverter(jacksonJmsMessageConverter());
		LOGGER.info("Register JMS DefaultJmsListenerContainerFactory {}", asyncAuditConfig.getQueueConcurrency());
		return factory;
	}

	@Bean
	public JmsTemplate jmsTemplate() {
		LOGGER.info("Register JMS JmsTemplate..");
		JmsTemplate template = new JmsTemplate();
		template.setMessageConverter(jacksonJmsMessageConverter());
		template.setConnectionFactory(cachingConnectionFactory());
		return template;
	}

	// Serialize message content to json using TextMessage
	@Bean
	public MessageConverter jacksonJmsMessageConverter() {
		MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
		converter.setTargetType(MessageType.TEXT);
		converter.setTypeIdPropertyName("_type");
		return converter;
	}*/
}

