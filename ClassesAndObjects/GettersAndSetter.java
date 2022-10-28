public class GettersAndSetter{
	public static void main(String[]args){
		A obj=new A();
		obj.setX(5);
	}
}
class A{
	private int x;
	public int getx(){
		return x;
	}
	public void setX(int x){
		this.x=x;
		System.out.println(x);
	}
}