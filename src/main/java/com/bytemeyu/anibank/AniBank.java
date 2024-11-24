package com.bytemeyu.anibank;

import com.bytemeyu.anibank.bankaccount.BankAccount;

public class AniBank {

    public static void main(String[] args) {
        BankAccount anitaAccount = new BankAccount("Anita Yumi Kawasaki");

        anitaAccount.abrirConta("cc");
        anitaAccount.fecharConta();
        anitaAccount.abrirConta("cc");
        anitaAccount.currentStatus();
        anitaAccount.abrirConta("cc");
        anitaAccount.currentStatus();

        anitaAccount.depositar(15.50f);
        anitaAccount.depositar(10f);
        anitaAccount.sacar(3.25f);
        anitaAccount.depositar(0f);

        anitaAccount.currentStatus();

        anitaAccount.sacar(-3.25f);
        anitaAccount.fecharConta();
        anitaAccount.sacar(30f);

        anitaAccount.currentStatus();

        anitaAccount.sacar(22.25f);
        anitaAccount.pagarMensal();
        anitaAccount.depositar(50);
        anitaAccount.fecharConta();
        anitaAccount.sacar(36.010002f);
        anitaAccount.fecharConta();

        anitaAccount.currentStatus();



        BankAccount diogoAccount = new BankAccount("Diogo Vieira de Melo");
        diogoAccount.currentStatus();
        diogoAccount.abrirConta("cp");
        diogoAccount.currentStatus();
        diogoAccount.pagarMensal();
        diogoAccount.currentStatus();



        BankAccount gustavoAccount = new BankAccount("Gustavo Guanabara");
        gustavoAccount.currentStatus();
        gustavoAccount.abrirConta("cc");
        gustavoAccount.currentStatus();
        gustavoAccount.pagarMensal();
        gustavoAccount.currentStatus();
        gustavoAccount.fecharConta();
        gustavoAccount.currentStatus();
        gustavoAccount.depositar(13.99f);
        gustavoAccount.currentStatus();
        gustavoAccount.fecharConta();
        gustavoAccount.pagarMensal();
        gustavoAccount.currentStatus();
    }
}