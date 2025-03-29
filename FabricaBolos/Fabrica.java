package FabricaBolos;

public class Fabrica {
    private static Forno forno;

    public Bolo criaBolo(String sabor) {
        int preco = switch (sabor) {
            case "Baunilha" -> 5;
            case "Chocolate" -> 10;
            case "Cenoura" -> 8;
            case "Pirata" -> 12;
            default -> 0;
        };

        Bolo bolo = new Bolo(preco)
            .criaBase()
            .adicionaSabor(sabor)
            .adicionarEmbalagem();
        
        return assarBolo(bolo);
    }

    private Forno getForno() {
        if (forno == null) {
            forno = new Forno();
        }
        return forno;
    }

    private Bolo assarBolo(Bolo bolo) {
        if (!getForno().isOcupado()) {
            forno.setOcupado(true);
            bolo = bolo.cozerBolo();
        } else {
            System.out.println("Forno Ocupado");
        }
        return bolo;
    }
}
