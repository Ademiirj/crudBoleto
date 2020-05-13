package cadastromedicopaciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public Menu(){
        Menu();
    }
    int opcMenu;
    int opcSub;
    int opcSub2;
    Scanner leia = new Scanner(System.in);
    
    List<Paciente> listaPacientes = new ArrayList<>();
    List<Medico> listaMedicos = new ArrayList<>();
    
    public void Menu() {
        do{
        System.out.println("\nSeja bem vindo ao sistema de cadastro\n\n");

        System.out.println("Menu de categoria, digite o numero da funÃ§Ã£o desejada:");
        System.out.println("1- Paciente");
        System.out.println("2- Medico");
        System.out.println("0- Sair");

        opcMenu = leia.nextInt();

        switch (opcMenu) {
            case 1://Paciente
                switch (menuGeral()){
                    case 1://Escolheu Adicionar Paciente
                        Paciente paciente = new Paciente();
                        paciente.entrada();
                        listaPacientes.add(paciente);
                        break;
                    case 2://Escolheu Buscar Paciente
                        Consulta fazer = new Consulta();
                        switch (menuConsulta()) {
                            case 1:
                                fazer.consultaPorId(listaPacientes);
                                break;
                            case 2:
                                fazer.consultaPorPosicao(listaPacientes);
                                break;
                            case 3:
                                fazer.consultaPorNome(listaPacientes);
                                break;
                        }
                        break;
                }
                break;
                
            case 2://Medico
                switch (menuGeral()){
                    case 1://Escolheu Adicionar Medico
                        Medico medico = new Medico();
                        medico.entrada();
                        listaMedicos.add(medico);
                        break;
                    case 2: //Escolheu buscar um medico
                        Consulta fazer = new Consulta();
                        switch (menuConsultaMed()) {
                            case 1:
                                fazer.consultaPorId(listaMedicos);
                                break;
                            case 2:
                                fazer.consultaPorPosicao(listaMedicos);
                                break;
                            case 3:
                                fazer.consultaPorNome(listaMedicos);
                                break;
                            case 4:
                                fazer.consultaPorCrm(listaMedicos);
                                break;
                            case 5:
                                fazer.consultaPorEspecialidade(listaMedicos);
                                break;
                        }
                }break;
            case 0://Fazer a saida do Menu
        }
    } while(opcMenu!=0);
    }
    public int menuConsulta(){
        System.out.println("Menu de opções, digite o numero da função desejada ou 0 para voltar:");
        System.out.println("1 - Por ID");
        System.out.println("2 - Por Posicao");
        System.out.println("3 - Por nome");
        
        return resConsulta();
    }
    public int menuConsultaMed(){
        System.out.println("Menu de opções, digite o numero da função desejada ou 0 para voltar:");
        System.out.println("1 - Por ID");
        System.out.println("2 - Por Posicao");
        System.out.println("3 - Por nome");
        System.out.println("4 - Por CRM");
        System.out.println("5 - Por Especialidade");
        
        return resConsulta();
    }
    public int resConsulta(){
        opcSub = leia.nextInt();
        return opcSub;
    }
    public int menuGeral(){
        System.out.println("1- Cadastrar");
        System.out.println("2- Conultar");
        System.out.println("0- Sair");
        
        opcSub = leia.nextInt();
        return opcSub;
    }
    
    
        
}
