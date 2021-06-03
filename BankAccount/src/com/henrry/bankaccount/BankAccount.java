package com.henrry.bankaccount;

import java.util.Random;

public class BankAccount {
    private String numeroCuenta;
    private double saldoCuentaCorriente;
    private double saldoCuentaAhorro;
    public static int cuentasCreadas;
    public static int cantidadDinero;

    public BankAccount() {
        this.numeroCuenta = this.digitosAleatorios();
        this.cantidadDinero += saldoCuentaAhorro + saldoCuentaCorriente;
        cuentasCreadas++;
    }

    public BankAccount(double saldoCuentaCorriente, double saldoCuentaAhorro) {
        this.numeroCuenta = this.digitosAleatorios();
        this.saldoCuentaCorriente = saldoCuentaCorriente;
        this.saldoCuentaAhorro = saldoCuentaAhorro;
        this.cantidadDinero += saldoCuentaAhorro + saldoCuentaCorriente;
        cuentasCreadas++;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }


    public double getSaldoCuentaCorriente() {
        return saldoCuentaCorriente;
    }


    public double getSaldoCuentaAhorro() {
        return saldoCuentaAhorro;
    }

    // metodos

    private String digitosAleatorios() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String digitos = "1234567890";
        String cuentaAleatoria = "";

        for(int i = 0; i < digitos.length(); i++) {
            // generando índices aleatorio con el tamaño de los digitos
            int indice = random.nextInt(digitos.length());
            // tomando una posición aleatoria de los digitos
            char charAleatorio = digitos.charAt(indice);
            // agregando letra aleatoria al String Builder
            sb.append(charAleatorio);
        }

        cuentaAleatoria = sb.toString();
        return cuentaAleatoria;
    }

    public void depositar(String tipoCuenta, double cantidad) {
        if(tipoCuenta.equalsIgnoreCase("ahorro")) {
            this.saldoCuentaAhorro += cantidad;
            System.out.println("Cantidad $" + cantidad + " agregada");
        } else if(tipoCuenta.equalsIgnoreCase("corriente")) {
            this.saldoCuentaCorriente += cantidad;
            System.out.println("Cantidad $" + cantidad + " agregada");
        } else {
            System.out.println("Ingrese un tipo de cuenta correcto: Corriente o Ahorro");
        }
    }

    public void retirarDinero(String tipoCuenta, double cantidad) {
        if(tipoCuenta.equalsIgnoreCase("ahorro") && this.saldoCuentaAhorro >= cantidad) {
            this.saldoCuentaAhorro -= cantidad;
            System.out.println("Cantidad $" + cantidad + " retirada");

        } else if(tipoCuenta.equalsIgnoreCase("corriente") && this.saldoCuentaCorriente >= cantidad) {
            this.saldoCuentaCorriente -= cantidad;
            System.out.println("Cantidad $" + cantidad + " retirada");

        } else if(saldoCuentaAhorro < cantidad || saldoCuentaAhorro < cantidad) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Ingrese un tipo de cuenta correcto: Corriente o Ahorro");
        }
    }

    public void saldoTotal(String tipoCuenta) {
        if(tipoCuenta.equalsIgnoreCase("ahorro")) {
            System.out.println("Saldo cuenta Ahorro: $" + this.saldoCuentaAhorro);
        } else if(tipoCuenta.equalsIgnoreCase("corriente")) {
            System.out.println("Saldo cuenta Corriente: $" + this.saldoCuentaCorriente);
        } else {
            System.out.println("Ingrese un tipo de cuenta correcto: Ahorro o Corriente");
        }
    }
}
