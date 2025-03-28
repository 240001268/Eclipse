package FabricaBolos;

import java.util.Arrays;

public class Bolo {

	private double preco;
	private String sabor;
	private String[] ingredientes;
	private String[] topping;
	private boolean embalado;
	private boolean cozido;

	public Bolo(double preco) {
		this.Preco = preco;
	}

	// Gets e Sets "Tradicionais"
	private double Preco = 0;

	private void setPreco(double preco) {
		Preco = preco;
	}

	public double getPreco() {
		return Preco;
	}

	private String Sabor = " ";

	private void setSabor(String sabor) {
		Sabor = sabor;
	}

	public String getSabor() {
		return Sabor;
	}

	// Overide do ToString;
	@Override
	public String toString() {
		return "Embalado " + (embalado ? "Sim" : "Não") 
				+ " Cozido " + (cozido ? "Sim" : "Não")
				+ " Bolo de " 
				+ sabor
				+ "(" + String.join(" ", ingredientes) + ")" ;
	}

	// Caracteristica do Builder é devolver o mesmo tipo de ele mesmo.
	public Bolo criaBase() {
		this.ingredientes = new String[] { "Farinha", "Ovos", "Açucar" };
		return this;
	}
	public Bolo criaToppinh() {
		this.topping = new String[] { "Natas", "Morangos", "Bege" };
		return this;
	}
	public Bolo adicionaSabor(String sabor) {

		this.ingredientes = Arrays.copyOf(this.ingredientes, this.ingredientes.length + 1);
		this.ingredientes[this.ingredientes.length - 1] = sabor;
		
		
		
		this.sabor = sabor;
		return this;
	}

	public Bolo adicionaTopping(String topping) {

		this.ingredientes = Arrays.copyOf(this.ingredientes, this.ingredientes.length + 1);
		this.ingredientes[this.ingredientes.length - 1] = topping;
		this.sabor = sabor;
		return this;

	}

	public Bolo adicionarEmbalagem() {
		this.embalado = true;
		return this;
	}

	public Bolo cozerBolo() {
		this.cozido = true;
		return this;
	}
}
