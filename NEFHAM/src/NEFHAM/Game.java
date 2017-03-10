package NEFHAM;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;

public class Game {
 String Category;
 String Name;
 String TeacherName;
 String Date; 
 String Type; 
 int NoOfQuestions;
 String Question;
 String Answers;
 String CorrectAnswer;  
 public static int score =0;
    public Game(String Category, String Name, String TeacherName, String Date, String Type, int NoOfQuestions, String Question, String Answers, String CorrectAnswer) {
        this.Category = Category;
        this.Name = Name;
        this.TeacherName = TeacherName;
        this.Date = Date;
        this.Type = Type;
        this.NoOfQuestions = NoOfQuestions;
        this.Question = Question;
        this.Answers = Answers;
        this.CorrectAnswer = CorrectAnswer;
       
    }


        public static boolean createGame(String Category,String Name,String TeacherName,String Date, String Type ,int NoOfQuestions, String gamedata) throws IOException {
           
            boolean check=true;
             
           // Game game = new Game(Category,Name, TeacherName, Date, Type,NoOfQuestions, Question, Answers ,CorrectAnswer);
            String Game;
            Game = Category + ";" + Name + ";" + TeacherName + ";" + Date + ";"+ Type+ ";" + NoOfQuestions+ ";"+ gamedata;
            File file = new File("Games.txt");
            if (file.exists() && file.canWrite()) {

              Scanner getData= new Scanner(file);
                    FileWriter writer = new FileWriter(file, true);
                       System.out.println(Game);
                while (getData.hasNextLine()) {
                String s = getData.nextLine();
    
                String[] arr ;
                arr = s.split(";");
                try{
                if (arr[1].equalsIgnoreCase(Name)) {
                     check = false ;
                     
                }
                } catch (ArrayIndexOutOfBoundsException ex) {}
                }
               /* String[] arr = Game.split(";");
                //result=arr.toString();
                //System.out.println(result);
                result += Category + ";" + Name + ";" + TeacherName + ";" + Date + ";"+ Type+";"+NoOfQuestions+";";
                
                System.out.println(result);
                if (NoOfQuestions!=0)
                {
                    if(NoOfQuestions==CreateGame.NoOfQuestions){
                        
                    
                             for (int i = 0 ; i < 15  ;i++)
                
                     result += arr[i+6]+";";
                             NoOfQuestions--;
                    }
                    else {
                for (int i = 0 ; i < 3  ;i++)
                
                     result += arr[i+6]+";";}
                }
                */

            
       /*
            int o=0;
            String b="";
            if (o<NoOfQuestions){
                if(o==0){
                result = Game;
                b=Game;
            }else 
            {
                for(int i=0;i<6;i++){
                b=b.substring(b.indexOf(";")+1);
            }
               result+=b;
         
            }
                o++;
                  
                }*/
                
                
            
            
                   
            
                    if (check == true)
                    {
                    writer.write(Game);
                    writer.write(System.lineSeparator());
                    writer.close();
                    }

                
            
 }

            
            return check ;
        }
    
        public static String playGame(String Name) throws FileNotFoundException {

           File games = new File("Games.txt");
            Scanner getData= new Scanner(games);
            String result="";
            while (getData.hasNextLine()) {
                String s = getData.nextLine();
    try {
                String[] arr ;
                arr = s.split(";");
                for (int i = 0 ; i < 6 + Integer.parseInt(arr[5])*3;i++)
                if (arr[1].equalsIgnoreCase(Name)) {
                     result += arr[i]+";";
                }
     } catch (ArrayIndexOutOfBoundsException e) {
                }
            }
            result= result.substring(0, result.lastIndexOf(";"));
            return result;
            
        }
     
     public static int calculateScore (String Answer ,String CorrectAnswer){
         
            if (Answer.equalsIgnoreCase(CorrectAnswer))
            {
                Game.score++;
            }
            return Game.score ;
     }
  public static ArrayList<String> chooseCategory(String Category) throws FileNotFoundException 
  {
      ArrayList<String> Games = new ArrayList();
       File games = new File("Games.txt");
        Scanner getData= new Scanner(games);
   
        while (getData.hasNextLine()) {
            String s = getData.nextLine();
try {
            String[] arr ;
            arr = s.split(";");
            
            if (arr[0].equalsIgnoreCase(Category)) {

                Games.add(arr[1]);   
            }
            
 } catch (ArrayIndexOutOfBoundsException e) {

            }
        }
   
        return Games;
        
      
  }




    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getTeachername() {
        return TeacherName;
    }

    public void setTeachername(String Teachername) {
        this.TeacherName = Teachername;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getAnswer() {
        return Answers;
    }

    public void setAnswer(String Answer) {
        this.Answers = Answer;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
}
