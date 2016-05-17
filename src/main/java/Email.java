import java.time.LocalDateTime;
import java.util.List;
import org.apache.commons.mail.*;



public class Email {
  private String fromEmailAddress;
  private String fromEmailPassword;

  public Email(String fromEmailAddress, String fromEmailPassword) {
    this.fromEmailAddress = fromEmailAddress;
    this.fromEmailPassword = fromEmailPassword;
  }


  public void sendMailMessage(String text, String emailTo) throws Exception{

    SimpleEmail email = new SimpleEmail();
    email.setHostName("smtp.gmail.com");
    email.setSmtpPort(465);
    email.setAuthenticator(new DefaultAuthenticator(this.fromEmailAddress, this.fromEmailPassword));
    email.setSSLOnConnect(true);
    email.setFrom(this.fromEmailAddress, "Planet Tracker");
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
    email.setAuthenticator(new DefaultAuthenticator(this.fromEmailAddress, this.fromEmailPassword));
    email.setSSLOnConnect(true);
    email.setFrom(this.fromEmailAddress, "Planet Tracker");
    email.setSubject("Planet Tracker Text");
    email.setMsg(text);
    email.addTo(emailTo);

    // email.setDebug(true);

    email.send();
  }

}
