package NEFHAM.NEFHAM;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import NEFHAM.Game;

public class GameTest {

	@DataProvider(name = "playGameData")
	public Object[][] GetplayGameData() {
		return new Object[][] {
				{ "Math;s;Saleh;18/12/2016;MCQ;3;What is your name;a/b/c/d;a;What is your country;m/n/o/p;n;What is your goal;h/n/j/p;j",
						"s" },
				{ "Math;s;Saleh;18/12/2016;MCQ;3;What is your name;a/b/c/d;a;What is your country;m/n/o/p;n;What is your goal;h/n/j/p;j",
						"h" } };
	}

	@DataProvider(name = "createGameData")
	public Object[][] GetCreateGameData() {
		return new Object[][] {
				{ true, "math", "pazzle", "saleh", "10/3/2017", "MCQ", 1, "What is your goal;h/n/j/p;j" } };
	}

	@Test(dataProvider = "createGameData")
	public void createGame(boolean result, String Category, String Name, String TeacherName, String Date, String Type,
			int NoOfQuestions, String gamedata) throws IOException {
		Assert.assertEquals(result, Game.createGame(Category, Name, TeacherName, Date, Type, NoOfQuestions, gamedata));
	}

	@Test(dataProvider = "playGameData")
	public void playGame(String result, String name) throws FileNotFoundException {
		Assert.assertEquals(result, Game.playGame(name));
	}
}
