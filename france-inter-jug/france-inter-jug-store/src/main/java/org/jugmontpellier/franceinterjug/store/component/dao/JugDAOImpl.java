
      
package org.jugmontpellier.franceinterjug.store.component.dao;


import java.util.List;

import org.jugmontpellier.franceinterjug.store.Jug;
import org.jugmontpellier.franceinterjug.store.JugUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;


import org.jugmontpellier.franceinterjug.store.dao.JugDAO;


/**
 * 
 * Dao for entity Jug;
 * 
 */
@Component
public class JugDAOImpl implements JugDAO {
	/**
	 * EntityManager.
	 * 
	 * @generated
	 */
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Retrieve the list of Jug
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Jug> getAll() {
		return entityManager
				.createQuery(
						"select p from org.jugmontpellier.franceinterjug.store.Jug p order by p.id asc")
				.getResultList();
	}

	/**
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Jug> getList(int first, int max)

	{
		Query query = entityManager
				.createQuery("select p from Jug p order by p.id");
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.getResultList();
	}

	/**
	 * 
	 * @generated
	 */
	public Jug read(int id) {
		Query query = entityManager
				.createQuery("select p from org.jugmontpellier.franceinterjug.store.Jug p where p.id = :id");
		query.setParameter("id", id);
		return (Jug) query.getSingleResult();
	}

	/**
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Jug> reads(List<Integer> id) {
		Query query = entityManager
				.createQuery("select p from org.jugmontpellier.franceinterjug.store.Jug p where p.id IN( :id )");
		query.setParameter("id", id);
		return (List<Jug>) query.getResultList();
	}

	/**
	 * 
	 * @generated
	 */
	public Jug readWithRelations(int id) {
		Query query = entityManager
				.createQuery("select p from org.jugmontpellier.franceinterjug.store.Jug p  left join fetch p.jugusers r0 where p.id = :id");
		query.setParameter("id", id);
		return (Jug) query.getSingleResult();
	}

	/**
	 * Persist entity.
	 * 
	 * @generated
	 */
	public void persist(Jug jug) {
		entityManager.persist(jug);
	}

	/**
	 * 
	 * @generated
	 */
	public void merge(Jug jug) {
		entityManager.merge(jug);
	}

	/**
	 * 
	 * @generated
	 */

	public void refresh(Jug jug) {
		entityManager.refresh(jug);
	}

	/**
	 * 
	 * @generated
	 */
	public void remove(Jug jug) {
		entityManager.remove(jug);
	}

	@Override
	public void addJugUser(Jug jug, JugUser jugUser) {

		jug.addToJugusers(jugUser);
		
	}

}

