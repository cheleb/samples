package org.jugmontpellier.franceinterjug.store.dao;

import java.util.List;

import org.jugmontpellier.franceinterjug.store.JugUser;

/**
 * 
 * Dao for entity JugUser;
 * 
 */
public interface JugUserDAO {
	/**
	 * Retrieve the list of JugUser
	 * 
	 * @generated
	 */
	public List<JugUser> getAll();

	/**
	 * 
	 * @generated
	 */
	public List<JugUser> getList(int first, int max)

	;

	/**
	 * 
	 * @generated
	 */
	public JugUser read(int id);

	/**
	 * 
	 * @generated
	 */
	public List<JugUser> reads(List<Integer> id);

	/**
	 * 
	 * @generated
	 */
	public JugUser readWithRelations(int id);

	/**
	 * Persist entity.
	 * 
	 * @generated
	 */
	public void persist(JugUser jugUser);

	/**
	 * 
	 * @generated
	 */
	public void merge(JugUser jugUser);

	/**
	 * 
	 * @generated
	 */

	public void refresh(JugUser jugUser);

	/**
	 * 
	 * @generated
	 */
	public void remove(JugUser jugUser);

}
