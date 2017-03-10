package NEFHAM;

public class User {
    String Name;
    String Email;
    String Password;
    int Age;
    char Gender;

    public User(String Name, String Email, String Password, int Age, char Gender) {
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
        this.Age = Age;
        this.Gender = Gender;
    }
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }


}

