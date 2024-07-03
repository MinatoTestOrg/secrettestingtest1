package com.minatogithuborg.secrettestingtest1.config;

import com.vs.rappit.sql.BaseSqlDal;
import com.vs.rappit.gcp.bq.BaseGCPBQDal;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import com.vs.rappit.gcs.CloudStorage;
import com.vs.rappit.base.factory.StorageFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration; 

import com.vs.rappit.base.dal.providers.PersistenceType;

@AutoConfiguration
public class ApplicationRepositoriesAutoConfiguration {

private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationRepositoriesAutoConfiguration .class);

	
	@Autowired
	private BaseSqlDal<?> baseSQLDal;	
	@Autowired
	private BaseGCPBQDal<?> baseGcpBqDal;
	
	@Bean("DB")
	public BaseSqlDal<?> dbRepository() {
		LOGGER.info("Entering registerSQLProvider ...");
		return baseSQLDal;
	}
	@Bean("SEARCH")
	public BaseSqlDal<?> searchRepository() {
		LOGGER.info("Entering registerSQLSearchProvider ...");
		return baseSQLDal;
	}
	@Bean("ANALYTICAL")
	public BaseGCPBQDal<?> analyticalRepository() {
		LOGGER.info("Entering registeringProvider ...");
		return baseGcpBqDal;
	}
}
