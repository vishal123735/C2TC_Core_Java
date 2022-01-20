package prince;

public class StudentIdNotFound extends Exception {
	int sid;


	public StudentIdNotFound(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
      return "Exception :: Student id not found!!";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Student with id "+ sid + " Not found!!";
	}
	


}


