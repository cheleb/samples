package org.jugmontpellier.franceinterjug.store.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerf {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring/test-context.xml");
		JugDAOPerf jugDAO = applicationContext.getBean(JugDAOPerf.class);
		
		jugDAO.test1();
//		long s = System.currentTimeMillis();
//		jugDAO.test1();
//		System.out.println("1:" + (System.currentTimeMillis() - s) + " ms");
//		jugDAO.test1000();
//		System.out.println("1000:" +(System.currentTimeMillis() - s) + " ms");
//		jugDAO.test1000x1();
//		System.out.println("1000x1:" +(System.currentTimeMillis() - s) + " ms");
		
	}
	
}
