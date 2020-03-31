package udemyJavaTopics;

public class ConstructorAndThisKeyword {

	//Constructor is used to initialize the instance variable
	//claa name constructor name must be same
	//constructor is executed when object is created
	//return type not allowed
	//3 types of const.=>1.default cons. 2>no argument Cons. 3>parameterised conns.
	//Constructor overloading is possible
	//we can call constructor within constructor by using this keyword
	
	/*this can be used to refer current class instance variable.
	this can be used to invoke current class method (implicitly)
	this() can be used to invoke current class constructor.
	this can be passed as an argument in the method call.
	this can be passed as argument in the constructor call.*/
	
	/*public ConstructorAndThisKeyword() //no argument constructor
	{
		System.out.println("No argument Constructor");
	
			}*/
	
	//if instance variable and local variable is not same then no need of this keyword
	/*String nm;
	int emp;

	public ConstructorAndThisKeyword(String name, int empno) // parameterised constructor argument constructor
	{
		nm=name;
	   emp=empno;
			}
	
	
	public static void main(String[] args) {
		
		
		ConstructorAndThisKeyword kk=new ConstructorAndThisKeyword("Swapnil",844096);
		
		System.out.println(kk.nm);
		System.out.println(kk.emp);
	}*/
	
	//Using This keyword cause inst. var. name and local var. name is same 
	
	String name;
	int empno;

	public ConstructorAndThisKeyword(String name, int empno) // parameterised constructor argument constructor
	{
		this.name=name; //this.name represent instance variable
		this.empno=empno;
			}
	
	
	public static void main(String[] args) {
		
		
		ConstructorAndThisKeyword kk=new ConstructorAndThisKeyword("Swapnil",844096);
		
		System.out.println(kk.name);
		System.out.println(kk.empno);

}
}
