package staticNestedClass;

public class StaticNestedExample {
	
	public static int a;
	static class InnerStaticNestedExampl{
		void dispaly(){
			System.out.println("Hello" + a);
		}
	}

	public static void main(String[] args) {
		StaticNestedExample.InnerStaticNestedExampl obj=new StaticNestedExample.InnerStaticNestedExampl();
		obj.dispaly();

	}

}
