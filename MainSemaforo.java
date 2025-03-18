import java.util.*;
public class MainSemaforo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("123");
		
		
		Semaforo semaforo1 = new Semaforo();
		//semaforo1.motrarInformação();
		
				
		for (int i=0; i<= 10; i++) {
			semaforo1.acender();			
		}
		for (int j=0; j<= 20; j++) {
			semaforo1.apagar();
		}
		
		
	}
}



