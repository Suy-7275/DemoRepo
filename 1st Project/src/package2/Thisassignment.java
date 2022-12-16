package package2;

public class Thisassignment {
	public void method() 
	{
		System.out.println("Default Method");
	}
	public void method1(int a) 
	{
		System.out.println("One Parameterized Method");
	}
	public void method2(int a, int b) 
	{
		System.out.println("Two Parameterized Method");
	}
	public void method3(int a, int b, int c) 
	{
		System.out.println("Three Paramterized Method");
	}
	public void method4(int a, int b, int c,int d) 
	{
		this.method3(a, b, c);
		this.method();
		this.method1(a);
		this.method2(a, b);
		System.out.println("Four Paramterized Method");
	}
	public static void main(String[] args) {
		Thisassignment refobj = new Thisassignment();
		refobj.method4(1, 2, 3, 4);
		
		
		
		
		
		
	}

}
