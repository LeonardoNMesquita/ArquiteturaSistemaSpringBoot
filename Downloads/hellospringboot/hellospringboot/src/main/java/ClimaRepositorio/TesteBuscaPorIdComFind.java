package ClimaRepositorio;

import javax.persistence.EntityManager;

import Clima.Clima;

public class TesteBuscaPorIdComFind {
	public static void main(String args[]) {
		EntityManager manager = JPAUtil.getEntityManager();
		Clima c = manager.find(Clima.class, 1L);
		System.out.println(c);
		manager.close();
		JPAUtil.close();
	}
}
