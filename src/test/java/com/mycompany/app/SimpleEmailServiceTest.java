package com.mycompany.app;

import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

public class SimpleEmailServiceTest {

  private static final String BLACKLISTED_ADDRESS = "thieve@evil.com";
  private static final String EMAIL_BODY = "Please buy milk";

  private final SimpleEmailService emailer =
      new SimpleEmailService(Collections.singletonList(BLACKLISTED_ADDRESS));

  @Test
  public void shouldReturnTrueForAddressesNotInTheBlacklist() {
    boolean result = emailer.sendEmail("pepe@gmail.com", EMAIL_BODY);

    Assert.assertTrue(result);
  }

  @Test
  public void shouldReturnFalseForAddressesInTheBlacklist() {
    boolean result = emailer.sendEmail(BLACKLISTED_ADDRESS, EMAIL_BODY);

    Assert.assertFalse(result);
  }

  @Test(expected = NullPointerException.class)
  public void shouldThrowNullPointerExceptionWhenAddressIsNull() {
    emailer.sendEmail(null, EMAIL_BODY);
  }
}