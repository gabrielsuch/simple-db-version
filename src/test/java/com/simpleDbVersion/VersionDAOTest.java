package com.simpleDbVersion;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;

import com.simpleDbVersion.infra.VersionDAO;

public class VersionDAOTest {

	@Test
	public void installNoVersionYet() {
//		JdbcTemplate jdbcTemplate = Mockito.mock(JdbcTemplate.class);
//
//		VersionDAO versionDAO = new VersionDAO(jdbcTemplate);
//		Mockito.when(jdbcTemplate.queryForLong("SELECT MAX(INSTALL_DATE) FROM DB_VERSION")).thenReturn(-10l);
//		
//		Assert.assertEquals(new Long(0), versionDAO.currentVersionNumber());
		
	}
	
}
