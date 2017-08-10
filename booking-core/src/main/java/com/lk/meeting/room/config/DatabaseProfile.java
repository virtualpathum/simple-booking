package com.lk.meeting.room.config;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("sample")
public class DatabaseProfile {
	
	public static final String jndiNamespace = "java:comp/env/jdbc/meeting-room";
	
	@Bean(initMethod = "init", destroyMethod = "close")
	public DataSource dataSource() throws NamingException {
		Context ctx = new InitialContext();
		return (DataSource) ctx.lookup(jndiNamespace);
	}

}
