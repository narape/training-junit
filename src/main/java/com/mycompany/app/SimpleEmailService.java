package com.mycompany.app;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class SimpleEmailService implements EmailService {
  private final Set<String> blacklisted;

  SimpleEmailService(Collection<String> blacklisted) {
    this.blacklisted = new HashSet<>(blacklisted);
  }

  @Override
  public boolean sendEmail(String address, String body) {
    Objects.requireNonNull(address);
    if (!blacklisted.contains(address)) {
      System.out.println("Sending email to " + address + " with " + body);
      return true;
    }
    return false;
  }
}
