package com.mycompany.app;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class AdvertisementServiceTest {

  private static final String VICTIM_1 = "pepe@gmail.com";
  private static final String VICTIM_2 = "paco@gmail.com";
  private static final String NO_VICTIM = "lucky@gmail.com";

  @Test
  public void shouldSendEmailToAddressesWithTrueInMap() {
    TestEmailService spy = new TestEmailService();
    AdvertisementService spammer = new AdvertisementService(spy);
    Map<String, Boolean> victims = new HashMap<>();
    victims.put(VICTIM_1, true);
    victims.put(VICTIM_2, true);
    victims.put(NO_VICTIM, false);

    spammer.sendCampaign(victims);

    List<String> expected = Arrays.asList(VICTIM_1, VICTIM_2);
    Assert.assertEquals(expected, spy.getSentAddresses());
  }
}