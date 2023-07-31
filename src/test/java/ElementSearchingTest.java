import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.ElementSearching;


public class ElementSearchingTest {
     ElementSearching.Node root;
     ElementSearching.Node left;
     ElementSearching.Node right;
    @BeforeEach
    void  init() {
        root = new ElementSearching.Node(2);
        left = new ElementSearching.Node(1);
        right = new ElementSearching.Node(3);
        root.left = left;
        root.right = right;
    }
     @Test
   void testPositive1(){
        var res = ElementSearching.search(1, root);
        Assertions.assertEquals(left.key, res.key);
    }
    @Test
    void testPositive2(){
        var res = ElementSearching.search(3, root);
        Assertions.assertEquals(right.key, res.key);
    }
    @Test
    void testNegative(){
        var res = ElementSearching.search(2, root);
        Assertions.assertEquals(left.key, res.key);
    }
}
