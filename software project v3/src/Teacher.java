
public class Teacher {
	int age;
	String name,gender,phone,academicMail,password;
	Teacher(String name,int age,String phone,String gender,String academicMail)
	{
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.gender=gender;
		this.academicMail=academicMail;
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
	String getPhone()
	{
		return phone;
	}
	String getAcademicMail()
	{
		return academicMail;
	}
	String getPassword()
	{
		return password;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setGender(String gender)
	{
		this.gender=gender;
	}
	void setPassword(String password)
	{
		this.password=password;
	}
	void setAcademicMail(String academicMail)
	{
		this.academicMail=academicMail;
	}
	void setPhone(String phone)
	{
		this.phone=phone;
	}
	void addGame()
	{
		
	}
}
