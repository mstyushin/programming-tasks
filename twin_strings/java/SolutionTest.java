import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void case1() {
        String[] a = {"cdab", "dcba"};
        String[] b = {"abcd", "abcd"};
        Assert.assertTrue(Solution.twins(a,b)[0]);
        Assert.assertFalse(Solution.twins(a,b)[1]);
    }

    @Test
    public void case2() {
        String[] a = {"ab",  "aaa", "cab", "abcde"};
        String[] b = {"abc", "aaa", "bac", "edcba"};
        Assert.assertFalse(Solution.twins(a,b)[0]);
        Assert.assertTrue(Solution.twins(a,b)[1]);
        Assert.assertTrue(Solution.twins(a,b)[2]);
        Assert.assertTrue(Solution.twins(a,b)[3]);
    }

    @Test
    public void case3() {
        String[] a = {"ibcdefghajklmnop", "abcd"};
        String[] b = {"abcdefghijklmnop"};
        Assert.assertTrue(Solution.twins(a,b)[0]);
        Assert.assertFalse(Solution.twins(a,b)[1]);
    }

    @Test
    public void case4() {
        String[] a = {"abcdefghijklmnop"};
        String[] b = {"ibcdefghajklmnop", "abcd"};
        Assert.assertTrue(Solution.twins(a,b)[0]);
        Assert.assertFalse(Solution.twins(a,b)[1]);
    }
}