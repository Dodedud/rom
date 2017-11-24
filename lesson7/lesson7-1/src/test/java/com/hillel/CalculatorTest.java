package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by User on 15.11.2017.
 */
public class CalculatorTest {

  @Test
  public void shouldAddNumbers() {
    int result = Calculator.add(5, 7);

    assertEquals(12, result);
  }

  @Test
  public void shouldSubtractNumbers() {
    int result = Calculator.subtract(10, 7);

    assertEquals(3, result);
  }

}
