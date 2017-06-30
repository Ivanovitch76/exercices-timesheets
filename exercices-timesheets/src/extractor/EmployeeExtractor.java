package extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.dao.DataAccessException;

import entities.EmployeeEntity;
import entities.PrestationEntity;
import entities.ProjectEntity;


public class EmployeeExtractor implements org.springframework.jdbc.core.ResultSetExtractor<EmployeeEntity>{


	@Override
	public EmployeeEntity extractData(ResultSet rs) throws SQLException, DataAccessException {
		EmployeeEntity employee = null;
		ProjectEntity projet = null;
		PrestationEntity prestation = null;
		List<ProjectEntity> managedProjects= new ArrayList<>();
		List<PrestationEntity> listPrestations = new ArrayList<>();
//		ProjectEntity managedProjects = new ArrayList<>();
//		ArrayList<Object> prestation = new ArrayList<>();
		
		while (rs.next()){
			if (employee == null){
				Long id = rs.getLong(1);
				String firstname = rs.getString(2);
				String name = rs.getString(3);
				String login = rs.getString(4);
				String password = rs.getString(5);

				employee = new EmployeeEntity();
				employee.setId(id);
				employee.setFirstname(firstname);
				employee.setName(name);
				employee.setLogin(login);
				employee.setPassword(password);
				employee.setManagedProjects(managedProjects);
			}
			Long idProjet = rs.getLong(6);
			if (! rs.wasNull()){
			
				String nameProjet = rs.getString(7);
				String descriptionProjet = rs.getString(8);
				Date startDate = rs.getDate(9);
				Date endDate = rs.getDate(10);
				
				projet = new ProjectEntity();
				projet.setId(idProjet);
				projet.setName(nameProjet);
				projet.setDescription(descriptionProjet);
				projet.setStartDate(startDate);
				projet.setEndDate(endDate);
				projet.setManager(employee);
				if (! managedProjects.contains(projet)){
					managedProjects.add(projet);
				}	
			}	
			Long idPrestation = rs.getLong(11);
			if (! rs.wasNull()){	
				Date day = rs.getDate(12);
				Integer duration = rs.getInt(13);
				String comment = rs.getString(14);
				
				prestation = new PrestationEntity();
				prestation.setId(idPrestation);
				prestation.setDay(day);
				prestation.setDuration(duration);
				prestation.setComment(comment);
				prestation.setEmployee(employee);
				prestation.setProject(projet);
				listPrestations.add(prestation);
						
			}
			
			
			


//			projet = (List<? extends Project>) = new ProjectEntity(idProjet, nameProjet, descriptionProjet, startDate, endDate, manager);
		}
		
		return employee;
	}

}
	
