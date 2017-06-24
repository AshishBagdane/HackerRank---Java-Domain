package hackerrank.java.datastructures;

import java.util.Scanner;

public class PriorityQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		java.util.PriorityQueue<PQStudent> students = new java.util.PriorityQueue<>(n);
		while (n-- != 0) {
			String[] line = sc.nextLine().split(" ");
			if (line[0].equals("ENTER")) {
				PQStudent student = new PQStudent(line[1], Double.parseDouble(line[2]), Integer.parseInt(line[3]));
				students.add(student);
			} else if (line[0].equals("SERVED")) {
				students.poll();
			}
		}
		if (!students.isEmpty()) {
			while (!students.isEmpty()) {
				System.out.println(students.poll().getName());
			}
		} else {
			System.out.println("EMPTY");
		}
		sc.close();
	}
	
	static class PQStudent implements java.util.Comparator<PQStudent>, Comparable<PQStudent>{
	    
	    private String name;
	    private double CGPA;
	    private int token;

	    public PQStudent(String name, double CGPA, int token) {
	        this.name = name;
	        this.CGPA = CGPA;
	        this.token = token;
	    }

	    public int getToken() {
	        return token;
	    }

	    public void setToken(int token) {
	        this.token = token;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getCGPA() {
	        return CGPA;
	    }

	    public void setCGPA(double CGPA) {
	        this.CGPA = CGPA;
	    }

	    @Override
	    public int compare(PQStudent o1, PQStudent o2) {
	            if(o1.getCGPA()>o2.getCGPA())
	                return -1;
	            else if(o1.getCGPA()<o2.getCGPA())
	                return 1;
	            else {
	                if(!o1.getName().equals(o2.getName())) {
	                    return o1.getName().compareTo(o2.getName());
	                }else {
	                    return (o1.getToken() - o2.getToken());
	                }
	            }
	    }

	    @Override
	    public int compareTo(PQStudent o) {
	        return compare(this, o);
	    }
	}
}
