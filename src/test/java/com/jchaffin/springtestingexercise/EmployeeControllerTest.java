package com.jchaffin.springtestingexercise;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class EmployeeControllerTest {

	@InjectMocks
	private EmployeeController underTest;

	@Mock
	private EmployeeRepository employeeRepo;

	@Mock
	private Employee employee;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldAddEmployeeToModel() {
		long employeeId = 1;
		when()
		fail("Not yet implemented");
	}

}
