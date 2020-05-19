package crudboleto;

import crudboleto.utilitarios.InterfaceBoleto;

public class Banco implements InterfaceBoleto{
    int id;
    String nome;
    
    
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
        System.out.print("ID do banco: ");
        setId(leia.nextInt());
        System.out.print("Nome do banco: ");
        setNome(leia.next().toUpperCase());
    }

    @Override
    public void imprimir() {
        System.out.print("=========BANCO=========");
        System.out.print("Id:" + getId());
        System.out.print("Nome: "+getNome());
    }
}
