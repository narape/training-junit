package com.mycompany.app;

import java.util.Collections;
import java.util.Map;

public class AdvertismentService {
  private final EmailService emailer;

  public AdvertismentService() {
    this.emailer = new EmailService(Collections.emptyList());
  }

  public void sendCampain(Map<String, Boolean> persons) {
    String emailBody = "Buy snake oil";
    persons.entrySet().stream()
        .filter(Map.Entry::getValue)
        .map(Map.Entry::getKey)
        .forEach(address -> emailer.sendEmail(address, emailBody));
  }
}
