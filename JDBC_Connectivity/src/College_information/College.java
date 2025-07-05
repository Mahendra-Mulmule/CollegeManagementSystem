package College_information;

public class College {
	
	int College_id;
	String College_name;
	String College_location;
	String College_type;
	int College_avg_fee;
	
	public College(int college_id, String college_name, String college_location, String college_type,int college_avg_fee) {
		super();
		College_id = college_id;
		College_name = college_name;
		College_location = college_location;
		College_type = college_type;
		College_avg_fee = college_avg_fee;
		
	}

	
	public College() {
		//default constructor 
	}


	public int getCollege_id() {
		return College_id;
	}


	public void setCollege_id(int college_id) {
		College_id = college_id;
	}


	public String getCollege_name() {
		return College_name;
	}


	public void setCollege_name(String college_name) {
		College_name = college_name;
	}


	public String getCollege_location() {
		return College_location;
	}


	public void setCollege_location(String college_location) {
		College_location = college_location;
	}


	public String getCollege_type() {
		return College_type;
	}


	public void setCollege_type(String college_type) {
		College_type = college_type;
	}


	public int getCollege_avg_fee() {
		return College_avg_fee;
	}


	public void setCollege_avg_fee(int college_avg_fee) {
		College_avg_fee = college_avg_fee;
	}
	
	@Override
	public String toString() {
		return "College [College_id=" + College_id + ", College_name=" + College_name + ", College_location="
				+ College_location + ", College_type=" + College_type + ", College_avg_fee=" + College_avg_fee + "]";
	}
	

	
}
