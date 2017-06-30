package extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import be.steformations.java_data.timesheets.entities.Project;

public class ProjectExtractor implements RowMapper<Project>{

	@Override
	public Project mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
