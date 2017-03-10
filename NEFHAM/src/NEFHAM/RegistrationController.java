package NEFHAM;



import java.io.FileNotFoundException;


public class RegistrationController {
    
    public static boolean testEmailAndPassword (String Email , String Password , boolean Teacher) throws FileNotFoundException
    {
 
        boolean check=false;

         
           if (Teacher == true && Registration.loginAsTeacher(Email, Password)) {
                
                check= true;
                
            }
           
           if (Teacher == false &&Registration.loginAsStudent(Email, Password)) {
                
                check= true;
                
            }
            

        
        return check;
        
    }
    
     public static boolean validateUserData ( String Name , String Email , String Password ,int Age , char Gender , boolean Teacher ) throws FileNotFoundException
    {
      boolean check = false;
     
     if ((Password.length() > 8 && Password.length()<32) && (Email.length()>10 &&  Email.contains("@"))&&( Gender=='m' ||  Gender=='F')&&((Name.length()>3 && Name.length()<20))) {
    
          
          if (Teacher == false)
          {
          if (checkEmailExistence(Name, Email, Password, Age, Gender,Teacher))
          check = true ;
          }
          if (Teacher == true)
          {
          if (checkEmailExistence(Name, Email, Password, Age, Gender,Teacher))
          check = true ;
          }
     }
     return check;
}
     public static boolean checkEmailExistence ( String Name ,String Email , String Password ,int Age , char Gender , boolean Teacher ) throws FileNotFoundException
    {
      boolean check = false;
     
          if (Teacher == false)
          {
          if (Registration.createStudentAccount(Name, Email, Password, Age, Gender))
          check = true ;
          }
          if (Teacher == true)
          {
          if (Registration.createTeacherAccount(Name, Email, Password, Age, Gender))
          check = true ;
          }
     
     return check;
}
}