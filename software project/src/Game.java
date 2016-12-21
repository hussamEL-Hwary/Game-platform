import java.util.ArrayList;

public class Game {
	 int level,rateCount,rateSum;
	 String name,category;
	 float rate;
	 ArrayList<String> comments = new ArrayList<String>();
	 ArrayList<Questions> gamecontent=new ArrayList<Questions>();
	
	void setName(String name)
	{
		this.name=name;
	}
	
	void setCategory(String category)
	{
		this.category=category;
	}
	
	void setLevel(int level)
	{
		this.level=level;
	}
	
	String getName()
	{
		return name;
	}
	
	String getCategory()
	{
		return category;
	}
	
	int getLevel()
	{
		return level;
	}
	
	int getratecount()
	{
		return rateCount;
	}
	
	int getratesum()
	{
		return rateSum;
	}
	
	void play()
	{
		GameDB object = new GameDB();
		object.load();
	}
	
	void rate(int rateValue)
	{
		
	}
	
	void comment(String userComment)
	{
		
	}
	
	void calcRate()
	{
		
	}
}
