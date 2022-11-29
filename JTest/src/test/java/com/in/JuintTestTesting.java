package com.in;

import org.junit.Assert;
import org.junit.Test;

public class JuintTestTesting {
    @Test
   public  void twoPlusTwoShouldEqualFour(){
        JunitTest calculator = new JunitTest();

        Assert.assertEquals(4,calculator.add(2,2));
//           var calculator = new SimpleCalculator();
//           assertEquals(4,calculator.add(2,2));

    }


}

