package com.bytemeyu.anibank.bankaccount;

public class BankAccount {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public BankAccount(String tipo, String dono) {
        this.tipo = tipo;
        this.dono = dono;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public String abrirConta() {
        int numConta = 001;
        setNumConta(numConta);

        int saldo = 0;
        setSaldo(saldo);

        String tipoExtenso;
        if(tipo == "cc") {
            tipoExtenso = "corrente";
        } else {
            tipoExtenso = "poupança";
        }

        setStatus(true);
        return this.dono + ", sua conta " + tipoExtenso + " foi aberta com sucesso. Seu número é " + this.numConta + ".";
    }

    public String fecharConta() {
        if(this.status == false) {
            return this.dono + ", sua conta já está fechada.";
        } else {
            if(this.saldo == 0) {
                this.status = false;
            } else {
                return this.dono + " , você não pode fechar uma conta que contenha um saldo diferente de 0.";
            }
        }
        return this.dono + ", sua conta foi fechada.";
    }

    public String depositar(float valor) {
        if(this.status == false) {
            return this.dono + ", sua conta está fechada.";
        } else {
            if(valor <= 0) {
                return this.dono + ", você não pode depositar um valor menor ou igual a 0.";
            } else {
                this.setSaldo(this.saldo + valor);
            }
        }
        return this.dono + ", você depositou R$" + valor + " em sua conta. Seu saldo é de R$" + this.saldo + ".";
    }

    public String sacar(float valor) {
        if(this.status == false) {
            return this.dono + ", sua conta está fechada.";
        } else {
            if(valor <= 0) {
                return this.dono + ", você não pode sacar um valor menor ou igual a 0.";
            } else {
                if(this.saldo < valor) {
                    return this.dono + ", você não tem saldo suficiente para fazer esse saque.";
                } else {
                    this.setSaldo(this.saldo - valor);
                }
            }
        }
        return this.dono + ", você sacou R$" + valor + " da sua conta. Seu saldo é de R$" + this.saldo + ".";
    }

    public String pagarMensal() {
        if(this.tipo == "cc"){
            float taxaMensal = 13.99f;
            if(this.saldo < taxaMensal) {
                this.setSaldo(this.saldo - taxaMensal);
                return this.dono + ", você não tem saldo suficiente para pagar a mensalidade, portanto ficará devendo R$" + this.saldo + ".";
            } else {
                this.setSaldo(this.saldo - taxaMensal);
                return this.dono + ", você pagou a mensalidade. Seu saldo atual é de R$" + this.saldo + ".";
            }
        } else {
            return this.dono + ", como sua conta é do tipo poupança, você não precisa pagar uma mensalidade.";
        }
    }
}
