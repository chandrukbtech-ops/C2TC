package day6.staticblockmethod;

public class MyClassDemo {
	public static void main(String[] args) {

		Myclass obj1 = new Myclass();
		System.out.println(obj1);
		Myclass.display();

		Myclass obj2 = new Myclass();
		System.out.println(obj2);
		Myclass.display();
		
		Myclass obj3 = new Myclass();
		System.out.println(obj3);
		Myclass.display();

	}
}
