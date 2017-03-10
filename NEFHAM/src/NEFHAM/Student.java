package NEFHAM;
public class Student extends User{
    int Score;

    public Student(String Name, String Email, String Password, int Age, char Gender) {
        super(Name, Email, Password, Age, Gender);
    }
    
       public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    } 
}
