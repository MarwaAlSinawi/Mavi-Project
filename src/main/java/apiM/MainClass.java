package apiM;

import java.io.IOException;
import java.util.Scanner;


public class MainClass {
	static void MainMenue() {
		System.out.println("***************************");
		System.out.println("Welcome...Select one of the options:");
		System.out.println("1.Read Rows ");
		System.out.println("2.Update the Rows in table");
		System.out.println("3.Delete");
		
		
	}
	public static void main(String[] args)throws IOException, InterruptedException{

		Scanner sc = new Scanner (System.in);
		MainMenue();
		
		do {
			

			int studentMenue = sc.nextInt();


			switch (studentMenue) {
			case 1:
				readingApi read =new readingApi();
				read.ReadRows();
				
				
				MainMenue();
				
				break;
			case 2 :
				 
				UpdateApi.Update();
				
			
				MainMenue();
				break;

			case 3:
	
				deletingApi.Delete();
				MainMenue();
				break;

			
			
			
			}

		} while (true);

}




	}

