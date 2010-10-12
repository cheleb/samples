package org.jugmontpellier.franceinterjug.store.dao;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.jugmontpellier.franceinterjug.store.JugUser;

import org.jugmontpellier.franceinterjug.store.dao.JugUserDAO;
import org.springframework.transaction.annotation.Transactional;


/**
 * 
 * @generated
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/test-context.xml" })
public class JugUserDAOTestCase {

	/**
	 * Log4j logger.
	 * 
	 * @generated
	 */
	private static final Logger LOGGER = Logger.getLogger(JugUserDAO.class);

	/**
	 * Class under test.
	 * 
	 * @generated
	 */
	@Autowired
	JugUserDAO aJugUserDAO;

	/**
	 * @generated Test the read method.
	 */
	@Test
	public void testRead() {
		LOGGER.info("read()");
		LOGGER.info(readOne());
	}

	/**
	 * @generated Test the reads method.
	 */
	@org.junit.Test
	public void testReads() {
		LOGGER.info("reads()");

		List<Integer> idSet = new ArrayList<Integer>();
		idSet.add(1);
		idSet.add(2);
		LOGGER.info(aJugUserDAO.reads(idSet));

	}

	/**
	 * @generated Test the read method.
	 */
	@org.junit.Test
	public void testReadWithRelations() {
		LOGGER.info("readWithRelations()");
		List<Integer> idSet = new ArrayList<Integer>();
		idSet.add(1);
		idSet.add(2);
		LOGGER.info(aJugUserDAO.readWithRelations(1));

	}

	/**
	 * Get all test case.
	 * 
	 * @generated
	 */
	@Test
	public void testGetAll() {
		LOGGER.info("getAll()");
		LOGGER.info(aJugUserDAO.getAll());
	}

	/**
	 * Test the getList(a,b) method.
	 * 
	 * @generated
	 */
	@Test
	public void testGetList() {
		LOGGER.info("getList(0,10)");
		LOGGER.info(aJugUserDAO.getList(0, 10));
	}

	/**
	 * @generated
	 */
	@Test
	@Transactional
	public void testPersist() {
		LOGGER.info("persist()");
		JugUser aJugUser = new JugUser();
		aJugUser.setTitle("new str");
		aJugUser.setLastname("new str");
		aJugUser.setFirstname("new str");
		aJugUser.setEmail("new str");
		aJugUser.setLogin("new str");
		aJugUser.setPassword("new str");
		aJugUserDAO.persist(aJugUser);
	}

	/**
	 * @generated Merge
	 */
	@Test
	public void testMerge() {
		LOGGER.info("merge()");
		JugUser aJugUser = readOne();
		aJugUser.setTitle("new str");
		aJugUser.setLastname("new str");
		aJugUser.setFirstname("new str");
		aJugUser.setEmail("new str");
		aJugUser.setLogin("new str");
		aJugUser.setPassword("new str");
		aJugUserDAO.merge(aJugUser);

	}

	/**
	 * @generated Refresh
	 */
	@Test
	@Transactional
	public void testRefresh() {
		LOGGER.info("refresh");
		JugUser aJugUser = readOne();
		aJugUserDAO.refresh(aJugUser);

	}

	/**
	 * @generated Remove
	 */
	@Test
	@Transactional
	public void testRemove() {
		LOGGER.info("remove()");
		JugUser aJugUser = readOne();

		aJugUserDAO.remove(aJugUser);

	}

	//
	// Private method that should be customized.
	//
	/**
	 * @generated
	 * 
	 */
	private JugUser readOne() {
		return aJugUserDAO.read(1);
	}
}