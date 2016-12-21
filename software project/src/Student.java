
public class Student {
	int age,score;
	String name,gender,mail,phone,password;
	
	public Student ()
	{
		age=0;
		score=0;
		name="";
		gender="";
		mail="";
		phone="";
		password="";
	}
	
 public	Student(String name,int age,String gender,String phone,String mail)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phone=phone;
		this.mail=mail;
	}
	int getAge()
	{
		return age;
	}
	String getName()
	{
		return name;
	}
	String getGender()
	{
		return gender;
	}
	String getMail()
	{
		return mail;
	}
	String getPhone()
	{
		return phone;
	}
	public String getPassword()
	{
		return password;
	}

	int getScore()
	{
		return score;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	void setMail(String mail)
	{
		this.mail=mail;
	}
	void setPhone(String phone)
	{
		this.phone=phone;
	}
	void setPassword(String password)
	{
		this.password=password;
	}
	void setGender(String gender)
	{
		this.gender=gender;
	}
	void setScore(int score)
	{
		this.score=score;
	}

	
}
