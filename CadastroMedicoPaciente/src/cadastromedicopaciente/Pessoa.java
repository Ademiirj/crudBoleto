package cadastromedicopaciente;

public class Pessoa implements InterfaceCadastro{
    int id;
    private String nome;
    private Endereco endereco;
    
    public Pessoa(){
        endereco = new Endereco();
    }
    
    @Override
    public void entrada() {
       System.out.print("Digite o ID: ");
       setId(leia.nextInt()); // utilizado o mÃ©todo set para receber o dado digitado

       System.out.print("Digite o Nome: ");
       setNome(leia.next().toUpperCase()); // utilizado o mÃ©todo set para receber o dado digitado
       endereco.entrada();
    }

    @Override
    public void imprimir() {
        System.out.println("ID: " + getId()); //utilizado o mÃ©todo get para retornar o dado digitado
        System.out.println("Nome: " + getNome()); //utilizado o mÃ©todo get para retornar o dado digitado
        endereco.imprimir();
    }
    
    public void setId(int id){ this.id = id;}
    public int getId(){ return id;}

    public void setNome(String nome){ this.nome = nome;}
    public String getNome(){ return nome;}
    
    public Endereco getEndereco(){
        return endereco;
    }
    
}
