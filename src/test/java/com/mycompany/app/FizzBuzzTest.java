package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

  private final FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void shouldReturnFizzWhenNumberIsDivisibleBy3() {
    String result = fizzBuzz.sayFizzBuzz(12); //Act

    assertEquals("Fizz", result); //Assert
  }

  @Test
  public void shouldReturnBuzzWhenNumberIsDivisibleBy5() {
    String result = fizzBuzz.sayFizzBuzz(10); //Act

    assertEquals("Buzz", result); //Assert
  }

  @Test
  public void shouldReturnFizzBuzzWhenNumberIsDivisibleBy3And5() {
    String result = fizzBuzz.sayFizzBuzz(15); //Act

    assertEquals("FizzBuzz", result); //Assert
  }


  @Test
  public void shouldReturnSameNumberForNumberThatAreNotDivisibleBy3Or5() {
    String result = fizzBuzz.sayFizzBuzz(7); //Act

    assertEquals("7", result); //Assert
  }

}