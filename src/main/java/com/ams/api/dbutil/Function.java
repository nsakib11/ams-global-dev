package com.ams.api.dbutil;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.object.StoredProcedure;

public class Function extends StoredProcedure {
	public Function(DataSource dataSource, String name) {
		super(dataSource, name);
		setFunction(true);
	}

	public Function(JdbcTemplate jdbcTemplate, String name) {
		super(jdbcTemplate, name);
		setFunction(true);
	}

}
