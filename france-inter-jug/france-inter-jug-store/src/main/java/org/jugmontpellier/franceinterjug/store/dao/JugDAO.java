
package org.jugmontpellier.franceinterjug.store.dao;


import java.util.List;

import org.jugmontpellier.franceinterjug.store.Jug;
import org.jugmontpellier.franceinterjug.store.JugUser;



/**
 * 
 * Dao for entity Jug;
 * 
 */
public interface JugDAO  {
	/**
	 * Retrieve the list of Jug
	 * 
	 * @generated
	 */
	public List<Jug> getAll();

	/**
	 * 
	 * @generated
	 */
	public List<Jug> getList(int first, int max)

	;

	/**
	 * 
	 * @generated
	 */
	public Jug read(int id);

	/**
	 * 
	 * @generated
	 */
	public List<Jug> reads(List<Integer> id);

	/**
	 * 
	 * @generated
	 */
	public Jug readWithRelations(int id);

	/**
	 * Persist entity.
	 * 
	 * @generated
	 */
	public void persist(Jug jug);

	/**
	 * 
	 * @generated
	 */
	public void merge(Jug jug);

	/**
	 * 
	 * @generated
	 */

	public void refresh(Jug jug);

	/**
	 * 
	 * @generated
	 */
	public void remove(Jug jug);

	/**
	 * Add a JugUser to a Jug.
	 * @param jug 
	 * @param jugUser
	 */
	public void addJugUser(Jug jug, JugUser jugUser);

}

