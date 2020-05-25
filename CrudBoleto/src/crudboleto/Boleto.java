package crudboleto;

import crudboleto.utilitarios.InterfaceBoleto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/*System.out.print("Banco: " + getBanco());
        System.out.print("Data: " + getData_documento());
        System.out.print("Numero do boleto: " + getNum_boleto());
        System.out.print("Noss Numero: " + getNosso_numero());
        System.out.print("Moeda: " + getMoeda());
        System.out.print("Carteira: " + getCarteira());
        System.out.print("Numeri documento: " + getNum_documento());
        System.out.print("Aceite: " + getAceite());
        System.out.print("Instrucoes basicas: " + getInstrucoes());
        
*/

public class Boleto implements InterfaceBoleto{
    String num_boleto,nosso_numero, num_documento,aceite, instrucoes;
//  especie_doc
    int carteira, id;
    float valor_documento, descontos, multa, acrescimos, deducoes, valor_total;
    Cedente cedente;
    Sacado sacado;
    Local_Pagamento local_pagamento;
    Banco banco;
    Moeda moeda;
    LocalDate vencimento, data_documento;

    public Boleto(){
        cedente = new Cedente();
        local_pagamento = new Local_Pagamento();
        sacado = new Sacado();
    }
    public String getLocal_pagamento() {
        return local_pagamento.getNome();
    }

    public void setLocal_pagamento(Local_Pagamento local_pagamento) {
        this.local_pagamento = local_pagamento;
    }
    
    public LocalDate getData_documento() {
        return data_documento;
    }

    public void setData_documento(LocalDate data_documento) {
        this.data_documento = data_documento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
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

    public String getInstrucoes() {
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

    public void setCedente(Cedente cedente) {
        this.cedente = cedente;
    }

    public void setSacado(Sacado sacado) {
        this.sacado = sacado;
    }
    
    

    @Override
    public void entrada() {
        String saida;
        System.out.print("----INFORMAÇÕES DO BOLETO----\n");
        System.out.print("Data do documento no padrao dd/MM/aaaa: ");
        setData_documento(converteData(leia.next()));
        System.out.print("Data de vencimento no padrao dd/MM/aaaa: ");
        setVencimento(converteData(leia.next()));
        System.out.print("Número: ");
        setNum_boleto(leia.next());
        System.out.print("Nosso número:");
        setNosso_numero(leia.next());
        System.out.print("Numero do Documento: ");
        setNum_documento(leia.next());
        System.out.print("Aceite:");
        setAceite(leia.next());
        System.out.print("Inserir Instruções basicas:");
        setInstrucoes(leia.next());
        System.out.print("Carteira:  ");
        setCarteira(leia.nextInt());
        
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
    public void entrada(Banco banco, Moeda moeda, Cedente cedente, Sacado sacado, Local_Pagamento local){
        setBanco(banco);
        setMoeda(moeda);
        setCedente(cedente);
        setSacado(sacado);
        setLocal_pagamento(local);
        entrada();
    }

    @Override
    public void imprimir() {
        System.out.println("Banco: " + getBanco());
        System.out.println("Data: " + getData_documento());
        System.out.println("Vencimento para: "+ getVencimento());
        System.out.println("Numero do boleto: " + getNum_boleto());
        System.out.println("Nosso Numero: " + getNosso_numero());
        System.out.println("Moeda: " + getMoeda());
        System.out.println("Carteira: " + getCarteira());
        System.out.println("Numeri documento: " + getNum_documento());
        System.out.println("Aceite: " + getAceite());
        System.out.println("Instrucoes basicas: " + getInstrucoes());
        
        //Classes importadas
       System.out.println("Sacado: " + getSacado());
       System.out.println("Cedente: " + getCedente());
       System.out.println("Local de pagamento: " + getLocal_pagamento());
        System.out.println("============TOTAL A PAGAR============");
        System.out.println("R$: " + getValor_total());
    }
    
    private float calculaValorTotal(){
        float total = getValor_documento()+(getMulta()+getAcrescimos())-(getDescontos()+getDeducoes());
        return total;
    }

    private LocalDate converteData(String data) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate dataFormatada = LocalDate.parse(data,formatter);
    return dataFormatada;
    }
}