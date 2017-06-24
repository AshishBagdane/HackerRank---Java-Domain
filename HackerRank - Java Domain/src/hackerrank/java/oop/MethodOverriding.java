package hackerrank.java.oop;

public class MethodOverriding {

	public static void main(String[] args) {
		Sports c1 = new Sports();
		Soccer c2 = new Soccer();
		System.out.println(c1.getName());
		c1.getNumberOfTeamMembers();
		System.out.println(c2.getName());
		c2.getNumberOfTeamMembers();
	}

	static class Sports {

		String getName() {
			return "Generic Sports";
		}

		void getNumberOfTeamMembers() {
			System.out.println("Each team has n players in " + getName());
		}
	}

	static class Soccer extends Sports{
	    @Override
	    String getName(){
	        return "Soccer Class";
	    }
	}
}
