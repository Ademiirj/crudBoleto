package cadastromedicopaciente;

import static cadastromedicopaciente.InterfaceCadastro.leia;
import java.util.List;

public class Especialidade{
    int id;
    String descricao;
    
    public Especialidade(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void entrada() {
        System.out.print("Id da Especialidade: ");
        setId(leia.nextInt());
        System.out.print("Descricação da Especialidade: ");
        setDescricao(leia.next());
    }
    
    public String imprimir() {
        return getDescricao();
    }
    
    public void imprimeLista(List<Especialidade> especialidades){
        System.out.println("Qual a especialidade:");
        for(int posicao = 0; posicao < especialidades.size(); posicao++){
            System.out.println(especialidades.get(posicao).getId() + " - " + especialidades.get(posicao).getDescricao());
    }
}
}
