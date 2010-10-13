package org.jugmontpellier.franceinterjug.store;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @generated
 */
@Entity
@Table(name = "juguser", schema = "public")
public class JugUser implements Serializable {
	/**
	 * Serialization UID.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Simple ID
	 * 
	 * @generated
	 **/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "JUGUSER")
	@SequenceGenerator(name = "JUGUSER", sequenceName = "juguser_id_seq")
	private int id;
	/**
	 * 
	 * @generated
	 **/
	private String title;
	/**
	 * 
	 * @generated
	 **/
	private String lastname;
	/**
	 * 
	 * @generated
	 **/
	private String firstname;
	/**
	 * 
	 * @generated
	 **/
	private String email;
	/**
	 * 
	 * @generated
	 **/
	private String login;
	/**
	 * 
	 * @generated
	 **/
	private String password;

	/**
	 * ManyToMany.
	 * 
	 * @generated
	 **/
	@ManyToMany(mappedBy = "jugusers")
	private Set<Jug> jugs = new HashSet<Jug>();

	/**
	 * 
	 * @generated
	 * 
	 **/
	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @generated
	 * 
	 **/
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @generated
	 **/
	public String getTitle() {
		return this.title;
	}

	/**
	 * @generated
	 **/
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @generated
	 **/
	public String getLastname() {
		return this.lastname;
	}

	/**
	 * @generated
	 **/
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * 
	 * @generated
	 **/
	public String getFirstname() {
		return this.firstname;
	}

	/**
	 * @generated
	 **/
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * 
	 * @generated
	 **/
	public String getEmail() {
		return this.email;
	}

	/**
	 * @generated
	 **/
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @generated
	 **/
	public String getLogin() {
		return this.login;
	}

	/**
	 * @generated
	 **/
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * 
	 * @generated
	 **/
	public String getPassword() {
		return this.password;
	}

	/**
	 * @generated
	 **/
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Many to many.
	 * 
	 * @generated
	 **/
	public Set<Jug> getJugs() {
		return this.jugs;
	}

	/**
	 * Many to many.
	 * 
	 * @generated
	 **/
	public void setJugs(Set<Jug> aJugSet) {
		this.jugs = aJugSet;
	}

	/**
	 * ManyToMany jugusers <--> jugs
	 * 
	 * @generated
	 **/
	public void addToJugs(Jug aJug) {
		if (this.jugs.add(aJug)) {
			aJug.addToJugusers(this);
		}
	}

	/**
	 * Return a string representation of ID.
	 * 
	 * @generated
	 */
	public String get_idAsString() {
		return String.valueOf(getId());
	}

	/**
	 * ToString.
	 * 
	 * @generated
	 **/
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer("[JugUser");
		buffer.append(" ");
		buffer.append("title");
		buffer.append(": ");
		buffer.append(getTitle());
		buffer.append(" ");
		buffer.append("lastname");
		buffer.append(": ");
		buffer.append(getLastname());
		buffer.append(" ");
		buffer.append("firstname");
		buffer.append(": ");
		buffer.append(getFirstname());
		buffer.append(" ");
		buffer.append("email");
		buffer.append(": ");
		buffer.append(getEmail());
		buffer.append(" ");
		buffer.append("login");
		buffer.append(": ");
		buffer.append(getLogin());
		buffer.append(" ");
		buffer.append("password");
		buffer.append(": ");
		buffer.append(getPassword());
		buffer.append("]");
		return buffer.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JugUser other = (JugUser) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}