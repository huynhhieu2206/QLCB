package advance.dev;

import advance.dev.dao.Teacher;
import advance.dev.dao.Manager;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Manager manager = new Manager();
		// Thêm giáo viên vào danh sách
				manager.addTeacher(new Teacher("Trung", 35, "T001"));
				manager.addTeacher(new Teacher("Dung", 40, "T002"));
				manager.addTeacher(new Teacher("Trang", 30, "T003"));

		while (true) {
			System.out.println("Chọn một tùy chọn:");
			System.out.println("1. Thêm giáo viên");
			System.out.println("2. In danh sách giáo viên");
			System.out.println("3. Lấy số lượng giáo viên");
			System.out.println("4. Lấy tên giáo viên có tuổi cao nhất");
			System.out.println("5. Thoát");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Nhập tên giáo viên:");
				String name = scanner.nextLine();
				System.out.println("Nhập tuổi giáo viên:");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Nhập mã giáo viên:");
				String teacherID = scanner.nextLine();

				Teacher teacher = new Teacher(name, age, teacherID);
				manager.addTeacher(teacher);
				break;
			case 2:
				System.out.println("Danh sách giáo viên:");
				manager.printTeacherList();
				break;
			case 3:
				System.out.println("Số lượng giáo viên: " + manager.getNumberOfTeachers());
				break;
			case 4:
				System.out.println("Giáo viên có tuổi cao nhất: " + manager.getOldestTeacher());
				break;
			case 5:
				System.out.println("Thoát chương trình.");
				scanner.close();
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
				break;
			}
		}
	}
}