package com.example.demo;

import java.nio.file.Paths;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;

public class ConnectDatabase {

	/*
	 * private static final String ASTRA_DB_ID = "WRwZePvtSEWtlAIupndZFDBZ"; private
	 * static final String ASTRA_DB_SECRET =
	 * "l_FX-C8KuiybmZhPd2Z6AFUXuxUteDrfZnjd0bL.LxLrWCfr_yIgYZT,p4igQABl3v7E935X7HmJPJgLtTbZY6Hh723aiPc.ZC_JZkwG5J67xBcB.9PCK0UJn4G5l842";
	 * private static final String ASTRA_TOKEN =
	 * "AstraCS:WRwZePvtSEWtlAIupndZFDBZ:8b822b220b9bad39d0642f2768b2eda328973ab130a1a853b32ec53f4cc97995";
	 * private static final String ASTRA_KEYSPACE = "certifieddepositdemo";
	 * 
	 * CqlSession session = null;
	 * 
	 * public void connect() { session = CqlSession.builder()
	 * .withCloudSecureConnectBundle(Paths.get(
	 * "C:\\Users\\2314036\\Downloads\\secure-connect-demo.zip"))
	 * .withAuthCredentials(ASTRA_DB_ID, ASTRA_DB_SECRET).build(); }
	 * 
	 * public String getValue(int key) {
	 * 
	 * if (session == null) { connect(); }
	 * 
	 * String value = ""; ResultSet rs =
	 * session.execute("select name from certifieddepositdemo.test"); Row row =
	 * rs.one(); if (row != null) { value = row.getString("name"); } else {
	 * System.out.println("An Error Occured"); }
	 * 
	 * return value; }
	 */

}
