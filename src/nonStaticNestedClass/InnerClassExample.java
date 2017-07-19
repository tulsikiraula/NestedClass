package nonStaticNestedClass;

public class InnerClassExample {
	private int a=10;
	private static int b=20;
	private class InnerClass{
		void display(){
			System.out.println("Value of a" + a);
			System.out.println("Value of b" + b);
		}
		
	}

		
	public static void main(String[] args) {
		InnerClassExample obj = new InnerClassExample();
        InnerClass ob=obj.new InnerClass();
        ob.display();
	}

}
