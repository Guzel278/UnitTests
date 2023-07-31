
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Parenthesis;

public class ParenzthesisTest {
    //positive test
    @Test
    void testPositive1(){
        var res = Parenthesis.isBalanced("(test)[]");
        Assertions.assertTrue(res);
    }
    @Test
    void testPositive2(){
        var res = Parenthesis.isBalanced("([test])");
        Assertions.assertTrue(res);
    }
    @Test
    void testPositive3(){
        var res = Parenthesis.isBalanced("test123");
        Assertions.assertTrue(res);
    }
    //negative test
    @Test
    void testNegative1(){
        var res = Parenthesis.isBalanced("[)");
        Assertions.assertFalse(res);
    }
    @Test
    void testNegative2(){
        var res = Parenthesis.isBalanced("][(");
        Assertions.assertFalse(res);
    }
    @Test
    void testNegative3(){
        var res = Parenthesis.isBalanced("([test)]");
        Assertions.assertFalse(res);
    }
}
