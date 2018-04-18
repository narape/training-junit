package com.mycompany.app;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AdvertisementService {
  private static final List<String> EMPTY_BLACKLIST = Collections.emptyList();
  private final EmailService emailer;

  public AdvertisementService() {
    this.emailer = new SimpleEmailService(EMPTY_BLACKLIST);
  }

  //VisibleForTesting
  AdvertisementService(EmailService emailer) {
    this.emailer = emailer;
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
