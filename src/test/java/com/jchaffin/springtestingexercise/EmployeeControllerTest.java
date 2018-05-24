package com.jchaffin.springtestingexercise;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class EmployeeControllerTest {

	@InjectMocks
	private EmployeeController underTest;

	@Mock
	private EmployeeRepository employeeRepo;

	@Mock
	private Employee employee;

	@Mock
	private Employee secondEmployee;

	@Mock
	private Model model;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldAddEmployeeToModel() {
		long employeeId = 1;
		when(employeeRepo.findById(employeeId)).thenReturn(Optional.of(employee));
		underTest.findOneEmployee(employeeId, model);
		verify(model).addAttribute("employees", employee);
	}

}
