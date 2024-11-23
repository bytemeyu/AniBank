package com.bytemeyu.anibank;

import com.bytemeyu.anibank.bankaccount.BankAccount;

public class AniBank {

    public static void main(String[] args) {
        BankAccount anitaAccount = new BankAccount("cc","Anita Yumi Kawasaki");

        System.out.println(anitaAccount.abrirConta());
        //System.out.println(anitaAccount.fecharConta());
        //System.out.println(anitaAccount.isStatus());
        //System.out.println(anitaAccount.abrirConta("cc","Anita Yumi Kawasaki"));
        System.out.println(anitaAccount.isStatus());

        System.out.println(anitaAccount.depositar(15.50f));
        System.out.println(anitaAccount.depositar(10f));
        System.out.println(anitaAccount.sacar(3.25f));
        System.out.println(anitaAccount.depositar(-2f));
        System.out.println(anitaAccount.getSaldo());
        System.out.println(anitaAccount.sacar(-3.25f));
        System.out.println(anitaAccount.fecharConta());
        System.out.println(anitaAccount.sacar(30f));
        System.out.println(anitaAccount.getSaldo());
        System.out.println(anitaAccount.sacar(22.25f));
        System.out.println(anitaAccount.pagarMensal());
        System.out.println(anitaAccount.depositar(50));
        System.out.println(anitaAccount.fecharConta());
        System.out.println(anitaAccount.sacar(36.010002f));
        System.out.println(anitaAccount.fecharConta());



        BankAccount diogoAccount = new BankAccount("cp", "Diogo Vieira de Melo");
        System.out.println(diogoAccount.abrirConta());
        System.out.println(diogoAccount.pagarMensal());
    }
}