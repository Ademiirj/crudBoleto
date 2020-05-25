package crudboleto.utilitarios;

import crudboleto.Banco;
import crudboleto.Cedente;
import crudboleto.Local_Pagamento;
import crudboleto.Moeda;
import crudboleto.Sacado;
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
    
    public int imprimeListaLocais(List<Local_Pagamento> locais){
        System.out.println("Selecione um local:");
        int posicao;
        
        for(posicao = 0; posicao < locais.size(); posicao++){
        System.out.println(posicao + " - " + locais.get(posicao).getNome()+ " ("+ locais.get(posicao).getId() +")");
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
    public int imprimeListaCedentes(List<Cedente> cedentes){
        System.out.println("Selecione um Cedente:");
        int posicao;
        
        for(posicao = 0; posicao < cedentes.size(); posicao++){
        System.out.println(posicao + " - " + cedentes.get(posicao).getNome()+ " ("+ cedentes.get(posicao).getId() +")");
        }
        return posicao;
    }
    public int imprimeListaSacados(List<Sacado> sacados){
        System.out.println("Selecione um Sacado:");
        int posicao;
        
        for(posicao = 0; posicao < sacados.size(); posicao++){
        System.out.println(posicao + " - " + sacados.get(posicao).getNome()+ " ("+ sacados.get(posicao).getId() +")");
        }
        return posicao;
    }
    
}
