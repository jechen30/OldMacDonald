class NamedCow extends Cow
{
  private String myName;
  public String getName()
  {
    return myName;
  }
  public NamedCow(String type, String name, String sound){
    myType=type;
    myName=name;
    mySound=sound;
  }
  
}
