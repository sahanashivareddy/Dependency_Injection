package listandmap;

import java.util.Map;

public class student {
	public Map<String, String> getStudent() {
		return student;
	}

	@Override
	public String toString() {
		return "student=" + student ;
	}

	public void setStudent(Map<String, String> student) {
		this.student = student;
	}

	Map<String, String> student;
}
