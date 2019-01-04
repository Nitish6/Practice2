/*package com.training.Practice;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.training.model.Client;
import com.training.springboot.dao.ClientDaoImpl;

@RunWith(MockitoJUnitRunner.class)
public class ClientDaoTest {

	@InjectMocks
	private ClientDaoImpl clientDao;

	@Mock
	private EntityManager entityManager;

	private Client client = new Client();

	@Test
	public void shouldAddClient(){
		client.setClientId(1);
		client.setClientName("xyz");
		client.setClientDept(22);

		doNothing().when(entityManager).persist(client);
		clientDao.addClient(client);
		verify(entityManager).persist(client);
	}
}
*/