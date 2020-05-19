package crudboleto;

import crudboleto.utilitarios.InterfaceBoleto;

public class Boleto implements InterfaceBoleto{
    String num_boleto,vencimento,nosso_numero, num_documento,aceite, instrucoes;
//  especie_doc
    int carteira;
    float valor_documento, descontos, multa, acrescimos, deducoes, valor_total;
    Cedente cedente;
    Sacado sacado;
    Local_Pagamento local_pagamento;
    Banco banco;
    Moeda moeda;
    
    
    public Boleto(){
        cedente = new Cedente();
        local_pagamento = new Local_Pagamento();
        sacado = new Sacado();
    }
    public String getSacado() {
        return sacado.getNome();
    }

    public String getNum_boleto() {
        return num_boleto;
    }

    public void setNum_boleto(String num_boleto) {
        this.num_boleto = num_boleto;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getNosso_numero() {
        return nosso_numero;
    }

    public void setNosso_numero(String nosso_numero) {
        this.nosso_numero = nosso_numero;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    public String getIntrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    public int getCarteira() {
        return carteira;
    }

    public void setCarteira(int carteira) {
        this.carteira = carteira;
    }

    public float getValor_documento() {
        return valor_documento;
    }

    public void setValor_documento(float valor_documento) {
        this.valor_documento = valor_documento;
    }

    public float getDescontos() {
        return descontos;
    }

    public void setDescontos(float descontos) {
        this.descontos = descontos;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    public float getAcrescimos() {
        return acrescimos;
    }

    public void setAcrescimos(float acrescimos) {
        this.acrescimos = acrescimos;
    }

    public float getDeducoes() {
        return deducoes;
    }

    public void setDeducoes(float deducoes) {
        this.deducoes = deducoes;
    }
    public String getCedente(){
        return cedente.getNome();
    }
    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public String getBanco() {
        return banco.getNome();
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public String getMoeda() {
        return moeda.getNome();
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }
    

    @Override
    public void entrada() {
        String saida;
        System.out.print("----INFORMAÇÕES DO BOLETO----\n");
        System.out.print("Data de vencimento:");
        setVencimento(leia.next().toUpperCase());
        System.out.print("Número: ");
        setNum_boleto(leia.next().toUpperCase());
        System.out.print("Nosso número:");
        setNosso_numero(leia.next().toUpperCase());
        System.out.print("Numero do Documento: ");
        setNum_documento(leia.next().toUpperCase());
        System.out.print("Aceite:");
        setAceite(leia.next().toUpperCase());
        System.out.print("Inserir Instruções basicas:");
        setInstrucoes(leia.next().toUpperCase());
        
        //Classes importadas
        sacado.entrada();
        cedente.entrada();
        local_pagamento.entrada();
        
        
        while(true){
        System.out.print("\n----INFORMAÇÕES FINANCEIRAS----\n");
        System.out.print("Valor: R$");
        setValor_documento(leia.nextFloat());
        System.out.print("Multas:  R$");
        setMulta(leia.nextFloat());
        System.out.print("Outros acréscimos:  R$");
        setAcrescimos(leia.nextFloat());
        System.out.print("Descontos:  R$");
        setDescontos(leia.nextFloat());
        System.out.print("Outras deduções:  R$");
        setDeducoes(leia.nextFloat());
        setValor_total(calculaValorTotal());
        System.out.println("Digite 'ok' para confirmar o valor final de R$" + getValor_total()+" no documento");
        saida = leia.next().toUpperCase().toLowerCase();
            if(saida.equals("ok")){
                break;
            }
        }
    }
    public void entrada(Banco banco, Moeda moeda){
        setBanco(banco);
        setMoeda(moeda);
        entrada();
    }

    @Override
    public void imprimir() {
        
    }
    
    public float calculaValorTotal(){
        float total = getValor_documento()+(getMulta()+getAcrescimos())-(getDescontos()+getDeducoes());
        return total;
    }
}