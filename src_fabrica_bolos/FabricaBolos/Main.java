package FabricaBolos;

public class Main {

	public static void main(String[] args) {
		var fabrica = new Fabrica();
		
		var bolo = fabrica.CriaBolo("Baunilha");
		System.out.println(bolo.toString() + " " + bolo.getPreco() + "€");
		
		// Ecrã B
		var bolo2 = fabrica.CriaBolo("Chocolate");
		System.out.println(bolo2.toString() + " " + bolo2.getPreco() + "€");
		
		// Ecrã A
		var bolo3 = fabrica.CriaBolo("Chocolate");
		System.out.println(bolo3.toString() + " " + bolo3.getPreco() + "€");
		
		var bolo4 = fabrica.CriaBolo("Cenoura");
		System.out.println(bolo4.toString() + " " + bolo4.getPreco() + "€");
	
		var bolo5 = fabrica.CriaBolo("MilFolhas");
		System.out.println(bolo5.toString() + " " + bolo5.getPreco() + "€");
	
	}

}
