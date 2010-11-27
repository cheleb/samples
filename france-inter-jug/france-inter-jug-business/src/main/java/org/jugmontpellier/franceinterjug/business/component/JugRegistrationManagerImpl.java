package org.jugmontpellier.franceinterjug.business.component;

import javax.inject.Inject;

import org.jugmontpellier.franceinterjug.business.AlreadyRegisteredExeption;
import org.jugmontpellier.franceinterjug.business.JugRegistrationManager;
import org.jugmontpellier.franceinterjug.store.Jug;
import org.jugmontpellier.franceinterjug.store.JugUser;
import org.jugmontpellier.franceinterjug.store.dao.JugDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 * A Jug Manager.
 * 
 * @author chelebithil
 * 
 */
public class JugRegistrationManagerImpl implements JugRegistrationManager {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jugmontpellier.franceinterjug.business.component.JugRegistrationManager
	 * #registrer(org.jugmontpellier.franceinterjug.store.JugUser,
	 * org.jugmontpellier.franceinterjug.store.Jug)
	 */

	@Inject
	private JugDAO jugDAO;

	@Transactional
	@Override
	public void register(JugUser jugUser, Jug jug) throws AlreadyRegisteredExeption {

		if (jug.getJugusers().contains(jugUser)) {
			throw new AlreadyRegisteredExeption();
		} else {
			jugDAO.addJugUser(jug, jugUser);
		}
	}

}
