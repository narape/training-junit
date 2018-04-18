package com.mycompany.app;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class AdvertisementServiceTest {

  @Test
  public void shouldSendEmailToAddressesWithTrueInMap() {
    AdvertisementService spammer = new AdvertisementService();
    Map<String, Boolean> victims = new HashMap<>();
    victims.put("pepe@gmail.com", true);
    victims.put("lucky@gmail.com", false);

    spammer.sendCampaign(victims);

    Assert.fail("No way to test");
  }
}