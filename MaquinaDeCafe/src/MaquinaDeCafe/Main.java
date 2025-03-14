package MaquinaDeCafe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcao=0, CafeExpresso=0, CafeCapuchino=0, LeiteCafe=0, Finalizar=0;
		double ValorExpresso,ValorCapuchino,ValorLeiteCafe,ValorFinal;
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println( "Seleccione as seguintes opções: \n" +
								"1 - Café expresso \n"  +
								"2 - Café capuchino \n" +
								"3 - Leite com café \n" +
								"4 - Finalizar compra");	
				
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				CafeExpresso ++;			
			}
			else if (opcao == 2) {
				CafeCapuchino ++;
			}
			else if (opcao == 3) {
				LeiteCafe ++;	
			}
			else if (opcao != 4) {
				System.out.println("Opção inválida!");
			}		
			
		}while (opcao != 4);
		
		ValorExpresso=CafeExpresso*0.80;
		ValorCapuchino=CafeCapuchino*1.10;
		ValorLeiteCafe=LeiteCafe*0.9;
		Finalizar=CafeExpresso+CafeCapuchino+LeiteCafe;
		ValorFinal=ValorExpresso+ValorCapuchino+ValorLeiteCafe;
		
		System.out.println("Qte café expresso: " + CafeExpresso + "- valor é. " + ValorExpresso);
		System.out.println("Qte café capuchino: " + CafeCapuchino + "- valor é. " + ValorCapuchino);
		System.out.println("Qte leite café: " + LeiteCafe + "- valor é. " + ValorLeiteCafe);
	}
}


