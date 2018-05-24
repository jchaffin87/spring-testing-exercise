package com.jchaffin.springtestingexercise;

import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class JpaMappingsTest {

	@Resource
	private TestEntityManager entityManager;

	@Resource
	private EmployeeRepository employeeRepo;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldSaveAndLoadEmployee() {
		Employee employee = employee.save(new Employee("name"));

		entityManager.persist(employee);
		entityManager.flush();
		entityManager.clear();

		assertThat(employee.getName(), is("name"));
	}

}
