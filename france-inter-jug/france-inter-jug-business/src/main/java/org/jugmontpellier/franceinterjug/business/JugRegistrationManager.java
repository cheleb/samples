package org.jugmontpellier.franceinterjug.business;

import org.jugmontpellier.franceinterjug.store.Jug;
import org.jugmontpellier.franceinterjug.store.JugUser;

public interface JugRegistrationManager {

	public void register(JugUser jugUser, Jug jug) throws AlreadyRegisteredExeption;

}