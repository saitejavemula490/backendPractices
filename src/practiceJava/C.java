package practiceJava;

public class C implements A,B{
	 @Override
	  public void dispaly() {
			B.super.dispaly();
			A.super.dispaly();
		}

		
	}
interface A{
	 default void dispaly() {
		System.out.println("class A called");
	}

	
}
interface  B{
	 default void dispaly() {
		System.out.println("class B called");
	}
}
