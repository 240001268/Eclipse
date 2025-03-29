package FabricaBolos;

import java.util.Arrays;

public class Bolo {
    private double preco;
    private String sabor;
    private String[] ingredientes;
    private boolean embalado;
    private boolean cozido;

    public Bolo(double preco) {
        this.preco = preco;
        this.ingredientes = new String[]{};
    }

    public double getPreco() {
        return preco;
    }

    public String getSabor() {
        return sabor;
    }

    @Override
    public String toString() {
        return "Embalado: " + (embalado ? "Sim" : "Não") + 
               " | Cozido: " + (cozido ? "Sim" : "Não") + 
               " | Bolo de " + sabor + 
               " (" + String.join(", ", ingredientes) + ")";
    }

    public Bolo criaBase() {
        this.ingredientes = new String[]{"Farinha", "Ovos", "Açúcar"};
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
