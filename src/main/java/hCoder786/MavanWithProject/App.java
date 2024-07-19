package hCoder786.MavanWithProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Project Started.....");
		while (true) {
			System.out.println("");
			System.out.println("press 1 to Add Data >>> ");
			System.out.println("press 2 to Retrive Data >>> ");
			System.out.println("press q to Exit Application >>> ");
			String choice = bf.readLine();

			if (choice.equals("1")) {

				SessionFactory factory = new Configuration().configure().buildSessionFactory();
				System.out.println(factory);
				while (true) {
					System.out.println("Press 1 to Add Data :");
					System.out.println("Press q to Turn Back :");
					String c = bf.readLine();
					if (c.equalsIgnoreCase("1")) {

						Student student = new Student();
						System.out.print("Enter Your Name :- ");
						student.setName(bf.readLine());
						System.out.println("Enter Your Phon No..:- ");
						student.setPhon_No(bf.readLine());
						System.out.println("Enter Your address :- ");
						student.setAddress(bf.readLine());
						

						Session session = factory.openSession();
						Transaction tx = session.beginTransaction();
						session.save(student);
						System.out.println(student);
						tx.commit();
						session.close();
						System.out.println("Done...");
						System.out.println("");
						System.out.println("Next Student >>>>> ");
						System.out.println("");
					} else if (c.equalsIgnoreCase("q")) {
						break;
					} else {
						System.out.println("Invalid Input Please Try Again");
						break;
					}
				}
			} else if (choice.equals("2")) {
				while (true) {
					System.out.println("Press 1 to Conform Reterve Data :");
					System.out.println("Press q to Turn Back : ");
					String i = bf.readLine();
					if (i.equalsIgnoreCase("1")) {

						SessionFactory factory = new Configuration().configure().buildSessionFactory();
						Session session = factory.openSession();
						System.out.println("Enter Id >>>> ");
						String id = bf.readLine();
						int foo = Integer.parseInt(id);

						Student student = session.get(Student.class, foo);
						System.out.println(student.getName() + ":" + student.getPhon_No());

						session.close();
						factory.close();
					} else if (i.equalsIgnoreCase("q")) {
						System.out.println("Turn Back >>>>");
						break;

					} else {
						System.out.println("Invalid Input Please Try Again");
						break;
					}
				}

			} else if (choice.equalsIgnoreCase("q")) {
				System.out.println("Thank You For Open Application >>>>>");
				break;

			} else {
				System.out.println("Invalid Input Please Try Again Later >>>");
				System.out.println("");
				break;
			}
		}
	}
}
