package FabricaBolos;

public class Fabrica {
	private static Forno forno;

	// Factory "Ter uma classe responsavel 
	// por centralizar a logica de "negocio"
	public Bolo CriaBolo(String sabor) {
		var preco = 0;

		switch(sabor)
		{
			case "Baunilha":
				preco=5;
				break;
			case "Chocolate":
				preco=10;
				break;
			case "Cenoura":
				preco=8;
				break;
			case "MilFolhas":
				preco=12;
				break;
		}
		var bolo= new Bolo(preco)
				  .criaBase()
				  .adicionaSabor(sabor)
				  .adicionarEmbalagem();
		
		bolo = this.Forno(bolo);
		
		return bolo;
	}
	
	public Forno getForno() {
		if(forno == null)
			forno = new Forno();
		
		return forno;
	}
	private Bolo Forno(Bolo bolo) {
		if (!this.getForno().Ocupado)
		{
			forno.Ocupado = true;
			bolo = bolo.cozerBolo();
		}
		else
		{
			System.out.println("Forno Ocupado");
		}
		return bolo;
	}

}
