package ru.codingtasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    private String balancedInput;
    private String unbalancedInput;

    @Before
    public void setup() {
        balancedInput = "({(<>)})";
        unbalancedInput = "({())})<";
    }

    @Test
    public void unbalancedTest() {
        Assert.assertFalse(Solution.isBalanced(unbalancedInput));
    }

    @Test
    public void balancedTest() {
        Assert.assertTrue(Solution.isBalanced(balancedInput));
    }

}
