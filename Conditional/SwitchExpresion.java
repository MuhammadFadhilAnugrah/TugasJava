public class SwitchExpresion {
	public static void main(String[]args){
		String coffee = "latte";
		int price = switch ("coffee"){
			case "Espresso","Americano" -> 15;
			case "Latte","Macchiato" -> 20;
			default -> 0;
		};
		System.out.println("latte rasa pahit,harganya  20");
	}
}