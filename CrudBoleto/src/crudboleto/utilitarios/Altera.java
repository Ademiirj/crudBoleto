package crudboleto.utilitarios;

import crudboleto.Banco;
import crudboleto.Boleto;
import crudboleto.Moeda;
import java.util.List;
import java.util.Scanner;

public class Altera {
    Scanner leia = new Scanner(System.in);
    
    public void alteracaoPorNosso_numero(List<Boleto> boletos, List<Banco> bancos, List<Moeda> moedas){
        String opcao;
        boolean resPesquisa = false;
        
        
        System.out.print("'Nosso numero' à pesquisar: ");
        opcao = leia.next().toUpperCase();
        

        for (int posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getNosso_numero().equals(opcao)) {
                Boleto boleto = new Boleto();
                boleto.entrada(escolheBanco(bancos), escolheMoeda(moedas));
                
                boletos.set(posicao,boleto);
                resPesquisa = true;
                
                System.out.println("\n=================================================\n");
                System.out.println("Alteração feita com sucesso");
                System.out.println("\n=================================================\n");
                break;
            }
        }
        if (resPesquisa == false) {
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public void alteracaoPorNumero_documento(List<Boleto> boletos, List<Banco> bancos, List<Moeda> moedas){
        String opcao;
        boolean resPesquisa = false;
        
        
        System.out.print("'Numero do documento' à pesquisar: ");
        opcao = leia.next().toUpperCase();
        

        for (int posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getNum_documento().equals(opcao)) {
                Boleto boleto = new Boleto();
                boleto.entrada(escolheBanco(bancos), escolheMoeda(moedas));
                
                boletos.set(posicao,boleto);
                resPesquisa = true;
                
                System.out.println("\n=================================================\n");
                System.out.println("Alteração feita com sucesso");
                System.out.println("\n=================================================\n");
                break;
            }
        }
        if (resPesquisa == false) {
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public Banco escolheBanco(List<Banco> bancos) {
        GerenciaLista lista = new GerenciaLista();

        lista.imprimeListaBancos(bancos);
        int opc = leia.nextInt();

        for (int posicao = 0; posicao < bancos.size(); posicao++) {
            if (bancos.get(posicao).getId() == opc) {
                return bancos.get(posicao);
            }
        }
        return bancos.get(0);
    }
    public Moeda escolheMoeda(List<Moeda> moedas) {
        GerenciaLista lista = new GerenciaLista();

        lista.imprimeListaMoedas(moedas);
        int opc = leia.nextInt();

        for (int posicao = 0; posicao < moedas.size(); posicao++) {
            if (moedas.get(posicao).getId() == opc) {
                return moedas.get(posicao);
            }
        }
        return moedas.get(0);
    }
}
