import java.io.FileNotFoundException;

public class StudentControl {
	
	Student studentObject;
	Game gameObject;
	public void verfiy(Student object)
	{
		
	}
	public void setStudent(Student object)
	{
	this.studentObject=object;	
	}
	public Student getStudent()
	{
		return studentObject;
	}
	public void addStudent(Student object) throws FileNotFoundException
	{
		StudentDB obj=new StudentDB();
		obj.addStudent(object);
		
	}
	public void play(Student object)   
	{
		
	}
	boolean check(String Email,String pass) throws FileNotFoundException
	{
		StudentDB object=new StudentDB();
		boolean b = object.check(Email, pass);
		return b;
	}
}
