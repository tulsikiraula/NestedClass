package nonStaticNestedClass;

public class AnonymousClassExample{
	public static void main(String[] args) {
	
	SayHello sayHello = new SayHello() {
		
		@Override
		public void display() {
		System.out.println("Hello");
		}
	};
	sayHello.display();
				
	}
}
