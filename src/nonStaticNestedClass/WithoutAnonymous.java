package nonStaticNestedClass;

public class WithoutAnonymous implements SayHello{

	public static void main(String[] args) {
		WithoutAnonymous  withoutAnonymous =new WithoutAnonymous();
		withoutAnonymous.display();
	}

	@Override
	public void display() {
		System.out.println("Hello");
		
	}

}
