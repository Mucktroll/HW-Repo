import java.util.Scanner;

public class UserInterface implements AutoCloseable
{
  public UserInterface ()
  {
    scanner = new Scanner (System.in);
  }

  // returns next read name (line), return value is empty string if no
  // more names are available
  private String readName ()
  {
    if (scanner.hasNextLine ())
      return scanner.nextLine ();
    else
      return "";
  }

  // needed for implementation of AutoCloseable
  public void close ()
  {
    if (scanner != null)
      scanner.close ();
  }

  // returns an array of names read from the user
  public String[] readNames ()
  {
    String [] names = new String[3];
    for (int i = 0; i < names.length; i++)
    {
      names[i] = readName();
    }
    return names;
  }

  // prints names, each name on a separate line
  public void showNames (String[] names)
  {
    for (String n : names)
      System.out.println(n);
  }

  private Scanner scanner;
}
