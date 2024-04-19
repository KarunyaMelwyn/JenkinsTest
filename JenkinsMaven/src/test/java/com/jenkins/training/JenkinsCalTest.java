package com.jenkins.training;
import static org.junit.Assert.*;
import org.junit.Test;

public class JenkinsCalTest {

    @Test
    public void addTest(){
        JenkinsCalculator myCalc = new JenkinsCalculator();
        assertEquals(10,myCalc.addNumbers(5,5));
    }

    @Test
    public void subTest(){
        JenkinsCalculator myCalc = new JenkinsCalculator();
        assertEquals(20,myCalc.subNumbers(25,5));
    }
}
