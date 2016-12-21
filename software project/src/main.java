import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		StudentControl s1 = new StudentControl();
		Teacher s2 = new Teacher();
		GameDB Appgames = new GameDB(); //
		TeacherControl s3 = new TeacherControl();
		boolean work = true;
		int x = 0;
		while (work) {
			System.out.println("to login press 1");
			System.out.println("to register press2");
			System.out.println("to Exit press 3");
			x = sc.nextInt();
			if (x == 1) {
				System.out.println("to login as teacher press 1");
				System.out.println("to login as student press 2");
				int z = sc.nextInt();
				if (z == 2) {
					String Email = "", pass = "";
					boolean b = false;
					System.out.println("Enter your Email");
					Email = sc.next();
					System.out.println("Enter your password");
					pass = sc.next();
					b = s1.check(Email, pass);
					if (!b)
						System.out.println("invalid Email");
					else {
						System.out.println("to play in category of math press 1");
						System.out.println("to play in category of science press 2");
						System.out.println("to play in category of programming press 3");
						int y = sc.nextInt();
						GameDB object = new GameDB();
						object.load();
						if (y == 1) {

							for (int i = 0; i < object.games.size(); i++) {
								if (object.games.get(i).category.equals("math")) {
									System.out.println(object.games.get(i).name);
								}

							}
							System.out.println("Enter The Name of The Game You want to play");
							String p = sc.next();
							for (int i = 0; i < object.games.size(); i++) {
								if (object.games.get(i).category.equals("math") && object.games.get(i).name.equals(p)) {
									System.out.println("Enter Your Answer After Each Quastion T or F");
									for (int j = 0; j < object.games.get(i).gamecontent.size(); j++) {
										System.out.println(object.games.get(i).gamecontent.get(j).question);
										String ans = sc.next();
										if (ans.equals(object.games.get(i).gamecontent.get(j).ansewr)) {
											System.out.println("correct answer");
											// object.games.get(i).rateCount++;
										} else {
											System.out.println("wrong answer");
										}

									}
									System.out
											.println("rate the game from 1 to 5 , 1 for the worst and 5 for the best");
									int q = sc.nextInt();
									object.games.get(i).rateCount = q;
									object.games.get(i).rateSum += q;
									System.out.println("if you want to comment press 1 , else press 2");
									q = sc.nextInt();
									if (q == 1) {
										System.out.println("Enter Your Comment");
										String st = sc.nextLine();
										object.games.get(i).comments.add(st);
									}
									System.out.println("you are solve " + object.games.get(i).rateCount
											+ " problems and didnt solve " + (5 - object.games.get(i).rateCount)
											+ " problems");

								}

							}

						} else if (y == 2) {
							for (int i = 0; i < object.games.size(); i++) {
								if (object.games.get(i).category.equals("science")) {
									System.out.println(object.games.get(i).name);
								}

							}
							System.out.println("Enter The Name of The Game You want to play");
							String p = sc.next();
							for (int i = 0; i < object.games.size(); i++) {
								if (object.games.get(i).category.equals("science")
										&& object.games.get(i).name.equals(p)) {
									System.out.println("Enter Your Answer After Each Quastion T or F");
									for (int j = 0; j < object.games.get(i).gamecontent.size(); j++) {
										System.out.println(object.games.get(i).gamecontent.get(j).question);
										String ans = sc.next();
										if (ans.equals(object.games.get(i).gamecontent.get(j).ansewr)) {
											System.out.println("correct answer");
											object.games.get(i).rateCount++;
										} else {
											System.out.println("wrong answer");
										}

									}
									System.out
											.println("rate the game from 1 to 5 , 1 for the worst and 5 for the best");
									int q = sc.nextInt();
									object.games.get(i).rateCount = q;
									object.games.get(i).rateSum += q;
									System.out.println("if you want to comment press 1 , else press 2");
									q = sc.nextInt();
									if (q == 1) {
										System.out.println("Enter Your Comment");
										String st = sc.nextLine();
										object.games.get(i).comments.add(st);
									}
									System.out.println("you are solve " + object.games.get(i).rateCount
											+ " problems and didnt solve " + (5 - object.games.get(i).rateCount)
											+ " problems");
								}

							}

						} else if (y == 3) {
							for (int i = 0; i < object.games.size(); i++) {
								if (object.games.get(i).category.equals("programming")) {
									System.out.println(object.games.get(i).name);
								}

							}
							System.out.println("Enter The Name of The Game You want to play");
							String p = sc.next();
							for (int i = 0; i < object.games.size(); i++) {
								if (object.games.get(i).category.equals("programming")
										&& object.games.get(i).name.equals(p)) {
									System.out.println("Enter Your Answer After Each Quastion T or F");
									for (int j = 0; j < object.games.get(i).gamecontent.size(); j++) {
										System.out.println(object.games.get(i).gamecontent.get(j).question);
										String ans = sc.next();
										if (ans.equals(object.games.get(i).gamecontent.get(j).ansewr)) {
											System.out.println("correct answer");
											object.games.get(i).rateCount++;
										} else {
											System.out.println("wrong answer");
										}

									}

									System.out
											.println("rate the game from 1 to 5 , 1 for the worst and 5 for the best");
									int q = sc.nextInt();
									object.games.get(i).rateCount = q;
									object.games.get(i).rateSum += q;
									System.out.println("if you want to comment press 1 , else press 2");
									q = sc.nextInt();
									if (q == 1) {
										System.out.println("Enter Your Comment");
										String st = sc.nextLine();
										object.games.get(i).comments.add(st);
									}
									System.out.println("you are solve " + object.games.get(i).rateCount
											+ " problems and didnt solve " + (5 - object.games.get(i).rateCount)
											+ " problems");
								}

							}
						}
					}
				} else {
					String Email = "", pass = "";
					boolean b = true;
					System.out.println("Enter your Email");
					Email = sc.next();
					System.out.println("Enter your password");
					pass = sc.next();
					b = s3.check(Email, pass);
					if (!b)
						System.out.println("invalid Email");
					else {
						System.out.println("to add game press 1");
						System.out.println("to play game press 2");
						int chose = sc.nextInt();

						if (chose == 1) {
							Game gameobj = new Game();
							// gameobj.category="a7a";
							// gameobj.level=5;
							// gameobj.name="fuck";
							// gameobj.rateCount=15;
							// gameobj.rateSum=99;
							// Questions tmpQ=new Questions("hussam", "FT");
							// gameobj.gamecontent.add(tmpQ);

							// String f=sc.next();
							String c;
							c = sc.nextLine();
							System.out.println("Enter name of category of the game math , programming , science ");
							gameobj.category = sc.next();
							// f=sc.next();
							c = sc.nextLine();
							System.out.println("Enter Game Name ");
							gameobj.name = sc.nextLine();
							// f=sc.next();
							// c=sc.nextLine();
							System.out.println("Enter Level of Game ");
							gameobj.level = sc.nextInt();
							c = sc.nextLine();
							System.out.println("add 5 True or False Questions and their answer ");

							for (int Qcoun = 0; Qcoun < 5; Qcoun++)

							{
								// f=sc.next();
								if (Qcoun != 0)
									c = sc.nextLine();
								System.out.println("Type your Question");
								String tq = sc.nextLine();
								System.out.println("Type T for True or F for false ");
								String ta = sc.next();

								Questions tmpQ = new Questions(tq, ta);
								gameobj.gamecontent.add(tmpQ);

							}

							Appgames.games.add(gameobj);

							Appgames.save();
						} else {
							System.out.println("Enter The Name of The Game You want to play");
							String p = sc.next();
							GameDB object = new GameDB();
							object.load();
							for (int i = 0; i < object.games.size(); i++) {
								if (object.games.get(i).category.equals("math") && object.games.get(i).name.equals(p)) {
									System.out.println("Enter Your Answer After Each Quastion T or F");
									for (int j = 0; j < object.games.get(i).gamecontent.size(); j++) {
										System.out.println(object.games.get(i).gamecontent.get(j).question);
										String ans = sc.next();
										if (ans.equals(object.games.get(i).gamecontent.get(j).ansewr)) {
											System.out.println("correct answer");
											// object.games.get(i).rateCount++;
										} else {
											System.out.println("wrong answer");
										}

									}
									System.out
											.println("rate the game from 1 to 5 , 1 for the worst and 5 for the best");
									int q = sc.nextInt();
									object.games.get(i).rateCount = q;
									object.games.get(i).rateSum += q;
									System.out.println("if you want to comment press 1 , else press 2");
									q = sc.nextInt();
									if (q == 1) {
										System.out.println("Enter Your Comment");
										String st = sc.nextLine();
										object.games.get(i).comments.add(st);
									}
									System.out.println("you are solve " + object.games.get(i).rateCount
											+ " problems and didnt solve " + (5 - object.games.get(i).rateCount)
											+ " problems");

								}

							}
						}
						/*
						 * else if(chose==2) {
						 * 
						 * }
						 */
					}
				}

			} else if (x == 2) {

				String tem;
				int n;
				System.out.println("to register as student press 1");
				System.out.println("to register as teacher press 2");
				n = sc.nextInt();
				if (n == 1) {
					System.out.println("Enter Student Name");
					tem = sc.next();
					s.setName(tem);
					System.out.println("Enter Stuent phone");
					tem = sc.next();
					s.setPhone(tem);
					System.out.println("Enter Stuent gener");
					tem = sc.next();
					s.setGender(tem);
					System.out.println("Enter Student mail");
					tem = sc.next();
					s.setMail(tem);
					System.out.println("Enter Student Age");
					n = sc.nextInt();
					s.setAge(n);
					System.out.println("Enter Student Password");
					tem = sc.next();
					s.setPassword(tem);
					s.setScore(0);
					s1.addStudent(s);
				} else {
					Teacher ss = new Teacher();
					TeacherControl ojec = new TeacherControl();
					System.out.println("Enter teacher Name");
					tem = sc.next();
					ss.setName(tem);
					System.out.println("Enter teacher phone");
					tem = sc.next();
					ss.setPhone(tem);
					System.out.println("Enter teacher gener");
					tem = sc.next();
					ss.setGender(tem);
					System.out.println("Enter teacher academicMail");
					tem = sc.next();
					ss.setAcademicMail(tem);
					System.out.println("Enter teacher Age");
					n = sc.nextInt();
					ss.setAge(n);
					System.out.println("Enter teacher Password");
					tem = sc.next();
					ss.setPassword(tem);
					ojec.addTeacher(ss);

				}
			} else {
				work = false;
			}
		}
	}

}
