import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

import java.io.Console;

public class App {


  public static void main (String[] args){
    System.out.println("startup...");

    //Create Message object
    PlanetMessage myMessage = new PlanetMessage("planet.tracker123@gmail.com", args[0]);

    //Messaging Service
    System.out.println("initializing messaging service");
    //sends PlanetMessage email every 1 minute
    MessageService messageService = new MessageService(myMessage, Integer.valueOf(args[1]), 60);

  }
}
