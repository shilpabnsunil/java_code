package programs;
class Grand_parent
{
	Grand_parent(int a,int b){
		System.out.println("1");
	}
}
class Parent_Class extends Grand_parent
{
	Parent_Class(String name){
		super(0, 0);
		//parameterized super calling statement 
		//super calling statement calling grandparent  
		//parameterized constructor 
		System.out.println("2");
	}
}
public class Constructor_Inheritance_Supercalling extends Parent_Class
{
	Constructor_Inheritance_Supercalling(){
		super("shilpa");//super calling statement//written explicity
		System.out.println("3");
}
	
public static void main(String[] args) 
{
	new Constructor_Inheritance_Supercalling();
}
}
