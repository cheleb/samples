package org.jugmontpellier.franceinterjug.store.dao;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.jugmontpellier.franceinterjug.store.Jug;

import org.jugmontpellier.franceinterjug.store.dao.JugDAO;
import org.springframework.transaction.annotation.Transactional;


/**
 * 
 * @generated
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/test-context.xml" })
public class JugDAOTestCase {

	/**
	 * Log4j logger.
	 * 
	 * @generated
	 */
	private static final Logger LOGGER = Logger.getLogger(JugDAO.class);

	/**
	 * Class under test.
	 * 
	 * @generated
	 */
	@Autowired
	JugDAO aJugDAO;

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
		LOGGER.info(aJugDAO.reads(idSet));

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
		LOGGER.info(aJugDAO.readWithRelations(1));

	}

	/**
	 * Get all test case.
	 * 
	 * @generated
	 */
	@Test
	public void testGetAll() {
		LOGGER.info("getAll()");
		LOGGER.info(aJugDAO.getAll());
	}

	/**
	 * Test the getList(a,b) method.
	 * 
	 * @generated
	 */
	@Test
	public void testGetList() {
		LOGGER.info("getList(0,10)");
		LOGGER.info(aJugDAO.getList(0, 10));
	}

	/**
	 * @generated
	 */
	@Test
	@Transactional
	public void testPersist() {
		LOGGER.info("persist()");
		Jug aJug = new Jug();
		aJug.setName("new str");
		aJugDAO.persist(aJug);
	}

	/**
	 * @generated Merge
	 */
	@Test
	public void testMerge() {
		LOGGER.info("merge()");
		Jug aJug = readOne();
		aJug.setName("new str");
		aJugDAO.merge(aJug);

	}

	/**
	 * @generated Refresh
	 */
	@Test
	@Transactional
	public void testRefresh() {
		LOGGER.info("refresh");
		Jug aJug = readOne();
		aJugDAO.refresh(aJug);

	}

	/**
	 * @generated Remove
	 */
	@Test
	@Transactional
	public void testRemove() {
		LOGGER.info("remove()");
		Jug aJug = readOne();

		aJugDAO.remove(aJug);

	}

	//
	// Private method that should be customized.
	//
	/**
	 * @generated
	 * 
	 */
	private Jug readOne() {
		return aJugDAO.read(1);
	}
}