import java.io.FileNotFoundException;

public class TeacherControl {
	Teacher teacherObject;
	Game gameObject;
	void setTeacher(Teacher object)
	{
	this.teacherObject=object;	
	}
	Teacher getTeacher()
	{
		return teacherObject;
	}
	void setGame(Game object)
	{
		this.gameObject=object;
	}
	void addTeacher(Teacher object) throws FileNotFoundException
	{
		TeacherDB obje = new TeacherDB();
		obje.addTeacher(object);
	}
	Game getGame()
	{
		return gameObject;
	}
	boolean check(String Email,String pass) throws FileNotFoundException
	{
		TeacherDB db=new TeacherDB();
		boolean b = db.check(Email, pass);
		return b;
	}
}
