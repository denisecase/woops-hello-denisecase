package woops.hello.denisecase;

public class DeniseCaseGreeter {

  public static String getGreeting(){
    // It would be nice to code like the cool kids with a new multiline string in Java 16...
    // return """
    // Welcome to 241 and the World of Object-Oriented Programming!
    // Cars, Cats, Students, Employees, Developers, Designers - 
    // Cards, Decks, Dealers, Hands, Games - 
    // We can create classes to code all kinds of things!
    // """;
    return "" +
      "Welcome to 241 and the World of Object-Oriented Programming!\n" +
      "Cars, Cats, Students, Employees, Developers, Designers - \n" +
      "Cards, Decks, Dealers, Hands, Games - \n" +
      "We can create classes to code all kinds of things!\n" +
      "";
  }
  
  public static void main(String[] args){
    String msg = DeniseCaseGreeter.getGreeting();
    System.out.println(msg);
  }
}
