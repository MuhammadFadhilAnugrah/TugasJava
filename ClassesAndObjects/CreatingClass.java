class A{
	public void test2(){
		test();
	}
	public void test(){
		System.out.println("hi");
	}
	public static void main(String[]args){
		A obj = new A();
		obj.test();
	}
}