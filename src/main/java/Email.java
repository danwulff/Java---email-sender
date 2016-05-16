import java.time.LocalDateTime;
import java.util.List;
import org.apache.commons.mail.*;



public class Email {

  public void email() {

  }

  public void sendMail(String text) throws Exception{

    SimpleEmail email = new SimpleEmail();
    email.setHostName("smtp.gmail.com");
    email.setSmtpPort(465);
    email.setAuthenticator(new DefaultAuthenticator("email@gmail.com", "password"));
    email.setSSLOnConnect(true);
    email.setFrom("email@gmail.com", "name");
    email.setSubject("Test message");
    email.setMsg(text);
    email.addTo("another@email.com");

    email.setDebug(true);

    email.send();

  }

}
