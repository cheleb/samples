/**
 * 
 */
package org.jugmontpellier.franceinterjug.business;

import static org.junit.Assert.*;

import javax.inject.Inject;
import javax.inject.Named;

import org.easymock.EasyMock;
import org.jugmontpellier.franceinterjug.store.Jug;
import org.jugmontpellier.franceinterjug.store.JugUser;
import org.jugmontpellier.franceinterjug.store.dao.JugDAO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author chelebithil
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/test-manager-context.xml")
public class JugRegistrationManagerTest {

	/**
	 * Class Under Test.
	 */
	@Inject
	private JugRegistrationManager jugRegistrationManager;
	
	@Inject	
	private JugDAO jugDAO;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		EasyMock.reset(jugDAO);
	}

	/**
	 * Test method for {@link org.jugmontpellier.franceinterjug.business.JugRegistrationManager#register(org.jugmontpellier.franceinterjug.store.JugUser, org.jugmontpellier.franceinterjug.store.Jug)}.
	 * @throws AlreadyRegisteredExeption 
	 */
	@Test
	public void testRegistrer() throws AlreadyRegisteredExeption {
		Jug jug = new Jug();
		JugUser jugUser = new JugUser();
		jugDAO.addJugUser(jug, jugUser);
		
		EasyMock.replay(jugDAO);
		
		jugRegistrationManager.register(jugUser, jug);
		
		
		EasyMock.verify(jugDAO);
	}

	
	/**
	 * Test method for {@link org.jugmontpellier.franceinterjug.business.JugRegistrationManager#register(org.jugmontpellier.franceinterjug.store.JugUser, org.jugmontpellier.franceinterjug.store.Jug)}.
	 * @throws AlreadyRegisteredExeption 
	 */
	@Test(expected=AlreadyRegisteredExeption.class)
	public void testAlreadyRegisteredRegistrer() throws AlreadyRegisteredExeption {
		Jug jug = new Jug();
		jug.setId(1);
		JugUser jugUser = new JugUser();
		jugUser.setId(1);
		jug.addToJugusers(jugUser);
		
		EasyMock.replay(jugDAO);
		
		jugRegistrationManager.register(jugUser, jug);
		
		
		EasyMock.verify(jugDAO);
	}
}
