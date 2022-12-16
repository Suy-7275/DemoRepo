package package2;

//(((((10+2)+2)-2)*2)/2)

public class Assign1_03rd_dec {
	
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
	Assign1_03rd_dec Suyash = new Assign1_03rd_dec();
	int sumresult = Suyash.add(10, 2);
	int newsumresult = Suyash.add(sumresult, 2);
	int subresult = Suyash.subs(newsumresult, 2);
	int multiplyresult = Suyash.multiply(subresult, 2);
	int division = multiplyresult/2;
	System.out.println("Final Calculation is "+ division);
}

}