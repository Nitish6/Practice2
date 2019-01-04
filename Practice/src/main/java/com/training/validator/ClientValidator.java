/*package com.training.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.training.model.Client2;

public class ClientValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Client2.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {

		ValidationUtils.rejectIfEmpty(e, "clientDept", "clientName.empty", "invalid departmentss");

		Client2 client = (Client2)obj;

		if(!(client.getClientName().matches("[ 1-5 ]$")))
		{
			e.rejectValue("clientName","name can't be symbols");
		}
		
		
		if(!(client.getClientName().matches("^[ A-Za-z ][ A-Za-z ][ A-Za-z ][0-9]*$")))
		{
			e.rejectValue("clientName","name swsawe", "invalid");
		}
	}

}
*/