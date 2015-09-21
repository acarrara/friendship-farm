package it.friendship.farm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * COPYRIGHT (C) 2015 ESTECO SpA. All Rights Reserved.
 * Created Sep 21, 2015 7:01 PM.
 */
public class FarmerTest {

    private Farmer farmer;

    @Before
    public void setUp() throws Exception {
        farmer = new Farmer("Prince");
    }

    @Test
    public void shouldGetPrinceName() throws Exception {
        String expected = "Prince";
        String actual = farmer.getName();

        assertEquals(expected, actual);
    }
}