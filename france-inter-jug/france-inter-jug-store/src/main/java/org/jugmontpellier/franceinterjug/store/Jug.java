package org.jugmontpellier.franceinterjug.store;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @generated
 */
@Entity
@Table(name = "jug", schema = "public")
public class Jug implements Serializable {
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
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "JUG")
	@SequenceGenerator(name = "JUG", sequenceName = "jug_id_seq")
	private int id;
	/**
	 * 
	 * @generated
	 **/
	private String name;

	/**
	 * ManyToMany.
	 * 
	 * @generated
	 **/
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "juguser_x_jug", joinColumns = @JoinColumn(name = "jug"), inverseJoinColumns = @JoinColumn(name = "juguser"))
	private Set<JugUser> jugusers = new HashSet<JugUser>();

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
	public String getName() {
		return this.name;
	}

	/**
	 * @generated
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Many to many.
	 * 
	 * @generated
	 **/
	public Set<JugUser> getJugusers() {
		return this.jugusers;
	}

	/**
	 * Many to many.
	 * 
	 * @generated
	 **/
	public void setJugusers(Set<JugUser> aJugUserSet) {
		this.jugusers = aJugUserSet;
	}

	/**
	 * ManyToMany jugs <--> jugusers
	 * 
	 * @generated
	 **/
	public void addToJugusers(JugUser aJugUser) {
		if (this.jugusers.add(aJugUser)) {
			aJugUser.addToJugs(this);
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
		StringBuffer buffer = new StringBuffer("[Jug");
		buffer.append(" ");
		buffer.append("name");
		buffer.append(": ");
		buffer.append(getName());
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
		Jug other = (Jug) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}