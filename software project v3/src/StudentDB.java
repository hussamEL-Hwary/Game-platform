import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDB {
	void addStudent(Student object) throws FileNotFoundException {
		File f = new File("E:\\java_zone\\software project\\car.txt");
		PrintWriter out = new PrintWriter(f);
		out.println(object.name);
		out.println(object.age);
		out.println(object.gender);
		out.println(object.mail);
		out.println(object.password);
		out.println(object.phone);
		out.println(object.score);
		out.flush();
		out.close();
	}

	public boolean check(String Email, String pass) throws FileNotFoundException {
		File f = new File("E:\\java_zone\\software project\\car.txt");
		Scanner sc = new Scanner(f);
		
		Student obj = new Student();
		String t;
		int l = 1;
		boolean b=false;
		while (sc.hasNext()) {
			obj.setName(sc.nextLine());
			t = sc.nextLine();
			l = Integer.parseInt(t);
			obj.setAge(l);
			obj.setGender(sc.nextLine());
			obj.setMail(sc.nextLine());
			obj.setPassword(sc.nextLine());
			obj.setPhone(sc.nextLine());
			t = sc.nextLine();
			l = Integer.parseInt(t);
			obj.setScore(l);
			if (obj.getName().equals(Email) && obj.getPassword().equals(pass))
			{
				b= true;
				break;
			}
		}
		sc.close();
		if(b)
			return true;
		return false;
	}
}
