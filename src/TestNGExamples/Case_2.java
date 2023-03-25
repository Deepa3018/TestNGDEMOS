package TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Case_2 {
    @Test
    public void add(){
        int a=3 , b=4;
        int c=a+b;
        Assert.assertEquals(7,c);
    }
    @Test
    public void sub(){
        int a=3 , b=4;
        int c=a-b;
        Assert.assertEquals(-1,c);
    }
    @Test
    public void mul(){
        int a=3 , b=4;
        int c=a*b;
        Assert.assertEquals(12,c);
    }
}
