package advance.dev.dao;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
//import advance.dev.dao.Teacher;

// Lớp Manager trong package advance.dev.dao
public class Manager {
	// Danh sách các giáo viên
	private List<Teacher> teacherList = new ArrayList<>();

	// Phương thức để thêm một giáo viên vào danh sách
	public void addTeacher(Teacher teacher) {
		teacherList.add(teacher);
	}

	// Phương thức để in ra danh sách giáo viên hiện có
	public void printTeacherList() {
		System.out.println("Danh sách giáo viên hiện tại:");
		for (Teacher teacher : teacherList) {
			System.out.println("Name: " + teacher.getName() + ", Age: " + teacher.getAge());
		}
	}

	// Phương thức để lấy số giáo viên hiện có trong danh sách
	public int getNumberOfTeachers() {
		return teacherList.size();
	}

	// Phương thức để lấy ra tên và tuổi của giáo viên cao tuổi nhất
	public Teacher getOldestTeacher() {
		Teacher oldestTeacher = teacherList.stream().max(Comparator.comparing(Teacher::getAge)).orElse(null);
		return oldestTeacher;
	}
}