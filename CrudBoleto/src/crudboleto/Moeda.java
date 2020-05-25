package crudboleto;

import crudboleto.utilitarios.InterfaceBoleto;

public class Moeda implements InterfaceBoleto{
    int id;
    String nome,cifra;

    public Moeda(int id, String nome, String cifra) {
        this.id = id;
        this.nome = nome;
        this.cifra = cifra;
    }
    public Moeda() {
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

    public String getCifra() {
        return cifra;
    }

    public void setCifra(String cifra) {
        this.cifra = cifra;
    }

    @Override
    public void entrada() {
        System.out.print("ID da moeda: ");
        setId(leia.nextInt());
        System.out.print("Nome descritivo: ");
        setNome(leia.next());
        System.out.print("Cifra: ");
        setCifra(leia.next());
    }

    @Override
    public void imprimir() {
        System.out.print("=========MOEDA=========");
        System.out.print("Id:" + getId());
        System.out.print("Nome: "+getNome());
        System.out.print("Cifra: "+getCifra());
    }
    
    
    
}
