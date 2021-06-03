package com.henrry.bankaccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount cuentaUno = new BankAccount();
        String nCuentaUno = cuentaUno.getNumeroCuenta();
        System.out.println(nCuentaUno); // cuenta de diez digitos aleatorios

        // Cuenta ahorro
        cuentaUno.saldoTotal("Ahorro"); // recibe tipo de cuenta
        cuentaUno.depositar("Ahorro", 20000); // depositar
        cuentaUno.saldoTotal("Ahorro"); // revisamos el saldo de nuevo
        cuentaUno.retirarDinero("Ahorro", 15000); // retiramos saldo
        cuentaUno.saldoTotal("Ahorro");

        System.out.println("\n");
        // Cuenta Corriente
        cuentaUno.saldoTotal("Corriente"); // recibe tipo de cuenta
        cuentaUno.depositar("corriente", 500000); // depositar
        cuentaUno.saldoTotal("Corriente"); // revisamos el saldo de nuevo
        cuentaUno.retirarDinero("corriente", 250000); // retiramos saldo
        cuentaUno.saldoTotal("corriente");
    }
}
