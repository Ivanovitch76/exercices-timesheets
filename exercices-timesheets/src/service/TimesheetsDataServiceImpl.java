package service;

import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import be.steformations.java_data.timesheets.entities.Employee;
import be.steformations.java_data.timesheets.entities.Prestation;
import be.steformations.java_data.timesheets.entities.Project;
import be.steformations.java_data.timesheets.service.TimesheetsDataService;
import extractor.EmployeeExtractor;

public class TimesheetsDataServiceImpl implements TimesheetsDataService{

	private JdbcTemplate _jdbcTemplate;

	public TimesheetsDataServiceImpl(JdbcTemplate jdbcTemplate) {
		this._jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<? extends Employee> findAllEmployees() {
        List<Employee> employee = null;
        String sql = "select  e.id, e.firstname, e.name, e.login, e.password, p.id, p.name, p.description, "
    			+ "p.startdate, p.enddate, pr.id, pr.day, pr.duration, pr.comment "
    			+ "from project as p right join employee as e on p.manager = e.id " 
    			+ "left join prestation as pr on pr.employee = e.id ";

        try {
        	EmployeeExtractor extractor = new EmployeeExtractor();
        	employee = (List<Employee>) this._jdbcTemplate.query(sql, extractor);
        } catch(org.springframework.dao.EmptyResultDataAccessException e) {e.getMessage();}

        return employee;
	}

	@Override
	public Employee findOneEmployeeById(long id) {
		Employee employee = null;
        if (id != 0) {
            String sql = "select  e.id, e.firstname, e.name, e.login, e.password, p.id, p.name, p.description, "
            			+ "p.startdate, p.enddate, pr.id, pr.day, pr.duration, pr.comment "
            			+ "from project as p right join employee as e on p.manager = e.id " 
            			+ "left join prestation as pr on pr.employee = e.id "
            			+ "where e.id = ?";

            try {
            	    EmployeeExtractor extractor = new EmployeeExtractor();
            	    employee = this._jdbcTemplate.query(sql, extractor, id);
            } catch(org.springframework.dao.EmptyResultDataAccessException e) {e.getMessage();}
        }
        return employee;
	}

	@Override
	public Employee findOneEmployeeByFirstnameAndName(String firstname, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findOneEmployeeByLoginAndPassword(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Project> findAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project findOneProjectById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project findOneProjectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestation findOnePrestationById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Prestation> findAllPrestationsByEmployeeId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Prestation> findAllPrestationsByProjectId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestation addPrestation(long employeeId, long projectId, String comment, Date day, int duration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestation deletePrestation(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
