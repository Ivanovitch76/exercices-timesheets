package entities;

import java.util.List;

import be.steformations.java_data.timesheets.entities.Employee;
import be.steformations.java_data.timesheets.entities.Prestation;
import be.steformations.java_data.timesheets.entities.Project;

public class EmployeeEntity implements Employee{

	private Long id;
	private String name;
	private String firstname;
	private String login;
	private String password;
	private List<? extends Project> managedProjects;
	private List<? extends Prestation> prestation;

//	public EmployeeEntity(Long id, String name, String firstname, String login, String password, java.util.List<? extends Project> managedProjects, java.util.List<? extends Prestation> prestation){		
//		super();
//		this.id = id;	
//		this.name = name;
//		this.firstname = firstname;
//		this.login = login;
//		this.password = password;
//		this.managedProjects = managedProjects;
//		this.prestation = prestation;
//	}
	
	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public String getFirstname() {
		return this.firstname;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getLogin() {
		return this.login;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public List<? extends Project> getManagedProjects() {
		return this.managedProjects;
	}

	@Override
	public List<? extends Prestation> getPrestations() {
		return this.prestation;
	}

	
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setManagedProjects(List<? extends Project> managedProjects) {
		this.managedProjects = managedProjects;
	}

	public void setPrestation(List<? extends Prestation> prestation) {
		this.prestation = prestation;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", firstname=" + firstname + ", login=" + login
				+ ", password=" + password + ", managedProjects=" + managedProjects + ", prestation=" + prestation
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		EmployeeEntity other = (EmployeeEntity) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}




	
	
}
