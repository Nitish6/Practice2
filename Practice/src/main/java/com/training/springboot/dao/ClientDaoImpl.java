/*package com.training.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.training.model.Client;
import com.training.springboot.iDao.ClientDao;

@Repository
public class ClientDaoImpl implements ClientDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void addClient(Client client) {
		entityManager.persist(client);
	}

	@Override
	public List<Client> getAllClients() {
		return entityManager.createQuery("from Client").getResultList();
	}

}
*/