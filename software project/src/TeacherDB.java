import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherDB {
	void addTeacher(Teacher object) throws FileNotFoundException
	{
		File fa = new File("E:\\java_zone\\software project\\cat.txt");
		PrintWriter outer = new PrintWriter(fa);
		outer.println(object.name);
		outer.println(object.age);
		outer.println(object.gender);
		outer.println(object.academicMail);
		outer.println(object.password);
		outer.println(object.phone);
		outer.flush();
		outer.close();
	}
	boolean check(String academicMail,String pass) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("E:\\java_zone\\software project\\cat.txt"));
		Teacher objc = new Teacher();
		String t;
		int l = 1;
		while (sc.hasNext()) {
			objc.setName(sc.nextLine());
			t = sc.nextLine();
			l = Integer.parseInt(t);
			objc.setAge(l);
			objc.setGender(sc.nextLine());
			objc.setAcademicMail(sc.nextLine());
			objc.setPassword(sc.nextLine());
			objc.setPhone(sc.nextLine());
			if (objc.getName().equals(academicMail) && objc.getPassword().equals(pass))
				return true;
		}
		return false;
	}
}
