package advance.dev.dao;

import advance.dev.model.IPeople;
import advance.dev.model.People;

public class Teacher extends People implements IPeople {
	// lớp Teacher kế thừa lớp People và triển khai dao diện của IPeople
	private String teacherID;

	public Teacher(String name, int age, String teacherID) {
		// biến tham chiếu trực tiếp đến phương thức của lớp cha
		super(name, age);
		this.teacherID = teacherID;
	}

	

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	@Override
	public void add() {
		System.out.println("Thêm giáo viên với ID: "  + this.teacherID);
		// TODO Auto-generated method stub

	}

	@Override
	public void prinPeople() {
		System.out.println("Tên: " + getName() + ", Tuổi: " + getAge() + ", Mã giáo viên: " + getTeacherID());
		// TODO Auto-generated method stub

	}
}