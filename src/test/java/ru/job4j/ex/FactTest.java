package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class FactTest {

    @Test
    public void whenParamMinus1ThenExceptionCalc() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less then 0");
    }

    @Test
    public void whenCalc3Then() {
        int expected = 6;
        int result = new Fact().calc(3);
        assertThat(result).isEqualTo(expected);
    }
}