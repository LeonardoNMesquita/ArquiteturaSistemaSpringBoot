package ClimaRepositorio;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Clima.Clima;

public class TesteAtualizaPrevisao {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Clima c = manager.find(Clima.class, 1L);
		c.setDescricao("céu claro e ensolarado");
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
