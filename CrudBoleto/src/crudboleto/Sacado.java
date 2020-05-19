package crudboleto;

import crudboleto.utilitarios.InterfaceBoleto;

public class Sacado implements InterfaceBoleto{
    int id;
    String nome;
    Endereco endereco;
    
    public Sacado() {
        endereco = new Endereco();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void entrada() {
        System.out.print("ID do sacado: ");
        setId(leia.nextInt());
        System.out.print("Nome: ");
        setNome(leia.next());
        endereco.entrada();
    }

    @Override
    public void imprimir() {
        System.out.print("=========SACADO========");
        System.out.print("Id:" + getId());
        System.out.print("Nome: "+getNome());
        endereco.imprimir();
    }
    
    
    
}
