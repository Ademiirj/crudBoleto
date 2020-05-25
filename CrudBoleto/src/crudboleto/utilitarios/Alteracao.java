package crudboleto.utilitarios;

import crudboleto.*;
import java.util.List;
import java.util.Scanner;

public class Alteracao {
    Scanner leia = new Scanner(System.in);
    
    public void porNosso_numero(List<Boleto> boletos, List<Banco> bancos, List<Moeda> moedas, List<Cedente> cedentes, List<Sacado> sacados, List<Local_Pagamento> locais){
        String opcao;
        boolean resPesquisa = false;
        
        
        System.out.print("'Nosso numero' à pesquisar: ");
        opcao = leia.next().toUpperCase();
        

        for (int posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getNosso_numero().equals(opcao)) {
                Boleto boleto = new Boleto();
                boleto.entrada(escolheBanco(bancos), escolheMoeda(moedas), escolheCedente(cedentes), escolheSacado(sacados), escolheLocais(locais));
                
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
    
    public void porNumero_documento(List<Boleto> boletos, List<Banco> bancos, List<Moeda> moedas, List<Cedente> cedentes, List<Sacado> sacados, List<Local_Pagamento> locais){
        String opcao;
        boolean resPesquisa = false;
        
        
        System.out.print("'Numero do documento' à pesquisar: ");
        opcao = leia.next().toUpperCase();
        

        for (int posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getNum_documento().equals(opcao)) {
                Boleto boleto = new Boleto();
                boleto.entrada(escolheBanco(bancos), escolheMoeda(moedas), escolheCedente(cedentes), escolheSacado(sacados), escolheLocais(locais));
                
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
        new GerenciaLista().imprimeListaBancos(bancos);
        int opc = leia.nextInt();

        for (int posicao = 0; posicao < bancos.size(); posicao++) {
            if (bancos.get(posicao).getId() == opc) {
                return bancos.get(posicao);
            }
        }
        return bancos.get(0);
    }
    public Moeda escolheMoeda(List<Moeda> moedas) {
        new GerenciaLista().imprimeListaMoedas(moedas);
        int opc = leia.nextInt();

        for (int posicao = 0; posicao < moedas.size(); posicao++) {
            if (moedas.get(posicao).getId() == opc) {
                return moedas.get(posicao);
            }
        }
        return moedas.get(0);
    }

    public Cedente escolheCedente(List<Cedente> cedentes) {
        new GerenciaLista().imprimeListaCedentes(cedentes);
        int opc = leia.nextInt();

        for (int posicao = 0; posicao < cedentes.size(); posicao++) {
            if (cedentes.get(posicao).getId() == opc) {
                return cedentes.get(posicao);
            }
        }
        return cedentes.get(0);
    }
    
    public Sacado escolheSacado(List<Sacado> sacados) {
        new GerenciaLista().imprimeListaSacados(sacados);
        int opc = leia.nextInt();

        for (int posicao = 0; posicao < sacados.size(); posicao++) {
            if (sacados.get(posicao).getId() == opc) {
                return sacados.get(posicao);
            }
        }
        return sacados.get(0);
    }
    public Local_Pagamento escolheLocais(List<Local_Pagamento> locais) {
        new GerenciaLista().imprimeListaLocais(locais);
        int opc = leia.nextInt();

        for (int posicao = 0; posicao < locais.size(); posicao++) {
            if (locais.get(posicao).getId() == opc) {
                return locais.get(posicao);
            }
        }
        return locais.get(0);
    }
}
