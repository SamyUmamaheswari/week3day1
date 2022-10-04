package week3day1;

public class Student {
	
	public void getStudentsInfo(int id) {
		System.out.println(id);

	}
	
	public void getStudentsInfo(int id, String name) {
		System.out.println(id + name);

	}
	
	public void getStudenrsInfo(String email, String number) {
		System.out.println(email + number);

	}

	public static void main(String[] args) {
		Student S = new Student();
		S.getStudentsInfo(2);
		S.getStudentsInfo(2, "Umamaheswari");
		S.getStudenrsInfo("umacivi95@gmail.com", "9765100291");
	}
	
	
}
