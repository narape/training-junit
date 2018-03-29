package com.mycompany.app;

public class FizzBuzz {

  public String sayFizzBuzz(int n) {
    String result = "";
    if (n % 3 == 0) {
      result = "Fizz";
    }
    if (n % 5 == 0) {
      result = result + "Buzz";
    }
    if (result.isEmpty()) {
      result = Integer.toString(n);
    }
    return result;
  }

}
