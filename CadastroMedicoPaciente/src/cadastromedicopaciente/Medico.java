package cadastromedicopaciente;

public class Medico extends Pessoa{
    String crm, especialidade,escolhida;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
    
    @Override
    public void entrada() {
       super.entrada();
       System.out.print("Digite o CRM: ");
       setCrm( leia.next() ); // utilizado o mÃ©todo set para receber o dado digitado
       setEspecialidade(escolheEspecialidade()); //Seta a especialidade com a especialidade escolhida
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CRM: " + getCrm()); //utilizado o mÃ©todo get para retornar o dado digitado
        System.out.println("Especialidade: " + getEspecialidade()); //utilizado o mÃ©todo get para retornar o dado digitado 
    }
    
    public String escolheEspecialidade(){
        imprimeEspecialidade();
        int opc = leia.nextInt();
        
        switch (opc){
            case 1:
                return escolhida = "Cardiologista";
            case 2:
                return escolhida = "Pneumologista";
            case 3:
                return escolhida = "Pediatra";
            case 4:
                return escolhida = "Oftalmologista";
            default:
                return escolhida = "Sem especialidade";
        }
    }
    public void imprimeEspecialidade(){
        System.out.println("Qual a especialidade desejada:");
        System.out.println("1 - Cardiologista");
        System.out.println("2 - Pneumologista");
        System.out.println("3 - Pediatra");
        System.out.println("4 - Oftalmologista");
    }
    
}
