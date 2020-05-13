package cadastromedicopaciente;

public class Paciente extends Pessoa{
    String cpf, celular;
    
    public Paciente(){
        
    }
    
    @Override
    public void entrada() {
       super.entrada();
       System.out.print("Digite o Cpf: ");
       setCpf( leia.next() ); // utilizado o mÃ©todo set para receber o dado digitado

       System.out.print("Digite o Celular: ");
       setCelular( leia.next() ); // utilizado o mÃ©todo set para receber o dado digitado
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cpf: " + getCpf()); //utilizado o mÃ©todo get para retornar o dado digitado
        System.out.println("Celular: " + getCelular()); //utilizado o mÃ©todo get para retornar o dado digitado 
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
