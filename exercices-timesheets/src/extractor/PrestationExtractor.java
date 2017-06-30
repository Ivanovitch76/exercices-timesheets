package extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.dao.DataAccessException;

import entities.EmployeeEntity;
import entities.PrestationEntity;

public class PrestationExtractor implements org.springframework.jdbc.core.ResultSetExtractor<PrestationEntity>{
	PrestationEntity prestation = null;

	@Override
	public PrestationEntity extractData(ResultSet rs) throws SQLException, DataAccessException {
		Long idPrestation = rs.getLong(12);
		Date day = rs.getDate(13);
		Integer employeePrestation = rs.getInt(14);
		Integer projectPrestation = rs.getInt(15);
		Integer duration = rs.getInt(16);
		String comment = rs.getString(17);
		
//		prestation = new PrestationEntity(idPrestation, day, employeePrestation, projectPrestation, duration, comment);
//		employee.setId(id);
		return prestation;
	}

}
