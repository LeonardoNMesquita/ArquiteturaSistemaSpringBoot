package ClimaRepositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Clima.Clima;

public class TesteListaTodosJPQL {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Clima");
		List<Clima>climas = query.getResultList();
		for(Clima c : climas) {
			System.out.println(c);
		}
		manager.close();
		JPAUtil.close();
	}

}
