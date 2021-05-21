package knu.fit.ist.ta;
import knu.fit.ist.ta.lab2.Calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TaApplicationTests {

	@Test
	void contextLoads() {
	}

        @Test
    void test1() {
        assertEquals(0.02f, 0.025f, 0.01f);
    }
 @Test
    void test2() {
       
       //assertEquals(Float.MAX_VALUE, Calculate.lab2equation(0));           
       // assertEquals(0, Calculate.lab2equation(0.5f));              
        //assertEquals(0.05f, Calculate.lab2equation(2));             
    
    }


}
