package be.steformations.java_data.timesheets.dao.test;

import org.springframework.jdbc.core.JdbcTemplate;

import be.steformations.java_data.timesheets.service.TimesheetsDataService;


public class TestsFactory {
		
	public static TimesheetsDataService createTimesheetsDataService() {
		javax.sql.DataSource dataSource 
		= new org.springframework.jdbc.datasource.DriverManagerDataSource("jdbc:postgresql://localhost/timesheets", "postgres", "postgres");
		org.springframework.jdbc.core.JdbcTemplate jdbcTemplate
		= new org.springframework.jdbc.core.JdbcTemplate(dataSource);
		return new service.TimesheetsDataServiceImpl(jdbcTemplate);

	}
}
