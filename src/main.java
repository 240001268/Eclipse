
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Usando o construtor padrão
		        Lampada lampada1 = new Lampada();
		        lampada1.mostrarInformacoes();
		        
		        // Usando o construtor parametrizado
		        Lampada lampada2 = new Lampada("Amarela", "Philips", 1000, false);
		        lampada2.mostrarInformacoes();
		        
		        // Alterando o estado da lâmpada
		        lampada2.acender();
		        lampada2.mostrarInformacoes();
		        
		        System.out.println("Marca da lâmpada: " + lampada2.toString());
	}
}
