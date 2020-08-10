package com.miya10kei;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
  private FizzBuzz fizzBuzz;

  @BeforeEach
  void setup() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  void shouldReturnFizzBuzzWhenValueIsDivisibleBy15() {
    // when
    var actual = fizzBuzz.getAnswer(15);
    //  then
    assertThat(actual).isEqualTo("FizzBuzz");
  }

  @Test
  void shouldReturnFizzWhenValueIsDivisibleBy3() {
    // when
    var actual = fizzBuzz.getAnswer(9);
    //  then
    assertThat(actual).isEqualTo("Fizz");
  }

  @Test
  void shouldReturnBuzzWhenValueIsDivisibleBy5() {
    // when
    var actual = fizzBuzz.getAnswer(10);
    //  then
    assertThat(actual).isEqualTo("Buzz");
  }

  @Test
  void shouldReturnTheValueWhenValueIsDivisibleBy3or5() {
    // when
    var actual = fizzBuzz.getAnswer(7);
    //  then
    assertThat(actual).isEqualTo("7");
  }
}
