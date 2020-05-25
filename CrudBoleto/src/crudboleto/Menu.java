package crudboleto;

import crudboleto.utilitarios.Alteracao;
import crudboleto.utilitarios.Consulta;
import crudboleto.utilitarios.Exclusao;
import crudboleto.utilitarios.GerenciaLista;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    

    public Menu() {
        Menu();
    }
    int opcMenu;
    int opcSub;
    int opcSub2;

    Scanner leia = new Scanner(System.in);
    List<Boleto> listaBoletos = new ArrayList<>();
    List<Banco> listaBancos = new ArrayList<>();
    List<Cedente> listaCedentes = new ArrayList<>();
    List<Sacado> listaSacados = new ArrayList<>();
    List<Moeda> listaMoedas = new ArrayList<>();
    List<Local_Pagamento> listaLocais = new ArrayList<>();

    public void Menu() {
        setaMoeda();
        fakerBoleto();
        
        do {
            System.out.println("\nSeja bem vindo ao sistema de cadastro\n\n");

            System.out.println("Menu de categoria\ndigite o numero da Função desejada:");
            System.out.println("1 - Incluir Boleto");
            System.out.println("2 - Alterar Boleto");
            System.out.println("3 - Consultar Boletos");
            System.out.println("4 - Excluir Boleto");
            System.out.println("5 - Listagem de Boletos por intervalo de número");
            System.out.println("0 - Sair");

            opcMenu = leia.nextInt();

            switch (opcMenu) {
                case 1://INCLUIR BOLETO
                    Boleto boleto = new Boleto();
                    boleto.entrada(escolheBanco(listaBancos), escolheMoeda(listaMoedas), escolheCedente(listaCedentes), escolheSacado(listaSacados), escolheLocal(listaLocais));
                    listaBoletos.add(boleto);
                    break;

                case 2://ALTERAR BOLETO
                    switch (menuAltera()) {
                        case 1://Consultar pelo número do documento
                            new Alteracao().porNumero_documento(listaBoletos, listaBancos, listaMoedas, listaCedentes, listaSacados, listaLocais);
                           break;
                        case 2: //Consultar pelo nosso número
                            new Alteracao().porNosso_numero(listaBoletos, listaBancos, listaMoedas, listaCedentes, listaSacados, listaLocais);
                           break;
                        default:
                            System.out.println("Valor não reconhecido");
                            break;
                    }
                    break;
                    
                case 3://Consultar Boletos
                    switch(menuConsulta()){
                        case 1:
                            //consulta por banco
                            new Consulta().porBanco(listaBoletos, listaBancos);
                            break;
                        case 2:
                            //Consulta pelo nosso número
                            new Consulta().porNossoNumero(listaBoletos);
                            break;
                        case 3:
                            //Consulta por Cedente
                            new Consulta().porCedente(listaBoletos);
                            break;
                        case 4:
                            //Consulta por Sacado
                            new Consulta().porSacado(listaBoletos);
                            break;
                        case 5:
                            //Consulta por intervalo de data do documento
                            new Consulta().porIntervaloData(listaBoletos);
                            
                            break;
                        case 6:
                            //Consulta por intervalo de vencimento
                            new Consulta().porIntervaloVencimento(listaBoletos);
                            break;
                        case 7:
                            //Consulta por intervalo de valor do documento
                            new Consulta().porIntervaloValorFinal(listaBoletos);
                            break;
                        case 8:
                            //Consulta por intervalo de desconto
                            new Consulta().porIntervaloDesconto(listaBoletos);
                            break;
                        case 9:
                            //Consulta por intervalo de multa
                            new Consulta().porIntervaloMulta(listaBoletos);
                            break;
                        case 10:
                            //Consulta por intervalo de outros acréscimos
                            new Consulta().porIntervaloAcrescimos(listaBoletos);
                            break;
                        case 11:
                            //Consulta por intervalo de valor cobrado
                            new Consulta().porIntervaloValorCobrado(listaBoletos);
                            break;
                            default:
                            System.out.println("Valor não reconhecido");
                            break;
                    }
                    
                    break;
                case 4 ://EXCLUIR BOLETO
                    switch (menuExclui()) {
                        case 1://Pelo Número
                            new Exclusao().porNumero_documento(listaBoletos);
                           break;
                        case 2: //Por Sacado
                            new Exclusao().porSacado(listaBoletos);
                           break;
                        case 3://Por Vencimento
                            new Exclusao().porVencimento(listaBoletos);
                           break;
                        case 4: //Por Valor do Documento
                            new Exclusao().porValorTotal(listaBoletos);
                           break;
                        case 5: //Por Valor Cobrado
                            new Exclusao().porValorCobrado(listaBoletos);
                           break;
                        default:
                            System.out.println("Valor não reconhecido");
                            break;
                    }
                    break;
                case 5://Listagem de Boletos por intervalo de número
                    new Consulta().porIntevaloNumeroBoleto(listaBoletos);
                    break; 
                default:
                    System.out.println("Valor não reconhecido");
                    break;
            }
        } while (opcMenu != 0);
    }

    public int menuConsulta() {
        System.out.println("Menu de opções, digite o numero da função desejada ou 0 para voltar:");
        System.out.println("1 - Consulta por banco");
        System.out.println("2 - Consulta pelo nosso número");
        System.out.println("3 - Consulta por Cedente");
        System.out.println("4 - Consulta por Sacado");
        System.out.println("5 - Consulta por intervalo de data do documento");
        System.out.println("6 - Consulta por intervalo de vencimento");
        System.out.println("7 - Consulta por intervalo de valor do documento");
        System.out.println("8 - Consulta por intervalo de desconto");
        System.out.println("9 - Consulta por intervalo de multa");
        System.out.println("10 - Consulta por intervalo de outros acréscimos");
        System.out.println("11 - Consulta por intervalo de valor cobrado");

        return leia.nextInt();
    }

    public int menuGeral() {
        System.out.println("1- Cadastrar");
        System.out.println("2- Alterar");
        System.out.println("3- Consultar");
        System.out.println("4- Excluir");
        System.out.println("5- Listar por intervalo");
        System.out.println("0- Sair");

        return leia.nextInt();
    }
    public int menuAltera() {
        System.out.println("Submenu de opções, digite o numero da função desejada ou 0 para voltar:");
        System.out.println("1 - Consultar pelo número do documento");
        System.out.println("2 - Consultar pelo nosso número");
        
        return leia.nextInt();
    }
    public int menuExclui() {
        System.out.println("Submenu de opções, digite o numero da função desejada ou 0 para voltar:");
        System.out.println("1 - Pelo Número");
        System.out.println("2 - Por Sacado");
        System.out.println("3 - Por Vencimento");
        System.out.println("4 - Por Valor do Documento");
        System.out.println("5 - Por Valor Cobrado");
        
        return leia.nextInt();
    }
    
    public Banco escolheBanco(List<Banco> bancos) {
        GerenciaLista lista = new GerenciaLista();
        
        lista.imprimeListaBancos(bancos);
        System.out.println((bancos.size()) + " - Para adicionar um novo banco");
        int opc = leia.nextInt();
        do{
        if (opc == (bancos.size())) {
            Banco novoBanco = new Banco();
            novoBanco.entrada();
            listaBancos.add(novoBanco);
            return novoBanco;
        }if(opc >= bancos.size()){
            for (int posicao = 0; posicao < bancos.size(); posicao++) {
                if (bancos.get(posicao).getId() == opc) {
                    return bancos.get(posicao);
                }
            }
        }
        }while(opc < bancos.size());
        return bancos.get(0);
    }
    public Local_Pagamento escolheLocal(List<Local_Pagamento> locais) {
        GerenciaLista lista = new GerenciaLista();
        
        lista.imprimeListaLocais(locais);
        System.out.println((locais.size()) + " - Para adicionar um novo Local");
        int opc = leia.nextInt();
        do{
        if (opc == (locais.size())) {
            Local_Pagamento novoLocal = new Local_Pagamento();
            novoLocal.entrada();
            listaLocais.add(novoLocal);
            return novoLocal;
        }if(opc >= locais.size()){
            for (int posicao = 0; posicao < locais.size(); posicao++) {
                if (locais.get(posicao).getId() == opc) {
                    return locais.get(posicao);
                }
            }
        }
        }while(opc < locais.size());
        return locais.get(0);
    }
    public Moeda escolheMoeda(List<Moeda> moedas) {
        GerenciaLista lista = new GerenciaLista();
        
        lista.imprimeListaMoedas(moedas);
        System.out.println((moedas.size()) + " - Para adicionar uma nova moeda");
        int opc = leia.nextInt();
        do{
        if (opc == (moedas.size())) {
            Moeda novaMoeda = new Moeda();
            novaMoeda.entrada();
            listaMoedas.add(novaMoeda);
            return novaMoeda;
        }
        else if(opc >= moedas.size()){
            for (int posicao = 0; posicao < moedas.size(); posicao++) {
                if (moedas.get(posicao).getId() == opc) {
                    return moedas.get(posicao);
                }
            }
        }
        }while(opc < moedas.size());
        return moedas.get(0);
    }
    public Cedente escolheCedente(List<Cedente> cedentes) {
        GerenciaLista lista = new GerenciaLista();
        
        lista.imprimeListaCedentes(cedentes);
        System.out.println((cedentes.size()) + " - Para adicionar um novo cedentes");
        int opc = leia.nextInt();
        do{
        if (opc == (cedentes.size())) {
            Cedente novoCedente = new Cedente();
            novoCedente.entrada();
            listaCedentes.add(novoCedente);
            return novoCedente;
        }
        else if(opc >= cedentes.size()){
            for (int posicao = 0; posicao < cedentes.size(); posicao++) {
                if (cedentes.get(posicao).getId() == opc) {
                    return cedentes.get(posicao);
                }
            }
        }
        }while(opc < cedentes.size());
        return cedentes.get(0);
    }
    
    public Sacado escolheSacado(List<Sacado> sacados) {
        GerenciaLista lista = new GerenciaLista();
        
        lista.imprimeListaSacados(sacados);
        System.out.println((sacados.size()) + " - Para adicionar um novo sacado");
        int opc = leia.nextInt();
        do{
        if (opc == (sacados.size())) {
            Sacado novoSacado = new Sacado();
            novoSacado.entrada();
            listaSacados.add(novoSacado);
            return novoSacado;
        }
        else if(opc >= sacados.size()){
            for (int posicao = 0; posicao < sacados.size(); posicao++) {
                if (sacados.get(posicao).getId() == opc) {
                    return sacados.get(posicao);
                }
            }
        }
        }while(opc < sacados.size());
        return sacados.get(0);
    }

    public void fakerBoleto() {
        System.out.print("Quantidade de faker para adicionar: ");
        int qtde = leia.nextInt();
         
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataPadrao  = LocalDate.parse("01/01/2010",formatter);
        Local_Pagamento fakeLocal = new Local_Pagamento(0,"Qualquer loterica");
        for (int i = 0; i < qtde; i++) {
            Boleto fakeBoleto = new Boleto();
            Banco fakeBanco = new Banco();
            

            int id = (i + 1);
            fakeBanco.setId(id);
            fakeBanco.setNome("BANCO" + id);
            fakeBoleto.setId(id);
            listaBancos.add(fakeBanco);
            fakeBoleto.setBanco(fakeBanco);
            
            Sacado fakeSacado = new Sacado("SACADO" + id);
            Cedente fakeCedente = new Cedente("CEDENTE" + id);
            
            fakeBoleto.setMoeda(listaMoedas.get(0));
            fakeBoleto.setSacado(fakeSacado);
            fakeBoleto.setCedente(fakeCedente);
            fakeBoleto.setData_documento(fakerData(dataPadrao, id));
            fakeBoleto.setVencimento(fakerData(dataPadrao, (id + 20)));
            
            fakeBoleto.setNum_boleto(id + "." + id + "." +id + "." + id);
            fakeBoleto.setNosso_numero(id + "." + id);
            fakeBoleto.setCarteira(id);
            fakeBoleto.setNum_documento(id + "." + id + "." +id + "." + id);
            fakeBoleto.setAceite(id + "." + id + "." + id + "." + id);
            fakeBoleto.setInstrucoes("Instrucao 1\nInstrucao 2\nInstrucao 3");
            fakeBoleto.setValor_documento(30+id);
            fakeBoleto.setMulta(id);
            fakeBoleto.setAcrescimos(id);
            fakeBoleto.setDescontos(id);
            fakeBoleto.setDeducoes(id);
            fakeBoleto.setValor_total(calculaValorTotalDo(fakeBoleto));
            fakeBoleto.setLocal_pagamento(fakeLocal);
            listaBoletos.add(fakeBoleto);
        }
    }

    private LocalDate fakerData(LocalDate data, int incremento) {
        return data.plusDays(incremento*10);
    }
    
    private float calculaValorTotalDo(Boleto boleto){
            return boleto.getValor_documento() + boleto.getMulta() + boleto.getAcrescimos()- boleto.getDescontos() - boleto.getDeducoes();
        }

    private void setaMoeda() {
        Moeda moedaInicial = new Moeda(0, "Real", "R$");
        listaMoedas.add(moedaInicial);}
}