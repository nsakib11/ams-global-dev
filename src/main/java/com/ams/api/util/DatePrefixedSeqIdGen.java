package com.ams.api.util;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.type.LongType;
import org.hibernate.type.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DatePrefixedSeqIdGen a class to generate unique id using database Sequence
 * and prefix.
 * <p>
 * Prefix can be changed using DATE_FORMAT_PARAMETER. Sequence is 18 digit long
 * YYMMddHHmm + %08d (Sequence_From_Database).
 * </p>
 * 
 * @see public Serializable generate(SharedSessionContractImplementor session,
 *      Object object)
 * @see public void configure(Type type, Properties params, ServiceRegistry
 *      serviceRegistry)
 * @see SequenceStyleGenerator
 * 
 */
public class DatePrefixedSeqIdGen extends SequenceStyleGenerator {

	private static final Logger logger = LoggerFactory.getLogger(DatePrefixedSeqIdGen.class);

	public static final String DATE_FORMAT_PARAMETER = "dateFormat";
	public static final String DATE_FORMAT_DEFAULT = "YYMMddHHmm";

	public static final String NUMBER_FORMAT_PARAMETER = "numberFormat";
	public static final String NUMBER_FORMAT_DEFAULT = "%08d";

	private String dateFormat;
	private String numberFormat;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		final String formatYearDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateFormat));
		final String sequence = String.format(numberFormat, super.generate(session, object));
		logger.debug("DatePrefixedSeqIdGen formatYearDate : {}", formatYearDate);
		logger.debug("DatePrefixedSeqIdGen sequence : {}", sequence);
		return Long.valueOf(formatYearDate + sequence);
	}

	@Override
	public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
//		super.configure(LongType.INSTANCE, params, serviceRegistry);
		dateFormat = ConfigurationHelper.getString(DATE_FORMAT_PARAMETER, params, DATE_FORMAT_DEFAULT);
		numberFormat = ConfigurationHelper.getString(NUMBER_FORMAT_PARAMETER, params, NUMBER_FORMAT_DEFAULT);
	}
}