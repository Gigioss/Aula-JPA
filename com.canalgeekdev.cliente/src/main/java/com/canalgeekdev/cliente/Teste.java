package com.canalgeekdev.cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.canalgeekdev.cliente.model.Cliente;



public class Teste {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banco");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public static void main(String[] args) {
//		//delete
//		entityManager.getTransaction().begin();
//		int idCliente=8;
//		entityManager.createQuery("delete from Cliente c where id = :idCliente")
//				.setParameter("idCliente",idCliente)
//				.executeUpdate();
//		
//		entityManager.getTransaction().commit();
//		entityManager.close();

//		//Update
//		entityManager.getTransaction().begin();
//		int idCliente=1;
//		entityManager.createQuery("update from Cliente c set nome ='asd7' where c.id = :idCliente")
//				.setParameter("idCliente",idCliente)
//				.executeUpdate();
//		
//		entityManager.getTransaction().commit();
//		entityManager.close();
		
		//select
//		String jpql="select c from Cliente c";
//		TypedQuery<Cliente> typedQuery = entityManager.createQuery(jpql,Cliente.class);
//		List<Cliente> listaCliente= typedQuery.getResultList();
//		
//		for(Cliente cliente: listaCliente) {
//			System.out.println(cliente.getNome());
//		}
//		
//		
//		String jpql="select c from Cliente c where id= :idCliente";
//		int idCliente=10;
//		
//		TypedQuery<Cliente> typedQuery = entityManager
//				.createQuery(jpql,Cliente.class)
//				.setParameter("idCliente",idCliente);
//		List<Cliente> listaCliente= typedQuery.getResultList();
//		
//		for(Cliente cliente: listaCliente) {
//			System.out.println(cliente.getNome());
//		}
//		
//		
//		entityManager.close();
//		entityManagerFactory.close();
		
//		//Buscar
//	    Cliente cliente = entityManager.find(Cliente.class, 1);
//		System.out.println("Nome do cliente:" + cliente.getNome());
//		
//		//insert
//		Cliente cliente = new Cliente();
//		cliente.setNome("google");
//		
//		entityManager.getTransaction().begin();
//		entityManager.persist(cliente);
//		entityManager.getTransaction().commit();
	
//		//remove
//		Cliente cliente = entityManager.find(Cliente.class, 2);
//		entityManager.getTransaction().begin();
//		entityManager.remove(cliente);
//		entityManager.getTransaction().commit();
	
		
//		//modificar
//		Cliente cliente = new Cliente();
//		cliente.setId(1);
//		cliente.setNome("Face modifica");
//		
//		entityManager.getTransaction().begin();
//		entityManager.merge(cliente);
//		entityManager.getTransaction().commit();
		
		
	}
}
