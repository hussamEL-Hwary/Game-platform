
package NEFHAM;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GameController {
    public static boolean validateGameData ( String Category,String Name,String TeacherName,String Date, String Type ,int NoOfQuestions, String gamedata) throws FileNotFoundException, IOException
    {
      boolean check = false;
     
     if ((Category.length() > 0) && (Name.length()>0)&&( TeacherName.length()>0)&&((Date.length()>0))) {
    
          
        
          if (checkGameExistence(Category,Name,TeacherName,Date,  Type  ,NoOfQuestions,gamedata))
          check = true ;
       
     
     
}
    return check;
    }
     public static boolean checkGameExistence ( String Category,String Name,String TeacherName,String Date, String Type ,int NoOfQuestions, String gamedata) throws FileNotFoundException, IOException
    {
      boolean check = false;
     
       if(Game.createGame(Category, Name, TeacherName,Date,Type, NoOfQuestions,gamedata))
       {
           check = true ;
       }
     return check;
}
}
