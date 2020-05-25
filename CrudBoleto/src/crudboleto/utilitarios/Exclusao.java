package crudboleto.utilitarios;

import crudboleto.Banco;
import crudboleto.Boleto;
import crudboleto.Moeda;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Exclusao {
    Scanner leia = new Scanner(System.in);
    
    public void porNumero_documento(List<Boleto> boletos){
        String opcao;
        boolean resPesquisa = false;
        
        
        System.out.print("'Numero do documento' à pesquisar: ");
        opcao = leia.next().toUpperCase();
        

        for (int posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getNum_documento().equals(opcao)) {
                resPesquisa = realizarExclusao(boletos, posicao);
                break;
            }
        }
        testaNenhumResultado(resPesquisa);
    }
    public void porVencimento(List<Boleto> boletos){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String opcao;
        boolean resPesquisa = false;
        
        
        System.out.print("Digite a data do vencimento no padrao dd/MM/yyyy:");
        opcao = leia.next();
        LocalDate DataBoletoParaAchar  = LocalDate.parse(opcao,formatter);
        
        
        for (int posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getVencimento().equals(DataBoletoParaAchar)) {
                resPesquisa = realizarExclusao(boletos, posicao);
                break;
            }
            DataBoletoParaAchar.plusDays(1);
        }
        testaNenhumResultado(resPesquisa);
    }
    
    public void porSacado(List<Boleto> boletos){
        String opcao;
        boolean resPesquisa = false;
        
        
        System.out.print("'Sacado' à pesquisar: ");
        opcao = leia.next().toUpperCase();

        for (int posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getSacado().equals(opcao)) {
                resPesquisa = realizarExclusao(boletos, posicao);
                break;
            }
        }
        testaNenhumResultado(resPesquisa);
    }
    
    public void porValorTotal(List<Boleto> boletos){
        int opcao;
        boolean resPesquisa = false;
        
        
        System.out.print("Valor do boleto à pesquisar: ");
        opcao = leia.nextInt();

        for (int posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getValor_total() == opcao) {
                resPesquisa = realizarExclusao(boletos, posicao);
                break;
            }
        }
        testaNenhumResultado(resPesquisa);
    }

    public void porValorCobrado(List<Boleto> boletos){
        int opcao;
        boolean resPesquisa = false;
        
        
        System.out.print("Valor cobrado do boleto à pesquisar: ");
        opcao = leia.nextInt();

        for (int posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getValor_documento() == opcao) {
                resPesquisa = realizarExclusao(boletos, posicao);
                break;
            }
        }
        testaNenhumResultado(resPesquisa);
    }
    
    private void testaNenhumResultado(boolean resPesquisa) {
        if (resPesquisa == false) {
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }

    private boolean realizarExclusao(List<Boleto> boletos, int posicao) {
        boolean resPesquisa;
        boletos.remove(posicao);
        resPesquisa = true;
        System.out.println("\n=================================================\n");
        System.out.println("Exclusão feita com sucesso");
        System.out.println("\n=================================================\n");
        return resPesquisa;
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
