package cadastromedicopaciente;

public class Endereco implements InterfaceCadastro{

    private String logradouro,numero,complemento,bairro,cidade, estado;
    private int cep;
    public Endereco(){
    }
    
    public void setLogradouro(String logradouro){ this.logradouro = logradouro;}
    public String getLogradouro(){ return logradouro;}

    public void setNumero(String numero){ this.numero = numero;}
    public String getNumero(){ return numero;}

    public void setComplemento(String complemento){ this.complemento = complemento;}
    public String getComplemento(){ return complemento;}

    public void setBairro(String bairro){ this.bairro = bairro;}
    public String getBairro(){ return bairro;}

    public void setCidade(String cidade){ this.cidade = cidade;}
    public String getCidade(){ return cidade;}

    public void setEstado(String estado){ this.estado = estado;}
    public String getEstado(){ return estado;}

    public void setCep(int cep){ this.cep = cep;}
    public int getCep(){ return cep;}

    @Override
    public void entrada(){

        System.out.print("Rua: ");
        setLogradouro( leia.next() );

        System.out.print("Numero da casa: ");
        setNumero( leia.next() );

        System.out.print("(opcional) Complemento: ");
        setComplemento( leia.next() );

        System.out.print("Bairro: ");
        setBairro( leia.next() );

        System.out.print("Cidade: ");
        setCidade( leia.next() );

        System.out.print("Estado: ");
        setEstado( leia.next() );

        System.out.print("CEP: ");
        setCep( leia.nextInt() );
    }

    @Override
    public void imprimir() {
        System.out.println("Rua: " + getLogradouro());
        System.out.println("Numero: " + getNumero());
        System.out.println("Complemento: " + getComplemento());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Estado: " + getEstado());
        System.out.println("CEP: " + getCep());
    }
}
