public class Quiz2 {
	public static void main(String[]args){
		System.out.println(minFunc(2,4));
	}
	public static int minFunc(int n1,int n2){
		int min;
		if (n1 > n2)
		min = n2;
		else
			min = n1;
		return min;
		}
}