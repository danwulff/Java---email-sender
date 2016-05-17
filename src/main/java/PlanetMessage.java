
public class PlanetMessage {
  private Email email;

  public PlanetMessage(String fromAddress, String fromPassword) {
    this.email = new Email(fromAddress, fromPassword);
  }

  //sending messages, doesn't know what time it is, so get the current time (rounded down)
  public void send() {
    DateTime presentTime = new DateTime(System.currentTimeMillis());
    this.send(presentTime.getSimpleDateTimeRoundedDown());
  }

  //sending messages using a manual time
  public void send(String time) {
    System.out.println("Messaging users for time: " + time);

    //create planet objects based on what time it is

    //gets planet info and creates string for emailing/text
    String messageToSend = "test";
    String userAddress = "5416462794@vtext.com";

    //loop through users database and send messages
      //get user address from database

      //send message
      this.email.sendTextMessage(messageToSend, userAddress);

    //end for Each
  }
}
