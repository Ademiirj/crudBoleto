package crudboleto.utilitarios;

import crudboleto.Banco;
import crudboleto.Boleto;
import java.util.List;
import java.util.Scanner;

public class Consulta {
    Scanner leia = new Scanner(System.in);
    int posicao;
    int resPesquisa = 0;
    
    public void consultaPorNossoNumero(List<Boleto> boletos) {
        String opcao;
        System.out.print("'Nosso numero' à pesquisar: ");
        opcao = leia.next().toUpperCase();
        

        for (posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getSacado().equals(opcao)) {

                imprimeConsulta(boletos, posicao);
                resPesquisa +=1;
                break;
            }
        }
        if (resPesquisa > 0) {
            System.out.print(resPesquisa + " resultados encontrados");
        }else{
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public void consultaPorCedente(List<Boleto> boletos) {
        String opcao;
        System.out.print("Nome do cedente à pesquisar: ");
        opcao = leia.next().toUpperCase();
        
        
        for (posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getCedente().equals(opcao)) {

                imprimeConsulta(boletos, posicao);
                resPesquisa +=1;
            }
        }
        if (resPesquisa > 0) {
            System.out.print(resPesquisa + " resultados encontrados");
        }else{
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }    
    
    public void consultaPorSacado(List<Boleto> boletos) {
        String opcao;
        System.out.print("Nome do sacado à pesquisar: ");
        opcao = leia.next().toUpperCase();
        
        
        for (posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getSacado().equals(opcao)) {

                imprimeConsulta(boletos, posicao);
                resPesquisa +=1;
            }
        }
        if (resPesquisa > 0) {
            System.out.print(resPesquisa + " resultados encontrados");
        }else{
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public void consultaPorIntervaloValorFinal(List<Boleto> boletos) {
        float intervalo_inicio, intervalor_fim;
        System.out.print("Inicio do intervalo: ");
        intervalo_inicio = leia.nextFloat();
        System.out.print("Fim do intervalo: ");
        intervalor_fim = leia.nextFloat();
        
        
        for (posicao = 0; posicao < boletos.size(); posicao++) {
            if (intervalo_inicio <= boletos.get(posicao).getValor_total() && boletos.get(posicao).getValor_total() <= intervalor_fim) {
                imprimeConsulta(boletos, posicao);
                resPesquisa +=1;
            }
        }
        if (resPesquisa > 0) {
            System.out.println("\033[34m Pesquisa realizada com sucesso \033[m");
            System.out.print(resPesquisa + " resultados encontrados");
        }else{
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public void consultaPorIntervaloDesconto(List<Boleto> boletos) {
        float intervalo_inicio, intervalor_fim;
        System.out.print("Inicio do intervalo: ");
        intervalo_inicio = leia.nextFloat();
        System.out.print("Fim do intervalo: ");
        intervalor_fim = leia.nextFloat();
        
        
        for (posicao = 0; posicao < boletos.size(); posicao++) {
            if (intervalo_inicio <= boletos.get(posicao).getDescontos() && boletos.get(posicao).getDescontos() <= intervalor_fim) {
                imprimeConsulta(boletos, posicao);
                resPesquisa +=1;
            }
        }
        if (resPesquisa > 0) {
            System.out.print(resPesquisa + " resultados encontrados");
        }else{
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public void consultaPorIntervaloMulta(List<Boleto> boletos) {
        float intervalo_inicio, intervalor_fim;
        System.out.print("Inicio do intervalo: ");
        intervalo_inicio = leia.nextFloat();
        System.out.print("Fim do intervalo: ");
        intervalor_fim = leia.nextFloat();
        
        
        for (posicao = 0; posicao < boletos.size(); posicao++) {
            if (intervalo_inicio <= boletos.get(posicao).getMulta() && boletos.get(posicao).getMulta() <= intervalor_fim) {
                imprimeConsulta(boletos, posicao);
                resPesquisa +=1;
            }
        }
        if (resPesquisa > 0) {
            System.out.print(resPesquisa + " resultados encontrados");
        }else{
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public void consultaPorIntervaloAcrescimos(List<Boleto> boletos) {
        float intervalo_inicio, intervalor_fim;
        System.out.print("Inicio do intervalo: ");
        intervalo_inicio = leia.nextFloat();
        System.out.print("Fim do intervalo: ");
        intervalor_fim = leia.nextFloat();
        
        
        for (posicao = 0; posicao < boletos.size(); posicao++) {
            if (intervalo_inicio <= boletos.get(posicao).getAcrescimos() && boletos.get(posicao).getAcrescimos() <= intervalor_fim) {
                imprimeConsulta(boletos, posicao);
                resPesquisa +=1;
            }
        }
        if (resPesquisa > 0) {
            System.out.print(resPesquisa + " resultados encontrados");
        }else{
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public void consultaPorIntervaloValorCobrado(List<Boleto> boletos) {
        float intervalo_inicio, intervalor_fim;
        System.out.print("Inicio do intervalo: ");
        intervalo_inicio = leia.nextFloat();
        System.out.print("Fim do intervalo: ");
        intervalor_fim = leia.nextFloat();
        
        
        for (posicao = 0; posicao < boletos.size(); posicao++) {
            if (intervalo_inicio <= boletos.get(posicao).getValor_documento() && boletos.get(posicao).getValor_documento() <= intervalor_fim) {
                imprimeConsulta(boletos, posicao);
                resPesquisa +=1;
            }
        }
        if (resPesquisa > 0) {
            System.out.print(resPesquisa + " resultados encontrados");
        }else{
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public void consultaPorBanco(List<Boleto> boletos, List<Banco> bancos) {
        Banco banco;
        resPesquisa = 0;

        banco = escolheBanco(bancos);

        for (posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getBanco().equals(banco.getNome())) {

                imprimeConsulta(boletos, posicao);
                resPesquisa += 1;
            }
        }
        if (resPesquisa > 0) {
            System.out.print(resPesquisa + " resultados encontrados");
        }else{
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public Banco escolheBanco(List<Banco> bancos) {
        GerenciaLista lista = new GerenciaLista();

        lista.imprimeListaBancos(bancos);
        int opc = leia.nextInt();

        for (posicao = 0; posicao < bancos.size(); posicao++) {
            if (bancos.get(posicao).getId() == opc) {
                return bancos.get(posicao);
            }
        }
        return bancos.get(0);
    }
    
    public void imprimeConsulta(List<Boleto> boletos, int posicao) {
            System.out.println("\n=================================================\n");
            System.out.println("Posição na lista: " + posicao);
            boletos.get(posicao).imprimir();
            System.out.println("\n=================================================\n");
        }
}
