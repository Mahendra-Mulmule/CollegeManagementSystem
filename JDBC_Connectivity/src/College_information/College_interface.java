package College_information;

import java.sql.SQLException;
import java.util.List;

public interface College_interface {
	
	
	void addCollege(College college);
	
	List<College> getcollege();
	
	boolean D_CollgeBy_id(int Collegeid);

	boolean infoby_id(int collegeid);
	
	void closeconnection() throws SQLException;
	
	
	
	

}
