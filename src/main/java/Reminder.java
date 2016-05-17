import java.util.Timer;
import java.util.TimerTask;

public class Reminder {
  Timer timer;

  public Reminder(int minutes) {
    timer = new Timer();
    OutputTask myTask = new OutputTask();
    timer.scheduleAtFixedRate(myTask, minutes * 60 * 1000, minutes * 60 * 1000);
    // myTask.cancel();
  }

  class OutputTask extends TimerTask {
    private int i = 0;

    public void run() {
        System.out.println("Reached Time! " + i++);

        //create planet objects based on what time it is

        //gets planet info and creates string for emailing/text

        //sends text message to each user in database
        Email email = new Email();
        //for Each loop around this
        try {
          email.sendTextMessage("Here's a text!", "5416462794@vtext.com");
        } catch (Exception e) {
          System.out.println("Email failed to send");
        }
        //end for Each
    }
  }
}
