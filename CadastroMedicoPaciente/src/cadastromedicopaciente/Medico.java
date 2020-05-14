package cadastromedicopaciente;

public class Medico extends Pessoa{
    String crm ,escolhida;
    Especialidade especialidade;
    
    public Medico (){
        especialidade = new Especialidade();
    }

    public String getCrm() {
        return crm;
    }
    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    @Override
    public void entrada() {
       super.entrada();
       System.out.print("Digite o CRM: ");
       setCrm( leia.next() ); // utilizado o mÃ©todo set para receber o dado digitado
    }
    public void entrada(Especialidade escolhida){
        super.entrada();
       System.out.print("Digite o CRM: ");
       setCrm( leia.next() ); // utilizado o mÃ©todo set para receber o dado digitado
       especialidade = escolhida;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CRM: " + getCrm()); //utilizado o mÃ©todo get para retornar o dado digitado
        System.out.println("Especialidade: " + especialidade.getDescricao());
    }
    
   
}
