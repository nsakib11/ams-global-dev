package com.ams.api.dbutil;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.object.StoredProcedure;

public class Procedure extends StoredProcedure {

	public Procedure(DataSource dataSource, String name) {
		super(dataSource, name);
		setFunction(false);
	}
	
	public Procedure(JdbcTemplate jdbcTemplate, String name) {
		super(jdbcTemplate, name);
		setFunction(false);
	}

}
