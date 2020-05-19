package crudboleto;

import crudboleto.utilitarios.Altera;
import crudboleto.utilitarios.Consulta;
import crudboleto.utilitarios.GerenciaLista;
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
    List<Moeda> listaMoedas = new ArrayList<>();

    public void Menu() {
//        setaEspecialidade();
        
        do {
            System.out.println("\nSeja bem vindo ao sistema de cadastro\n\n");

            System.out.println("Menu de categoria\ndigite o numero da Função desejada:");
            System.out.println("1- Paciente");
            System.out.println("2- Medico");
            System.out.println("0- Sair");

            opcMenu = leia.nextInt();

            switch (opcMenu) {
                case 1://INCLUIR BOLETO
                    Boleto boleto = new Boleto();
                    boleto.entrada(escolheBanco(listaBancos), escolheMoeda(listaMoedas));
                    listaBoletos.add(boleto);
                    break;

                case 2://ALTERAR BOLETO
                    Altera fazer = new Altera();
                    switch (menuAltera()) {
                        case 1://Consultar pelo número do documento
                            fazer.alteracaoPorNumero_documento(listaBoletos, listaBancos, listaMoedas);
                           break;
                        case 2: //Consultar pelo nosso número
                            fazer.alteracaoPorNosso_numero(listaBoletos, listaBancos, listaMoedas);
                           break;
                        default:
                            
                            break;
                    }
                    break;
                    
                case 3://Consultar Boletos
                    Consulta fazer2 = new Consulta();
                    switch(menuConsulta()){
                        case 1:
                            //consulta por banco
                            fazer2.consultaPorBanco(listaBoletos, listaBancos);
                            break;
                        case 2:
                            //Consulta pelo nosso número
                            fazer2.consultaPorNossoNumero(listaBoletos);
                            break;
                        case 3:
                            //Consulta por Cedente
                            fazer2.consultaPorCedente(listaBoletos);
                            break;
                        case 4:
                            //Consulta por Sacado
                            fazer2.consultaPorSacado(listaBoletos);
                            break;
                        case 5:
                            //Consulta por intervalo de data do documento
                            break;
                        case 6:
                            //Consulta por intervalo de vencimento
                            break;
                        case 7:
                            //Consulta por intervalo de valor do documento
                            fazer2.consultaPorIntervaloValorFinal(listaBoletos);
                            break;
                        case 8:
                            //Consulta por intervalo de desconto
                            fazer2.consultaPorIntervaloDesconto(listaBoletos);
                            break;
                        case 9:
                            //Consulta por intervalo de multa
                            fazer2.consultaPorIntervaloMulta(listaBoletos);
                            break;
                        case 10:
                            //Consulta por intervalo de outros acréscimos
                            fazer2.consultaPorIntervaloAcrescimos(listaBoletos);
                            break;
                        case 11:
                            //Consulta por intervalo de valor cobrado
                            fazer2.consultaPorIntervaloValorCobrado(listaBoletos);
                            break;
                    }
                    
                    break;
                case 4 ://EXCLUIR BOLETO
                    break;
                case 5://Listagem de Boletos por intervalo de número
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
        System.out.println("Menu de opções, digite o numero da função desejada ou 0 para voltar:");
        System.out.println("1 - Consultar pelo número do documento");
        System.out.println("2 - Consultar pelo nosso número");
        
        return leia.nextInt();
    }
    
    public Banco escolheBanco(List<Banco> bancos) {
        GerenciaLista lista = new GerenciaLista();
        
        lista.imprimeListaBancos(bancos);
        System.out.println((bancos.size()) + " - Para adicionar uma nova especialidade");
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
    public Moeda escolheMoeda(List<Moeda> moedas) {
        GerenciaLista lista = new GerenciaLista();
        
        lista.imprimeListaMoedas(moedas);
        System.out.println((moedas.size()) + " - Para adicionar uma nova especialidade");
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
}
