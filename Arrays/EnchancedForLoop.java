public class EnchancedForLoop {
	public static void main(String[]args){
		int [] arr = {1,3,4,5,6,};
		int total = 0;
		
		for(int x: arr){
			total += x;
		}
		System.out.println(total);
	}
}