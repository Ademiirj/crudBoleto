package crudboleto.utilitarios;

import crudboleto.Banco;
import crudboleto.Moeda;
import java.util.List;

public class GerenciaLista {
    
    public int imprimeListaBancos(List<Banco> bancos){
        System.out.println("Selecione um banco:");
        int posicao;
        
        for(posicao = 0; posicao < bancos.size(); posicao++){
        System.out.println(posicao + " - " + bancos.get(posicao).getNome()+ " ("+ bancos.get(posicao).getId() +")");
        }
        return posicao;
    }
    public int imprimeListaMoedas(List<Moeda> moedas){
        System.out.println("Selecione uma moeda:");
        int posicao;
        
        for(posicao = 0; posicao < moedas.size(); posicao++){
        System.out.println(moedas.get(posicao).getId() + " - " + moedas.get(posicao).getNome() + " (" + moedas.get(posicao).getCifra()+ ")");
        }
        return posicao;
    }
    
}
