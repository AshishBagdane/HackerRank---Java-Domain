package hackerrank.java.advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class ReflectionAttributes {

	public static void main(String[] args) {
		Class<Student> student = Student.class;
		Method[] methods = student.getDeclaredMethods();

		ArrayList<String> methodList = new ArrayList<>();
		for (Method method : methods) {
			methodList.add(method.getName());
		}
		Collections.sort(methodList);
		for (String name : methodList) {
			System.out.println(name);
		}
	}

	static class Student {
		private String name;
		private String id;
		private String email;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}
}