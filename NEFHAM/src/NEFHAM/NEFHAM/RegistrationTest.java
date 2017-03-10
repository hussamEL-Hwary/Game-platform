package NEFHAM.NEFHAM;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import NEFHAM.Registration;

public class RegistrationTest {

	@DataProvider(name = "loginAsStudentData")
	public Object[][] GetloginAsStudentData() {
		return new Object[][] { { true, "youef@gmail.com", "1111" }, { false, "abod@gmail.com", "4444" },
				{ true, "omar@yahoo.com", "1234" } };
	}

	@DataProvider(name = "loginAsTeacherData")
	public Object[][] GetloginAsTeachertData() {
		return new Object[][] { { true, "sasa@yahoo.com", "123456789" }, { false, "hussam@gmail.com", "4444" },
				{ true, "jo@gamil.com", "1233" } };
	}

	@DataProvider(name = "createStudentAccountData")
	public Object[][] GetcreateStudentAccountData() {
		return new Object[][] { { true, "Hussam", "hossam@gmail.com", "123456", 20, 'm' },
				{ false, "youef", "omar@yahoo.com", "1234", 15, 'm' }, { false, "youef", "", "1234", 15, 'm' } };
	}

	@DataProvider(name = "createTeacherAccountData")
	public Object[][] GetcreateTeacherAccountData() {
		return new Object[][] { { true, "Omar", "moratak@gmail.com", "124456", 20, 'm' },
				{ false, "yousef", "jo@gamil.com", "1233", 5, 'm' } };
	}

	@Test(enabled = true, dataProvider = "createStudentAccountData")
	public void createStudentAccount(boolean result, String name, String mail, String password, int age, char gender)
			throws FileNotFoundException {
		Assert.assertEquals(result, Registration.createStudentAccount(name, mail, password, age, gender));
	}

	@Test(enabled = true, dataProvider = "createTeacherAccountData")
	public void createTeacherAccount(boolean result, String name, String mail, String password, int age, char gender)
			throws FileNotFoundException {
		Assert.assertEquals(result, Registration.createTeacherAccount(name, mail, password, age, gender));
	}

	@Test(enabled = true, dataProvider = "loginAsStudentData")
	public void loginAsStudent(boolean result, String mail, String password) throws FileNotFoundException {
		Assert.assertEquals(result, Registration.loginAsStudent(mail, password));

	}

	@Test(enabled = true, dataProvider = "loginAsTeacherData")
	public void loginAsTeacher(boolean result, String mail, String password) throws FileNotFoundException {
		Assert.assertEquals(result, Registration.loginAsTeacher(mail, password));

	}

}
