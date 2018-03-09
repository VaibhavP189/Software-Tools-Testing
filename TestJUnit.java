package TestJUnit;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {

	String message = "HelloWorld";
	MessageUtil messageUtil = new MessageUtil("message");
	
    @Test
	public void testPrintMessage() {
		assertEquals (message,messageUtil.printMessage());
		
	}

}
