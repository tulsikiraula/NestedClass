package nonStaticNestedClass;

public class LocalInnerClass {
	int data = 10;

	 void display() {
		
		class InnerClass {
			void msg() {
				System.out.println(data);
			}
		}
		
		InnerClass innerclass=new InnerClass();
		innerclass.msg();
	}

	public static void main(String[] args) {
		LocalInnerClass localInnerClass= new LocalInnerClass();
		localInnerClass.display();

	}

}
