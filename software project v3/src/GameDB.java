import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameDB {
ArrayList<Game>games=new ArrayList<Game>();

public void addGame(Game g)
{
 games.add(g);
}

public void save() 
{
	try{	
	File f =new File("E:\\java_zone\\software project\\game.txt");
	
	FileWriter out=new FileWriter(f);
	
	for(int i=0;i<games.size();i++)
	{
		out.write(games.get(i).getCategory()+System.lineSeparator());
		out.write(games.get(i).getName()+System.lineSeparator());
		out.write(games.get(i).getLevel()+System.lineSeparator());
		out.write(games.get(i).getratecount()+System.lineSeparator());
		out.write(games.get(i).getratesum()+System.lineSeparator());
		out.flush();
		for(int j=0;j<games.get(i).gamecontent.size();j++)
		{
			out.write(games.get(i).gamecontent.get(j).question+" "+games.get(i).gamecontent.get(j).ansewr+System.lineSeparator());
			
		}
		out.flush();
	}
	
	out.close();
	
	}catch(Exception e)
	{
		System.out.println("can't open file");
		
	}
	

}

public void load()
{
	try{
	File f =new File("E:\\java_zone\\software project\\game.txt");
	
	Scanner cin=new Scanner(f);
	
	while(cin.hasNext())
	{
		Game gm=new Game();
		
		gm.category=cin.next();
		gm.name=cin.next();
		gm.level=cin.nextInt();
		gm.rateCount=cin.nextInt();
		gm.rateSum=cin.nextInt();
		for(int i=0;i<5;i++) 
		{
			String q=cin.next();
			String a=cin.next();
			Questions obj= new Questions(q,a);
			gm.gamecontent.add(obj);
		
			
		}
		games.add(gm);
		
	}
	cin.close();
	}catch(Exception e)
	{
		System.out.println("can't open file");
	}
	
}

	

}
