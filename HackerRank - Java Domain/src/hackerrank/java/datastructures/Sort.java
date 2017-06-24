package hackerrank.java.datastructures;

import java.util.Collections;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		if (testCases >= 2 && testCases <= 1000) {

			java.util.List<Student> studentList = new java.util.ArrayList<>();
			CheckerAL checkerAL = new CheckerAL();
			while (testCases > 0) {
				int id = in.nextInt();
				String fname = in.next();
				double cgpa = in.nextDouble();
				// if((id>=0 && id<=100000) && (fname.length()>=5 &&
				// fname.length()<=30) && (cgpa>=0.0d && cgpa<=4.0)) {
				Student st = new Student(id, fname, cgpa);
				studentList.add(st);
				// }
				testCases--;
			}

			Collections.sort(studentList, checkerAL);
			for (Student stud : studentList) {
				System.out.println(stud.getFname());
			}
		}
		in.close();
	}
	
	static class Student {
		private int id;
		private String fname;
		private double cgpa;

		public Student(int id, String fname, double cgpa) {
			super();
			this.id = id;
			this.fname = fname;
			this.cgpa = cgpa;
		}

		public int getId() {
			return id;
		}

		public String getFname() {
			return fname;
		}

		public double getCgpa() {
			return cgpa;
		}
	}

	static class CheckerAL implements java.util.Comparator<Object> {

		@Override
		public int compare(Object o1, Object o2) {
			Student one = (Student) o1;
			Student two = (Student) o2;
			if (one.getCgpa() < two.getCgpa()) {
				return 1;
			} else if (one.getCgpa() > two.getCgpa()) {
				return -1;
			} else {
				if (one.getId() == two.getId()) {
					return 1;
				} else
					return one.getFname().compareTo(two.getFname());
			}
		}
	}
}
