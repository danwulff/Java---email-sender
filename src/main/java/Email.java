import java.time.LocalDateTime;
import java.util.List;
import org.apache.commons.mail.*;



public class Email {

  public void email() {

  }

  public void sendMailMessage(String text, String emailTo) throws Exception{

    SimpleEmail email = new SimpleEmail();
    email.setHostName("smtp.gmail.com");
    email.setSmtpPort(465);
    email.setAuthenticator(new DefaultAuthenticator("planet.tracker123@gmail.com", "password"));
    email.setSSLOnConnect(true);
    email.setFrom("planet.tracker123@gmail.com", "Planet Tracker");
    email.setSubject("Planet Tracker email");
    email.setMsg(text);
    email.addTo(emailTo);

    // email.setDebug(true);

    email.send();
  }

  public void sendTextMessage(String text, String emailTo) throws Exception{

    SimpleEmail email = new SimpleEmail();
    email.setHostName("smtp.gmail.com");
    email.setSmtpPort(465);
    email.setAuthenticator(new DefaultAuthenticator("planet.tracker123@gmail.com", "password"));
    email.setSSLOnConnect(true);
    email.setFrom("planet.tracker123@gmail.com", "Planet Tracker");
    email.setSubject("Planet Tracker Text");
    email.setMsg(text);
    email.addTo(emailTo);

    // email.setDebug(true);

    email.send();
  }

}
