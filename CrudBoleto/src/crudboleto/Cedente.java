package crudboleto;

import crudboleto.utilitarios.InterfaceBoleto;

public class Cedente implements InterfaceBoleto{
    int id;
    String agencia,nome, codigo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void entrada() {
        System.out.print("ID do cedente: ");
        setId(leia.nextInt());
        System.out.print("Nome do cedente: ");
        setNome(leia.next().toUpperCase());
        System.out.print("Codigo do cedente: ");
        setCodigo(leia.next().toUpperCase());
        System.out.print("Agencia do cedente: ");
        setAgencia(leia.next().toUpperCase());
    }

    @Override
    public void imprimir() {
        System.out.print("========CEDENTE========");
        System.out.print("Id:" + getId());
        System.out.print("Nome: "+getNome());
        System.out.print("Codigo: "+getCodigo());
        System.out.print("Agencia: "+getAgencia());
    }
    
    
    
}
