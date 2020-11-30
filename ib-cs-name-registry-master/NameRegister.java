public class NameRegister
{
  public NameRegister ()
  {
  }

  // sets the names in the register
  public void setNames (String[] names)
  {
    for (int i = 0; i < registerArr.length; i++)
    {
      registerArr[i] = names[i];
    }
  }

  // return an array of current names in register
  public String[] getNames ()
  {
    return registerArr;
  }

  public String [] registerArr = new String[3];
}
