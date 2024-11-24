package com.bytemeyu.anibank.bankaccount;

import java.util.UUID;

public class BankAccount {

    public String codigoConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean isAtiva;

    private String gerarCodigoConta() {
        return UUID.randomUUID().toString();
    }

    private boolean ePositivo(float valor) {
        if(valor > 0) {
            return true;
        } else {
            return false;
        }
    }

    public BankAccount(String dono) {
        this.codigoConta = gerarCodigoConta();

        this.dono = dono;

        int saldo = 0;
        this.setSaldo(saldo);

        this.setIsAtiva(false);
    }

    public void currentStatus() {
        System.out.println("_______________");
        System.out.println("Código da Conta: " + this.getCodigoConta());
        System.out.println("Tipo da Conta: " + this.getTipoConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Está ativa? " + this.isAtiva());
        System.out.println("_______________");
    }

    public String getCodigoConta() {
        return this.codigoConta;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
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

    public boolean isAtiva() {
        return this.isAtiva;
    }

    public void setIsAtiva(boolean status) {
        this.isAtiva = status;
    }



    public boolean abrirConta(String tipoConta) {
        if(this.isAtiva() == true) {
            System.out.println("Conta já está aberta.");
            return false;
        }

        this.setTipoConta(tipoConta);

        String tipoContaExtenso;
        if(tipoConta.equals("cc")) {
            tipoContaExtenso = "corrente";
        } else {
            tipoContaExtenso = "poupança";
        }

        this.setIsAtiva(true);

        System.out.println(this.getDono() + ", sua conta " + tipoContaExtenso + " foi aberta com sucesso.");
        return true;
    }

    public boolean fecharConta() {
        if(this.isAtiva() == false) {
            System.out.println("Conta já está fechada.");
            return false;
        } else {
            if(this.getSaldo() == 0) {
                this.setIsAtiva(false);
            } else if (this.getSaldo() > 0) {
                System.out.println(this.getDono() + ", você não pode fechar uma conta que contenha uma quantia em dinheiro.");
                return false;
            } else {
                System.out.println(this.getDono() + ", você não pode fechar uma conta com saldo negativo.");
                return false;
            }
        }
        System.out.println(this.getDono() + ", sua conta foi fechada.");
        return true;
    }

    public boolean depositar(float valor) {
        if(this.isAtiva() == false) {
            System.out.println("Conta está fechada.");
            return false;
        } else {
            if(!ePositivo(valor)) {
                System.out.println(this.getDono() + ", você não pode depositar um valor menor ou igual a 0.");
                return false;
            } else {
                this.setSaldo(this.getSaldo() + valor);
            }

            System.out.println(this.getDono() + ", você depositou R$" + valor + " em sua conta. Seu saldo é de R$" + this.getSaldo() + ".");
            return true;
        }
    }

    public boolean sacar(float valor) {
        if(this.isAtiva() == false) {
            System.out.println("Conta está fechada.");
            return false;
        } else {
            if(!ePositivo(valor)) {
                System.out.println(this.getDono() + ", você não pode sacar um valor menor ou igual a 0.");
                return false;
            } else {
                if(this.getSaldo() < valor) {
                    System.out.println(this.getDono() + ", você não tem saldo suficiente para fazer esse saque.");
                    return false;
                } else {
                    this.setSaldo(this.getSaldo() - valor);
                }

                System.out.println(this.getDono() + ", você sacou R$" + valor + " da sua conta. Seu saldo é de R$" + this.getSaldo() + ".");
                return true;
            }
        }
    }

    public boolean pagarMensal() {
        if(this.getTipoConta().equals("cc")){
            float taxaMensal = 13.99f;

            if(this.isAtiva() == false) {
                System.out.println("Conta está fechada.");
                return false;
            } else {
                if(this.getSaldo() < taxaMensal) {
                    this.setSaldo(this.getSaldo() - taxaMensal);
                    System.out.println(this.getDono() + ", você não tem saldo suficiente para pagar a mensalidade, portanto ficará devendo R$" + this.getSaldo() + ".");
                    return true;
                } else {
                    this.setSaldo(this.saldo - taxaMensal);
                    System.out.println(this.getDono() + ", você pagou a mensalidade. Seu saldo atual é de R$" + this.getSaldo() + ".");
                    return true;
                }
            }
        } else {
            System.out.println(this.getDono() + ", como sua conta é do tipo conta poupança, você não precisa pagar uma mensalidade.");
            return true;
        }
    }
}
