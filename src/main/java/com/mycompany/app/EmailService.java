package com.mycompany.app;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class EmailService {
  private final Set<String> blacklisted;

  EmailService(Collection<String> blacklisted) {
    this.blacklisted = new HashSet<>(blacklisted);
  }

  boolean sendEmail(String address, String body) {
    Objects.requireNonNull(address);
    if (!blacklisted.contains(address)) {
      System.out.println("Sending email to " + address + " with " + body);
      return true;
    }
    return false;
  }
}
