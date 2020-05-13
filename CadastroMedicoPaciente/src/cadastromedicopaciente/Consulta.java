package cadastromedicopaciente;

import java.util.List;
import java.util.Scanner;

public class Consulta {
    Scanner leia = new Scanner(System.in);
    boolean encontrou;
    int posicao;

    public void consultaPorNome (List<? extends Pessoa> pessoas){
        String nome;
        System.out.print("Nome da pessoa à pesquisar: ");
        nome = leia.next().toUpperCase();
        boolean resPesquisa = false;
        
        for(posicao = 0; posicao < pessoas.size(); posicao++){
            if (pessoas.get(posicao).getNome().equals(nome)) {
            
            imprimeConsulta(pessoas,posicao);
            resPesquisa = true;
            break;
            }
            if (resPesquisa == false){
                System.out.println("Nenhum médico cadastrado dessa especialidade");
            }
        }
        
    }
    public void consultaPorId (List<? extends Pessoa> pessoas){
        int id;
        System.out.print("Nome do aluno à pesquisar: ");
        id = leia.nextInt();
        
        boolean resPesquisa = false;
        for(posicao = 0; posicao < pessoas.size(); posicao++){
            if (pessoas.get(posicao).getId() == id) {
            
            imprimeConsulta(pessoas,posicao);
            resPesquisa = true;
            break;
            }
            if (resPesquisa == false){
                System.out.println("Nenhum médico cadastrado dessa especialidade");
            }
    
    }
    }
    
    public void consultaPorPosicao (List<? extends Pessoa> pessoas){
        int posicaoArray;
        System.out.print("Numero da posicao à pesquisar: ");
        posicaoArray = leia.nextInt();
        
        try{
            pessoas.indexOf(posicaoArray);
            imprimeConsulta(pessoas,posicaoArray);
        }catch(IndexOutOfBoundsException ex){
            System.out.println("Esta posicação não existe na lista");
        }
    }
    
    public void consultaPorCrm (List<Medico> medicos){
        String crm;
        System.out.print("CRM do medico à pesquisar: ");
        crm = leia.next();
        
//        String get = "getCrm()";
        boolean resPesquisa = false;
        for(posicao = 0; posicao < medicos.size(); posicao++){
            if (medicos.get(posicao).getCrm().equals(crm)) {
            
            imprimeConsulta(medicos,posicao);
            resPesquisa = true;
            break;
            }
            if (resPesquisa == false){
                System.out.println("Nenhum médico cadastrado dessa especialidade");
            }
        }
    }
    public void consultaPorEspecialidade (List<Medico> medicos){
        Medico medico = new Medico();
        boolean resPesquisa = false;
        String escolhida = medico.escolheEspecialidade();
        System.out.println("Pesquisando medicos " + escolhida);
        
        for(posicao = 0; posicao < medicos.size(); posicao++){
            if (medicos.get(posicao).getEspecialidade().equals(escolhida)) {
            
            imprimeConsulta(medicos,posicao);
            resPesquisa = true;
            }
            if (resPesquisa == false){
                System.out.println("Nenhum médico cadastrado dessa especialidade");
            }
        }
    }
     
    public void imprimeConsulta (List<? extends Pessoa> pessoas, int posicao){
         if (posicao == -1) {
            System.out.println("\n=========================================================\n");
            System.out.println("Sua busca não retornou nenhum resultado");
            System.out.println("\n=========================================================\n");
        } else {
             System.out.println("\n=========================================================\n");
            System.out.println("\033[34m Pesquisa realizada com sucesso \033[m");
            System.out.println("Nome: " + pessoas.get(posicao).getNome());
            System.out.println("Id: " + pessoas.get(posicao).getId());
            System.out.println("Posição na lista: " + posicao);
            /* Pq eu não consigo acessar um get de uma subclasse de Pessoa se eu já fiz a verificação do Tipo
            if (pessoas.get(posicao) instanceof cadastromedicopaciente.Medico) {
                System.out.println("Crm: " + pessoas.get(posicao).getCrm());
                System.out.println("Especialidade: " + pessoas.get(posicao).getEspecialidade());
            }
            */
            System.out.println("\n=========================================================\n");
         }
        }
    
    }
