
interface b {
	void show();

	default void disp() {
		System.out.println("i am interface b using overriding");
	}

	static void disp1() {
		System.out.println("i am interface b using override");
	}
}

@FunctionalInterface
interface a extends b {
	default void disp() {
		System.out.println("i am interface a using overriding");
	}

}

public class functInterface implements a{
	public void show() {
		System.out.println("I am abstract meathod of funtional interface");
	}

	public static void main(String[] args) {
		functInterface obj = new functInterface();
		obj.disp();
		//how can i call parent class
	}
}
