package advance.dev.model;

public class People {
	private String name;
	private int age;

// hàm khởi tạo là hàm khi khởi tạo đối tượng
	public People(String name, int age) {
		// Khởi tạo các thuộc tính và phương thức cho đối tượng
		this.name = name;
		this.age = age;
	}

// Gán giá trị
	public void setName(String name) {
		this.name = name;
	}

// Lấy giá trị 
	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
