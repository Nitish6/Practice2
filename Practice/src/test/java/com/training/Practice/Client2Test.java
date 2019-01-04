package com.training.Practice;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.training.model.Client2;
import com.training.validator.ApiFieldError;

@RunWith(MockitoJUnitRunner.class)
public class Client2Test {
	/*
	@InjectMocks
	private Client2 client;*/

	private Validator validator;

	@Before
	public void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void shouldTestUserDept() {

		Client2 client = new Client2();
		
		client.setClientId(1);
		client.setClientName("");
		client.setClientDept("");
		Set<ConstraintViolation<Client2>> violations = validator.validate(client);
		
		System.out.println(violations.size());
		Assert.assertFalse(violations.isEmpty());
		Assert.assertEquals(2, 2);
	}

}
