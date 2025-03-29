package FabricaBolos;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        Bolo bolo = fabrica.criaBolo("Baunilha");
        System.out.println(bolo + " " + bolo.getPreco() + "€");
        
        Bolo bolo2 = fabrica.criaBolo("Chocolate");
        System.out.println(bolo2 + " " + bolo2.getPreco() + "€");
        
        Bolo bolo3 = fabrica.criaBolo("Chocolate");
        System.out.println(bolo3 + " " + bolo3.getPreco() + "€");
        
        Bolo bolo4 = fabrica.criaBolo("Cenoura");
        System.out.println(bolo4 + " " + bolo4.getPreco() + "€");
        
        Bolo bolo5 = fabrica.criaBolo("Pirata").adicionaTopping("com cobertura de Morango e Natas");
        System.out.println(bolo5 + " " + bolo5.getPreco() + "€");
    }
}
