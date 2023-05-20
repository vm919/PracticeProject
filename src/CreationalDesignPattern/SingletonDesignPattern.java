package CreationalDesignPattern;

import java.io.Serializable;

public class SingletonDesignPattern {
	/*
	 * Early Singleton or Eager Singleton
	 * */
	
	//private constructor
	private SingletonDesignPattern() {
	}
	
	//a private static object
	private static SingletonDesignPattern sdp = new SingletonDesignPattern();

	//static method of type SingletonDesignPattern class
	public static SingletonDesignPattern getInstance() {
		
		return sdp;
	}
}

class SingletonImplementation{
	
	public static void main(String[] args) {
		SingletonDesignPattern s1 = new SingletonDesignPattern();
	}
	
}

//LazySingleton or Double check Singleton
class LazySingleton{
	
	// create a private constructor
	private LazySingleton() {
	}
	
	// create a private static variable
	private static LazySingleton ls;

	public static LazySingleton m1() {
		if (ls == null) {
			synchronized (LazySingleton.class) {
				if (ls == null) {
					ls = new LazySingleton();
				}
			}
		}
		return ls;
	}
}

/*
We can create the object of Singleton class using Serialization process.
But, we can overcome the serialization issue by implementing the readResolve() method.
*/

class SingletonThroughSerialization implements Serializable{
	private SingletonThroughSerialization() {
		
	}
	
	private static SingletonThroughSerialization sts = new SingletonThroughSerialization();
	
	protected Object readResolve() {
		return sts;
		
	}
}














