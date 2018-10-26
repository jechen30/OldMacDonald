class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     public Chick(String type, String sound){
       myType=type;
       double a = Math.random();
       if (a<0.5)
       
         mySound="cheep";
         else mySound= "cluck";
     }
     public Chick()
     {
       myType = "unknown";
       mySound= "unknown";
     }
     public String getSound(){return mySound;}
     public String getType(){return myType;}
}
