import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.TestingArray;

public class TestingArrayTest {
    //positive test
    @Test
    void testPositive1(){
        int[] array = {99, 66, 99, 66};
        var res = TestingArray.checkArray(array);
        Assertions.assertTrue(res);
    }
    @Test
    void testPositive2(){
        int[] array = {1,2,3,4,0,9,8,0,4,3,5,7};
        int[] expect = {4,3,5,7};
        var res = TestingArray.returnArray(array);
        Assertions.assertArrayEquals(expect, res);
    }
    //negative test
    @Test
    void testNegative1(){
        int[] array = {99, 66, 99, 66, 1};
        var res = TestingArray.checkArray(array);
        Assertions.assertFalse(res);
    }
    @Test
    void testNegative2(){
        int[] array = {1,2,3,4,0,9,8,0};
        int[] expect = {};
        var res = TestingArray.returnArray(array);
        Assertions.assertArrayEquals(expect, res);
    }
    @Test
    void testNegative3(){
        int[] array = {0};
        int[] expect = {};
        var res = TestingArray.returnArray(array);
        Assertions.assertArrayEquals(expect, res);
    }
    @Test
    void testNegative4(){
        int[] array = {};
        int[] expect = {};
        var res = TestingArray.returnArray(array);
        Assertions.assertArrayEquals(expect, res);
    }
}
