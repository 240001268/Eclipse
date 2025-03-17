
public class Lampada {
//1 - Atributos
	private String cor;
	private String marca;
	private int lumens;
	private boolean estado;
	
//2 - Construtores
	
	
	//Sem parametros
	public Lampada(){
		this.cor = "Branca";
		this.marca = "Philips";
		this.lumens = 800;
		this.estado = false;
		
	}
	//Com parametros
	 public Lampada(String cor, String marca, int lumens, boolean estado) {
	        this.cor = cor;
	        this.marca = marca;
	        this.lumens = lumens;
	        this.estado = estado;
	 }
//3 - Acessores (gets & sets)
	 
	 public String getCor() {
		 return cor;
	 }
	 
	 public void setCor(String cor) {
		 this.cor = cor;
	 }
	 
	 public String getMarca() {
		 return marca;
	 }
	public void setMarca (String marca) {
		this.marca = marca;
	} 
	
//4 - Comportamentos
	
    public void acender() {
        estado = true;
        System.out.println("A lâmpada está acesa.");
    }

    public void apagar() {
        estado = false;
        System.out.println("A lâmpada está apagada.");
    }
    
    
//5 - Metodos complementares
    
    @Override
    public String toString() {
    	return cor;
    }
    
    public void mostrarInformacoes() {
        System.out.println("Informações da lâmpada:");
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Lumens: " + lumens);
        System.out.println("Estado: " + (estado ? "Acesa" : "Apagada")+ "\n");
    }
   

}
	
