package ClimaRepositorio;

import javax.persistence.EntityManager;

import Clima.Clima;

public class TesteBuscaPorIdComGetReference {
	public static void main(String args[]) {
		EntityManager manager = JPAUtil.getEntityManager();
		Clima c = manager.getReference(Clima.class, 1L);
		System.out.println(c);
		manager.close();
		JPAUtil.close();
	}
}
