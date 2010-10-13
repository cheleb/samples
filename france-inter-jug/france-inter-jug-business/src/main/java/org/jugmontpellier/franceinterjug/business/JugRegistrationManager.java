package org.jugmontpellier.franceinterjug.business;

import org.jugmontpellier.franceinterjug.store.Jug;
import org.jugmontpellier.franceinterjug.store.JugUser;

public interface JugRegistrationManager {

	public abstract void registrer(JugUser jugUser, Jug jug) throws AlreadyRegisteredExeption;

}