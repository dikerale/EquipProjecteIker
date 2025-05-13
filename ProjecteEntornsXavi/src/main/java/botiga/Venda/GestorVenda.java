package botiga.Venda;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestorVenda {
    ArrayList<Venda> vendas;

    public GestorVenda(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }
    public void afegirVenda(Venda venda) {
        this.vendas.add(venda);
    }


    public ArrayList<Venda> getVendesPerData(LocalDate data) {
        ArrayList<Venda> resultats = new ArrayList<>();
        for (Venda v : vendas) {
            if (v.getData().equals(data)) {
                resultats.add(v);
            }
        }
        return resultats;
    }
    public void mostrarVendasPerData(LocalDate data) {
        ArrayList<Venda> resultats = getVendesPerData(data);
        if (resultats.isEmpty()) {
            System.out.println("No s'han trobat vendes per la data: " + data);
        }else{
            for(Venda v : resultats) {
                System.out.println(v);
                System.out.println("-------------------------");
            }
        }
    }
}

