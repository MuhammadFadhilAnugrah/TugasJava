public class myArrays {
	public static void main(String[]args){
		double myArray[]={2.5,3.5,4.5,5.5};
		double sum = 0.0;
		for(int x = 0; x < 4;x ++){
			sum += myArray[x];
		}
		System.out.println(sum);
	}
}