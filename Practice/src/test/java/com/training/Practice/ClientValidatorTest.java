/*package com.training.Practice;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.validation.Errors;

import com.training.model.Client2;
import com.training.validator.ClientValidator;

@RunWith(MockitoJUnitRunner.class)  
public class ClientValidatorTest {

	@InjectMocks
	private ClientValidator clientValidator;
	
	@Mock
	private Errors errors;
	
	private Object getClient(){
		Client2 client = new Client2();
		client.setClientName("naaame");
		client.setClientDept("depppt");
		
		return client;
	}
	
	public void shouldShowErrorIfFirstThreeCharactersAreNotAlphabetic(){
		
		Client2 cl = (Client2)getClient();
		Mockito.when(cl.getClientName().matches("^[ A-Za-z ][ A-Za-z ][ A-Za-z ][0-9]*$")).thenReturn(true);
		
		clientValidator.validate(getClient(), errors);
		
		
	}
}
*/