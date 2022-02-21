final class Singleton {
	private static Singleton s = new Singleton();
	private Singleton() {
		// ...
	}
	public static Singleton getInstance() {
		if (s == null)
			s = new Singleton();
		return s;
	}
}

public class SingleTonTest {

	public static void main(String[] args) {
//		Singleton s = new SingleTon()		에러! Singleton() has private access in Singleton
		Singleton s = Singleton.getInstance();
	}
}
