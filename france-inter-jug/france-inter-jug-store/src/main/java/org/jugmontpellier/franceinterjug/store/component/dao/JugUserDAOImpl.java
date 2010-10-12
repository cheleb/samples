
      
package org.jugmontpellier.franceinterjug.store.component.dao;


import java.util.List;

import org.jugmontpellier.franceinterjug.store.JugUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;


import org.jugmontpellier.franceinterjug.store.dao.JugUserDAO;


/**
 * 
 * Dao for entity JugUser;
 * 
 */
@Component
public class JugUserDAOImpl implements JugUserDAO {
	/**
	 * EntityManager.
	 * 
	 * @generated
	 */
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Retrieve the list of JugUser
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<JugUser> getAll() {
		return entityManager
				.createQuery(
						"select p from org.jugmontpellier.franceinterjug.store.JugUser p order by p.id asc")
				.getResultList();
	}

	/**
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<JugUser> getList(int first, int max)

	{
		Query query = entityManager
				.createQuery("select p from JugUser p order by p.id");
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.getResultList();
	}

	/**
	 * 
	 * @generated
	 */
	public JugUser read(int id) {
		Query query = entityManager
				.createQuery("select p from org.jugmontpellier.franceinterjug.store.JugUser p where p.id = :id");
		query.setParameter("id", id);
		return (JugUser) query.getSingleResult();
	}

	/**
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<JugUser> reads(List<Integer> id) {
		Query query = entityManager
				.createQuery("select p from org.jugmontpellier.franceinterjug.store.JugUser p where p.id IN( :id )");
		query.setParameter("id", id);
		return (List<JugUser>) query.getResultList();
	}

	/**
	 * 
	 * @generated
	 */
	public JugUser readWithRelations(int id) {
		Query query = entityManager
				.createQuery("select p from org.jugmontpellier.franceinterjug.store.JugUser p  left join fetch p.jugs r0 where p.id = :id");
		query.setParameter("id", id);
		return (JugUser) query.getSingleResult();
	}

	/**
	 * Persist entity.
	 * 
	 * @generated
	 */
	public void persist(JugUser jugUser) {
		entityManager.persist(jugUser);
	}

	/**
	 * 
	 * @generated
	 */
	public void merge(JugUser jugUser) {
		entityManager.merge(jugUser);
	}

	/**
	 * 
	 * @generated
	 */

	public void refresh(JugUser jugUser) {
		entityManager.refresh(jugUser);
	}

	/**
	 * 
	 * @generated
	 */
	public void remove(JugUser jugUser) {
		entityManager.remove(jugUser);
	}

}

