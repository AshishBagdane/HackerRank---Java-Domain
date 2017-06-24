package hackerrank.java.advanced;

public class SingletonPattern {

	static class Singleton{
	    
	    public String str;
	    private static Singleton singleton;

	    private Singleton() { }
	    
	    public static Singleton getSingleInstance() {
	        return singleton = (singleton==null) ? new Singleton() : singleton;
	    }
	}

}
