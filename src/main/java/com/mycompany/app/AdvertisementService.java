package com.mycompany.app;

import java.util.Collections;
import java.util.Map;

public class AdvertisementService {
  private final EmailService emailer;

  public AdvertisementService() {
    this.emailer = new EmailService(Collections.emptyList());
  }

  public void sendCampaign(Map<String, Boolean> persons) {
    String emailBody = "Buy snake oil";

    for (String address : persons.keySet()) {
      boolean shouldSendEmail = persons.get(address);

      if (shouldSendEmail) {
        emailer.sendEmail(address, emailBody);
      }
    }
  }
}
