
public class Semaforo {

	//1 - Atributos
	private boolean estadoVermelho;
	private boolean estadoVerde;
	private boolean estadoAmarelo;


  //Construtores
	
	public Semaforo() {
		
		estadoVermelho = true;
		estadoVerde = false;
		estadoAmarelo = false;
	}
	
	public Semaforo (boolean estadoVermelho,boolean estadoVerde,boolean estadoAmarelo) {
		this.estadoVermelho = estadoVermelho;
		this.estadoVerde= estadoVerde;
		this.estadoAmarelo = estadoAmarelo;
	}
	
	//3 - Acessores (gets & sets)
	
	public void setEstadoVermelho(boolean estadoVermelho) {
		this.estadoVermelho = estadoVermelho;
	}
	
	
	//4 - Comportamentos
	
	public void acender() {
		
		estadoVermelho = true;
		System.out.println("PARE! ***** Semaforo Vermelho.!");
	}
	
	public void apagar() {
		
		estadoVermelho = false;
		System.out.println("AVANCE! ****** Semaforo Verde!");
	}
	public void amarelo() {
		
		estadoVermelho = false;
		estadoVerde = false;
		System.out.println("CUIDADO! ****** Semaforo Amarelo!");
		
	}
	
	
	// 5 - Métodos complementares
	
	public void motrarInformação() {
		
		System.out.println("Informações do semáforos:");
		System.out.println("PARE está vermelho" + estadoVermelho);
		System.out.println("AVANCE está verde "+ estadoVerde);
		System.out.println("CUIDADO está amarelo" + estadoAmarelo);
	}
}
	
	