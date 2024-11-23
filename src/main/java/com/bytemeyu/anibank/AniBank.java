package com.bytemeyu.anibank;

import com.bytemeyu.anibank.bankaccount.BankAccount;

public class AniBank {

    public static void main(String[] args) {
        BankAccount anitaAccount = new BankAccount("Anita Yumi Kawasaki");

        System.out.println(anitaAccount.abrirConta("cc"));
        //System.out.println(anitaAccount.fecharConta());
        //System.out.println(anitaAccount.isStatus());
        //System.out.println(anitaAccount.abrirConta("cc","Anita Yumi Kawasaki"));
        anitaAccount.currentStatus();

        System.out.println(anitaAccount.depositar(15.50f));
        System.out.println(anitaAccount.depositar(10f));
        System.out.println(anitaAccount.sacar(3.25f));
        System.out.println(anitaAccount.depositar(-2f));

        anitaAccount.currentStatus();

        System.out.println(anitaAccount.sacar(-3.25f));
        System.out.println(anitaAccount.fecharConta());
        System.out.println(anitaAccount.sacar(30f));

        anitaAccount.currentStatus();

        System.out.println(anitaAccount.sacar(22.25f));
        System.out.println(anitaAccount.pagarMensal());
        System.out.println(anitaAccount.depositar(50));
        System.out.println(anitaAccount.fecharConta());
        System.out.println(anitaAccount.sacar(36.010002f));
        System.out.println(anitaAccount.fecharConta());

        anitaAccount.currentStatus();



        BankAccount diogoAccount = new BankAccount("Diogo Vieira de Melo");
        diogoAccount.currentStatus();
        System.out.println(diogoAccount.abrirConta("cp"));
        diogoAccount.currentStatus();
        System.out.println(diogoAccount.pagarMensal());
        diogoAccount.currentStatus();



        BankAccount gustavoAccount = new BankAccount("Gustavo Guanabara");
        gustavoAccount.currentStatus();
        System.out.println(gustavoAccount.abrirConta("cc"));
        gustavoAccount.currentStatus();
        System.out.println(gustavoAccount.pagarMensal());
        gustavoAccount.currentStatus();
        System.out.println(gustavoAccount.fecharConta());
        gustavoAccount.currentStatus();
        System.out.println(gustavoAccount.depositar(13.99f));
        gustavoAccount.currentStatus();
        System.out.println(gustavoAccount.fecharConta());
        System.out.println(gustavoAccount.pagarMensal());
        gustavoAccount.currentStatus();
    }
}