package com.betrybe.acc.java.bankaccount;

import java.util.Scanner;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o número da conta:");
    String accountNumber = scanner.next();
    if (!accountNumber.matches("[0-9]+")) {
      System.out.println("Número da conta inválido!");
      scanner.close();
      return ;
    }
    int literalAccountNumber = Integer.valueOf(accountNumber);
    AccountNumberFormatter formatter = new AccountNumberFormatter();
    System.out.println(String.format("Número da conta: %s", formatter.formatAccountNumber(literalAccountNumber)));
    scanner.close();
  }

}
