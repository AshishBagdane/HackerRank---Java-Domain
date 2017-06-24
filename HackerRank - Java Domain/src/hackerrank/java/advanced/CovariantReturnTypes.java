package hackerrank.java.advanced;

public class CovariantReturnTypes {

	static class Flower {
	    
	    String whats_Your_Name() {
	        return "I have many names and types";
	    }
	}

	static class Jasmine extends Flower {

	    @Override
	    String whats_Your_Name() {
	        return "Jasmine";
	    }
	}

	static class Lily extends Flower {

	    @Override
	    String whats_Your_Name() {
	        return "Lily";
	    }
	}

	static class Lotus extends Flower {

	    @Override
	    String whats_Your_Name() {
	        return "Lotus";
	    }
	}

	static class State {

	    Flower your_National_Flower() {
	        return new Flower();
	    }
	}

	static class WestBengal extends State{

	    @Override
	    Jasmine your_National_Flower() {
	        return new Jasmine();
	    }
	}

	static class Karnataka extends State{

	    @Override
	    Lotus your_National_Flower() {
	        return new Lotus();
	    }
	}

	static class AndhraPradesh extends State {

	    @Override
	    Lily your_National_Flower() {
	        return new Lily();
	    }
	}
}
