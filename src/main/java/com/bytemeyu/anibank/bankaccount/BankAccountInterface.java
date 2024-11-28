package com.bytemeyu.anibank.bankaccount;

public interface BankAccountInterface {
    public abstract void currentStatus();
    public abstract boolean abrirConta(String tipoConta);
    public abstract boolean fecharConta();
    public abstract boolean depositar(float valor);
    public abstract boolean sacar(float valor);
    public abstract boolean pagarMensal();
}
