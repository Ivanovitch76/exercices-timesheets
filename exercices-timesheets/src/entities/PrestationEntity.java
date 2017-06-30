package entities;

import java.util.Date;

import be.steformations.java_data.timesheets.entities.Employee;
import be.steformations.java_data.timesheets.entities.Prestation;
import be.steformations.java_data.timesheets.entities.Project;

public class PrestationEntity implements Prestation {

	private Long id;
	private Date day;
	private Employee employee;
	private Project project;
	private int duration;
	private String comment;

//	public PrestationEntity(Long id, Date day, Employee employee, Project project, int duration ,String comment){		
//		super();
//		this.id = id;	
//		this.day = day;
//		this.employee = employee;
//		this.project = project;
//		this.duration = duration;
//		this.comment = comment;
//	}
	
	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public Date getDay() {
		return this.day;
	}

	@Override
	public Employee getEmployee() {
		return this.employee;
	}

	@Override
	public Project getProject() {
		return this.project;
	}

	@Override
	public int getDuration() {
		return this.duration;
	}

	@Override
	public String getComment() {
		return this.comment;
	}

	
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "PrestationEntity [id=" + id + ", day=" + day + ", employee=" + employee + ", project=" + project
				+ ", duration=" + duration + ", comment=" + comment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + duration;
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
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
		PrestationEntity other = (PrestationEntity) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (duration != other.duration)
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		return true;
	}

	
}
