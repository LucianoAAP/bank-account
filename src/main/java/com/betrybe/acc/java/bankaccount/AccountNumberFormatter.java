package com.betrybe.acc.java.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String accountNumberString = String.format("%s", literalAccountNumber);
    if (accountNumberString.length() > 6) {
      return StringUtils.right(accountNumberString, 6);
    }
    if (accountNumberString.length() < 6) {
      return StringUtils.leftPad(accountNumberString, 6, "0");
    }
    return accountNumberString;
  }

}