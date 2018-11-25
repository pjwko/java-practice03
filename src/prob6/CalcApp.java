package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			
			System.out.print(">>");
			String expression = scanner.nextLine();
			if( "quit".equals( expression ) == true ) {
				break;
			}
			
			String[] tokens = expression.split(" ");
			String operator = tokens[1];
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);

			switch( operator ) {
				case "+" : {
					break;
				}
				case "-" : {
					break;
				}
				case "*" : {
					break;
				}
				case "/" :{
					break;
				}
				default : {
					break;
				}
			}
		}
		
		scanner.close();
	}
}
