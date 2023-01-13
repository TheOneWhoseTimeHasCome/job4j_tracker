package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test
    public void whenParamMinus1ThenExceptionCalc() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-1);
                });
    }

    @Test
    public void whenParamMinus99ThenExceptionCalc() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-99);
                });
    }

    @Test
    public void whenParamMinus888ThenExceptionCalc() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-888);
                });
    }
}