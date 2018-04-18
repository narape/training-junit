package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class TestEmailService implements EmailService {
    private List<String> sentAddresses = new ArrayList<>();

    @Override
    public boolean sendEmail(String address, String body) {
        sentAddresses.add(address);
        return true;
    }

    List<String> getSentAddresses() {
        return sentAddresses;
    }
}
