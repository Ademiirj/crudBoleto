package crudboleto.utilitarios;

import crudboleto.Banco;
import crudboleto.Boleto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Consulta {
    Scanner leia = new Scanner(System.in);
    int posicao;
    int resPesquisa = 0;
    
    public void porNossoNumero(List<Boleto> boletos) {
        String opcao;
        resPesquisa = 0;
        System.out.print("'Nosso numero' à pesquisar: ");
        opcao = leia.next();
        

        for (posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getNosso_numero().equals(opcao)) {

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
    
    public void porCedente(List<Boleto> boletos) {
        String opcao;
        resPesquisa = 0;
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
    
    public void porSacado(List<Boleto> boletos) {
        String opcao;
        resPesquisa = 0;
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
    
    public void porNumero_documento(List<Boleto> boletos){
        String opcao;
        resPesquisa = 0;
        
        
        System.out.print("'Numero do documento' à pesquisar: ");
        opcao = leia.next();
        for (posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getNum_documento().equals(opcao)) {

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
    public void porIntervaloValorFinal(List<Boleto> boletos) {
        float intervalo_inicio, intervalor_fim;
        resPesquisa = 0;
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
    
    public void porIntervaloDesconto(List<Boleto> boletos) {
        float intervalo_inicio, intervalor_fim;
        resPesquisa = 0;
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
    
    public void porIntervaloMulta(List<Boleto> boletos) {
        float intervalo_inicio, intervalor_fim;
        resPesquisa = 0;
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
    
    public void porIntervaloAcrescimos(List<Boleto> boletos) {
        float intervalo_inicio, intervalor_fim;
        resPesquisa = 0;
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
        
    public void porIntevaloNumeroBoleto(List<Boleto> boletos) {
        int intervalo_inicio, intervalor_fim;
        resPesquisa = 0;
        
        System.out.print("Inicio do intervalo: ");
        intervalo_inicio = leia.nextInt();
        System.out.print("Fim do intervalo: ");
        intervalor_fim = leia.nextInt();
        

        for (posicao = 0; posicao < boletos.size(); posicao++) {
            if (boletos.get(posicao).getId()== intervalo_inicio) {

                imprimeConsulta(boletos, posicao);
                resPesquisa +=1;
                break;
            }
            intervalo_inicio += 1;
        }
        if (resPesquisa > 0) {
            System.out.print(resPesquisa + " resultados encontrados");
        }else{
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public void porIntervaloValorCobrado(List<Boleto> boletos) {
        float intervalo_inicio, intervalor_fim;
        resPesquisa = 0;
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
    
    public void porIntervaloVencimento(List<Boleto> boletos) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String intervalo_inicio, intervalor_fim;
        resPesquisa = 0;
        
        System.out.println("Inicio do intervalo:  (formato dia/mês/anos)");
        intervalo_inicio = leia.next();
        System.out.println("Fim do intervalo:  (formato dia/mês/anos) ");
        intervalor_fim = leia.next();
        
        LocalDate DataInicio = LocalDate.parse(intervalo_inicio,formatter);
        LocalDate DataFim  = LocalDate.parse(intervalor_fim,formatter);
        LocalDate DataBoletoParaAchar;
        
        posicao = 0;
        for (LocalDate d = DataInicio; !d.isAfter(DataFim); d = d.plusDays(1)) {
             
            if (d.equals(boletos.get(posicao).getVencimento())) {
                imprimeConsulta(boletos, posicao);
                resPesquisa +=1;
            }
            posicao += 1;
        }
        if (resPesquisa > 0) {
            System.out.print(resPesquisa + " resultados encontrados");
        }else{
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public void porIntervaloData(List<Boleto> boletos) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String intervalo_inicio, intervalor_fim;
        resPesquisa = 0;
        
        System.out.println("Inicio do intervalo:  (formato dia/mês/anos)");
        intervalo_inicio = leia.next();
        System.out.println("Fim do intervalo:  (formato dia/mês/anos) ");
        intervalor_fim = leia.next();
        
        LocalDate DataInicio = LocalDate.parse(intervalo_inicio,formatter);
        LocalDate DataFim  = LocalDate.parse(intervalor_fim,formatter);
        LocalDate DataBoletoParaAchar;
        
        
        for (LocalDate d = DataInicio; !d.isAfter(DataFim); d = d.plusDays(1)) {
             
            if (d.equals(boletos.get(posicao).getData_documento())) {
                imprimeConsulta(boletos, posicao);
                resPesquisa +=1;
            }
            posicao += 1;
        }
        if (resPesquisa > 0) {
            System.out.print(resPesquisa + " resultados encontrados");
        }else{
            System.out.println("\n=================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=================================================\n");
        }
    }
    
    public void porBanco(List<Boleto> boletos, List<Banco> bancos) {
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
