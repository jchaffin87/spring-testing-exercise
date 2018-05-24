package com.jchaffin.springtestingexercise;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

	@Resource
	private EmployeeRepository employeeRepo;

	@RequestMapping("/employees")
	public String findAllEmployees(Model model) {
		model.addAttribute("employees", employeeRepo.findAll());
		return "employees";
	}

	@RequestMapping("/employee")
	public String findOneEmployee(@RequestParam(value = "id") Long empId, Model model) {
		Optional<Employee> employee = employeeRepo.findById(empId);

		if (employee.isPresent()) {
			model.addAttribute("employees", employee.get());
			return "employee";
		}
		return null;
	}

}
