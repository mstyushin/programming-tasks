package ru.mstyushin.playground;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void case1() {
        int[] inputArray = new int[] {1,2,3,4,5};
        int target = 4;
        int[] result = Solution.twoSum(inputArray, target);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(2, result[1]);
    }

    // TODO: add moar test cases here

}
