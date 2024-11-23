package com.bytemeyu.anibank.bankaccount;

public class BankAccount {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public BankAccount(String dono) {
        this.dono = dono;

        int saldo = 0;
        this.setSaldo(saldo);

        this.setStatus(false);
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



    public String abrirConta(String tipo) {
        this.setTipo(tipo);

        int numConta = 001;
        this.setNumConta(numConta);

        String tipoExtenso;
        if(tipo == "cc") {
            tipoExtenso = "corrente";
        } else {
            tipoExtenso = "poupança";
        }

        this.setStatus(true);
        return this.getDono() + ", sua conta " + tipoExtenso + " foi aberta com sucesso. Seu número é " + this.getNumConta() + ".";
    }

    public String fecharConta() {
        if(this.isStatus() == false) {
            return this.getDono() + ", sua conta já está fechada.";
        } else {
            if(this.getSaldo() == 0) {
                this.setStatus(false);
            } else if (this.getSaldo() > 0) {
                return this.getDono() + ", você não pode fechar uma conta que contenha uma quantia em dinheiro.";
            } else {
                return this.getDono() + ", você não pode fechar uma conta em débito.";
            }
        }
        return this.getDono() + ", sua conta foi fechada.";
    }

    public String depositar(float valor) {
        if(this.isStatus() == false) {
            return this.getDono() + ", sua conta está fechada.";
        } else {
            if(valor <= 0) {
                return this.getDono() + ", você não pode depositar um valor menor ou igual a 0.";
            } else {
                this.setSaldo(this.getSaldo() + valor);
            }

            return this.getDono() + ", você depositou R$" + valor + " em sua conta. Seu saldo é de R$" + this.getSaldo() + ".";
        }
    }

    public String sacar(float valor) {
        if(this.isStatus() == false) {
            return this.getDono() + ", sua conta está fechada.";
        } else {
            if(valor <= 0) {
                return this.getDono() + ", você não pode sacar um valor menor ou igual a 0.";
            } else {
                if(this.getSaldo() < valor) {
                    return this.getDono() + ", você não tem saldo suficiente para fazer esse saque.";
                } else {
                    this.setSaldo(this.getSaldo() - valor);
                }

                return this.getDono() + ", você sacou R$" + valor + " da sua conta. Seu saldo é de R$" + this.getSaldo() + ".";
            }
        }
    }

    public String pagarMensal() {
        if(this.getTipo() == "cc"){
            float taxaMensal = 13.99f;

            if(this.isStatus() == false) {
                return this.getDono() + ", sua conta está fechada.";
            } else {
                if(this.getSaldo() < taxaMensal) {
                    this.setSaldo(this.saldo - taxaMensal);
                    return this.getDono() + ", você não tem saldo suficiente para pagar a mensalidade, portanto ficará devendo R$" + this.getSaldo() + ".";
                } else {
                    this.setSaldo(this.saldo - taxaMensal);
                    return this.getDono() + ", você pagou a mensalidade. Seu saldo atual é de R$" + this.getSaldo() + ".";
                }
            }
        } else {
            return this.getDono() + ", como sua conta é do tipo poupança, você não precisa pagar uma mensalidade.";
        }
    }
}
