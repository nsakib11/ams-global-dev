package com.ams.api.dbutil;

import java.sql.SQLException;
import java.sql.Types;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlInOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Component;

//@Component
public class ProcedureExecutor {

	/*@Autowired
	private DataSource dataSource;

    @Autowired
    @Qualifier("primaryJdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	public Map<?, ?> execute() throws SQLException {

		Procedure myStoredProcedure = new Procedure(dataSource, "proc_test");
		// Procedure myStoredProcedure = new Procedure(jdbcTemplate, "proc_test");

		System.err.println(dataSource.getConnection().getSchema());

		SqlParameter fNameParam = new SqlParameter("firstname", Types.VARCHAR);
		SqlParameter lNameParam = new SqlParameter("lastname", Types.VARCHAR);
		SqlInOutParameter msgParam = new SqlInOutParameter("message", Types.VARCHAR);

		SqlParameter[] paramArray = { fNameParam, lNameParam, msgParam };

		myStoredProcedure.setParameters(paramArray);
		myStoredProcedure.compile();

		Map<String, Object> ss = myStoredProcedure.execute("FirstNameValue", "LastNameValue", "");
		System.err.println(ss);
		return ss;
	}*/
}
