
public class VariableDiff 
{
	
	public static int salary=20000;
	public static String name="Shyam";
	public int salary1;
	public String name1;
	public VariableDiff()
	{}
	
public VariableDiff(String name1,int salary1)
{
	this.name1=name1;
	this.salary1=salary1;
}
public String toString()
{
return name1 + " " + salary1;	
}

public static void main(String[] args) 
{
	// TODO Auto-generated method stub
VariableDiff obj= new VariableDiff("Ram",10000);
System.out.println("Instance Variable-" + obj);
System.out.println("Class Variable-" +name+" "+salary);	
}
}

