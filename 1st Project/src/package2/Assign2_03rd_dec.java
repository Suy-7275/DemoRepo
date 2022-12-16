package package2;

public class Assign2_03rd_dec {
	
	public int add (int a , int b)
	{
		int sum = a+b;
		System.out.println("Sum of two numbers "+ sum);
		return sum;
	}

public int subs (int c , int d)
{
	int sub = c-d;
	System.out.println("Substraction of two numbers "+ sub);
	return sub;
}
public int multiply (int e , int f)
{
	int multiply = e*f;
	System.out.println("Multiplication of two numbers "+ multiply);
	return multiply;
}

public static void main(String[] args) {
	Assign2_03rd_dec Suyash = new Assign2_03rd_dec();
	int multiplyresult = Suyash.multiply(10, 2);
	int subsresult = Suyash.subs(multiplyresult, 2);
	int sumresult = Suyash.add(subsresult, 2);
	int newsubsresult = Suyash.subs(sumresult, 2);
	int division = newsubsresult/2;
	System.out.println("Final Calculation is "+ division);
	
}

}


