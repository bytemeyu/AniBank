package com.bytemeyu.anibank;

import com.bytemeyu.anibank.bankaccount.BankAccount;

public class AniBank {

    public static void main(String[] args) {
        BankAccount meuTeste = new BankAccount();
        meuTeste.teste();

        ClasseNoMesmoPacote meuOutroTeste = new ClasseNoMesmoPacote();
        meuOutroTeste.outroTeste();
    }
}