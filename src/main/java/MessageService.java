import java.util.Timer;
import java.util.TimerTask;

public class MessageService {
  private Timer timer;

  public MessageService(int minutes, String fromEmailPassword) {
    timer = new Timer();
    OutputTask myTask = new OutputTask(fromEmailPassword);
    timer.scheduleAtFixedRate(myTask, minutes * 60 * 1000, minutes * 60 * 1000);
  }


  class OutputTask extends TimerTask {
    private String fromEmailPassword;
    private int i = 0;

    public OutputTask (String fromEmailPassword) {
      this.fromEmailPassword = fromEmailPassword;
    }



    //MAIN LOOP FOR MESSAGING
    public void run() {
        System.out.println("Reached Time! " + i++);

        //create planet objects based on what time it is

        //gets planet info and creates string for emailing/text

        //Create email object (needs from email adddress and password)
        Email email = new Email("planet.tracker123@gmail.com", this.fromEmailPassword);

        //loop through users database and send messages
        //user address from database
        try {
          email.sendTextMessage(emailText, address);
        } catch (Exception e) {
          System.out.println("Text failed to send");
        }

        //end for Each
    }



  }
}
