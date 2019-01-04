package com.training.Practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.stubbing.answers.DoesNothing;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.KeyHolder;

import com.training.model.Client2;
import com.training.springboot.dao.ClientDaoImpl2;

@RunWith(MockitoJUnitRunner.class)
public class ClientDaoImpl2Test {

	@InjectMocks
	private ClientDaoImpl2 clientDaoImpl2;

	@Mock
	private JdbcTemplate jdbcTemplate;

	private final String INSERT_SQL = "INSERT INTO CLIENTSS(clientname, clientdept) values(?,?)";
	private final String GET_ALL_CLIENTS = "SELECT * FROM CLIENTSS";
	private final String GET_REQUIRED_CLIENT_SQL = "SELECT * FROM CLIENTSS WHERE clientid = ?";


	@Test
	public void shouldAddCLient(){
		Mockito.doNothing().when(jdbcTemplate).update(INSERT_SQL, getClient().getClientName(), getClient().getClientDept());
		clientDaoImpl2.addClient(getClient());
		Mockito.verify(jdbcTemplate).update(INSERT_SQL, getClient().getClientName(), getClient().getClientDept());
	}

	
	@Mock
	private KeyHolder keyHolder;
	
	@Mock
	private JdbcTemplate jdbcTemplat;
	
	@Mock
	private Connection connection;
	
/*	
	@Test
	public void shouldAddFeedback(){
		
		when(jdbcTemplate).update(PreparedStatementCreator creater = new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException { 
                  PreparedStatement ps = connection.prepareStatement(FEEDBACK_INSERT_QUERY, new String[] {"id"});// Statement.RETURN_GENERATED_KEYS
                  ps.setString(1, feedback.getSource());
                  ps.setInt(2,  feedback.getRating()); 
                  ps.setString(3, feedback.getDescription());
                  ps.setString(4, feedback.getUserName());

                  return ps; 
            }, keyHolder ).thenReturn(1);
		
     }
*/
		
	
	private Client2 getClient(){
		Client2 client2 = new Client2();
		client2.setClientId(1);
		client2.setClientName("xyz");
		client2.setClientDept("depart");

		return client2;
	}
}
