package NEFHAM;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Registration {
 public static String TeacherName;
    public Registration() {
    }

    public static boolean createTeacherAccount(String Name, String Email, String Password, int Age, char Gender) throws FileNotFoundException {
        Teacher teacher = new Teacher(Name, Email, Password, Age, Gender);
        String TeacherAccount = "";
        TeacherAccount = Name + ";" + Email + ";" + Password + ";" + Age + ";" + Gender;
        File file = new File("Teachers.txt");
 
        Scanner getData= new Scanner(file);
        boolean check=true;
        while (getData.hasNextLine()) {
            String s = getData.nextLine();
try {
            String[] arr = new String[5];
            arr = s.split(";");
            
            if (arr[1].equalsIgnoreCase(Email)) {
                
                check= false;
                break;
            }
            
 } catch (ArrayIndexOutOfBoundsException e) {

            }
        }
      
        if (file.exists() && file.canWrite() && check == true) {

            try {
                FileWriter writer = new FileWriter(file, true);
                writer.write(TeacherAccount);
                writer.write(System.lineSeparator());
                writer.close();
            } catch (IOException e) {

            }
        }
          return check;
    }
  public static boolean createStudentAccount(String Name, String Email, String Password, int Age, char Gender) throws FileNotFoundException {
        Student student = new Student(Name, Email, Password, Age, Gender);
        String StudentAccount = "";
        StudentAccount = Name + ";" + Email + ";" + Password + ";" + Age + ";" + Gender;
        File file = new File("Students.txt");
        Scanner getData= new Scanner(file);
        boolean check=true;
         while (getData.hasNextLine()) {
            String s = getData.nextLine();
try {
            String[] arr = new String[5];
            arr = s.split(";");
            
            if (arr[1].equalsIgnoreCase(Email)) {
                
                check= false;
                break;
            }
            
 } catch (ArrayIndexOutOfBoundsException e) {

            }
        }
      
        if (file.exists() && file.canWrite() && check == true) {

            try {
                FileWriter writer = new FileWriter(file, true);
                writer.write(StudentAccount);
                writer.write(System.lineSeparator());
                writer.close();
            } catch (IOException e) {

            }
        }
       return check; 
    }
    public static boolean loginAsTeacher(String Email, String Password) throws FileNotFoundException {
        File teachers = new File("Teachers.txt");
        Scanner getData= new Scanner(teachers);
        boolean check=false;
        while (getData.hasNextLine()) {
            String s = getData.nextLine();
try {
            String[] arr = new String[5];
            arr = s.split(";");
            
            if (arr[1].equalsIgnoreCase(Email) && arr[2].equalsIgnoreCase(Password)) {
                check= true;
                TeacherName=arr[0];
            }
            
 } catch (ArrayIndexOutOfBoundsException e) {

            }
        }
        return check;
        
    }
        public static boolean loginAsStudent(String Email, String Password) throws FileNotFoundException {
        File teachers = new File("Students.txt");
        Scanner getData= new Scanner(teachers);
        boolean check=false;
        while (getData.hasNextLine()) {
            String s = getData.nextLine();
try {
            String[] arr = new String[5];
            arr = s.split(";");
            
            if (arr[1].equalsIgnoreCase(Email) && arr[2].equalsIgnoreCase(Password)) {
                
                check= true;
            }
            
 } catch (ArrayIndexOutOfBoundsException e) {

            }
        }
        return check;
        
    }
}
