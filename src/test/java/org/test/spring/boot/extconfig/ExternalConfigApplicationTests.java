package org.test.spring.boot.extconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ExternalConfigApplication.class)
public class ExternalConfigApplicationTests {
	@Value("${dataSource:unknown}")
	private String dataSource;

	@Test
	public void testConfigLocation() {
		assertThat(dataSource, equalTo("testing"));
	}
}
