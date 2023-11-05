package polimorfisomoConsumo;

public class AppConsumo {
	public static void main(String[] args) {
	
		Consumo consumo1 = new Consumo(35);
		System.out.println(consumo1);
		
		Consumo consumo2 = new Consumo(25,'F');
		System.out.println(consumo2);
		
		Consumo consumo3 = new Consumo(23, 'A');
		System.out.println(consumo3);
		
		Consumo consumo4 = new Consumo(35, 'A');
		System.out.println(consumo4);
	}
}
