package package1;

public class Data  
{ int RollNo;
int Age;

public void First()
{
	System.out.println("Welcome to the world of java");
}

public void Second()
{
	System.out.println("Automation is easy");
}

 public static void main(String[] args) {
	Data Suyash = new Data();
	Suyash.First();
	Suyash.Second();
	Suyash.RollNo = 1506;
	Suyash.Age = 29;
	System.out.println("Student Roll No is " + Suyash.RollNo);
	System.out.println("Student Age is " + Suyash.Age);
}
	
}
