import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

import java.io.Console;

public class App {


  public static void main (String[] args){
    System.out.println("startup");

    //Messaging Service
    System.out.println("initializing messaging service");
    //sends email every 1 minute, passes password from gradle build prompt
    MessageService messageService = new MessageService(1, args[0]);

    //system time testing
    /*System.out.println("Current time in milliseconds = ");
    System.out.println(System.currentTimeMillis());
    DateTime currentDateTime = new DateTime(System.currentTimeMillis());
    System.out.println(currentDateTime.getSimpleDateTime());*/
  }
}
