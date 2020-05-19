package crudboleto;

import crudboleto.utilitarios.InterfaceBoleto;

public class Local_Pagamento implements InterfaceBoleto{
    int id;
    String nome;
    
    public Local_Pagamento() {
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
        System.out.print("ID do Local de pagamento: ");
        setId(leia.nextInt());
        System.out.print("Nome do Local: ");
        setNome(leia.next().toUpperCase());
    }

    @Override
    public void imprimir() {
        System.out.print("Local de pagamento: " + getNome());
    }
}

