import org.junit.*;
import static org.junit.Assert.*;


public class EmailTest {

  @Test
  public void testing(){
    Email myEmail = new Email();
    try {
      myEmail.sendMail("Here's an email");
    } catch (Exception e) {

    }
    // assertTrue(false);
  }
}
