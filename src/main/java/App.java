import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {


  public static void main (String[] args){
    //timer testing
    System.out.println("initializing timers");
    // new Reminder(1); //sends email every 1 minute

    //system time testing
    System.out.println("Current time in milliseconds = ");
    System.out.println(System.currentTimeMillis());
    DateTime currentDateTime = new DateTime(System.currentTimeMillis());
    System.out.println(currentDateTime.getSimpleDateTime());

  }
}
