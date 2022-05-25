package edu.cds.registrationsystem;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AgeTest {

    @Test
    void testAge() {
        Age me = new Age("1998-09-29");

        assertEquals(23, me.getAge());
        assertEquals("1998-09-29", me.getDateOfBirth());
        me.setDateOfBirth("1997-09-29");
        assertEquals(24, me.getAge());
    }
}