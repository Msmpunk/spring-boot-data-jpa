package com.myapp.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.myapp.springboot.app.models.entity.Cliente;


@Repository
public class ClienteDaoImpl implements IClienteDao {
	
	
	private EntityManager em;
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
