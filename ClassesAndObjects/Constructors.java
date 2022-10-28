public class Constructors{
	
	public static void main(String[]args){
		Person obj=new Person();
		obj.Person(34);
	}
}
class Person{
	private int age;
	
	public void Person(int myage){
		age=myage;
		System.out.println(age);
	}
}