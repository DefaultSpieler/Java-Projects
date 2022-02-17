import java.util.Arrays;
import java.util.Scanner;


class Test{
	// Public variables declared
		public static Scanner scan = new Scanner(System.in);
		public static char[] filledArray = {'1', '2', '3', '4', '5', '6', '7', '8' , '9'};
		public static char[] emptyArray = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		public static char win = ' ';
		public static int xCountChk;
		public static int countChk;
		public static int oCountChk;
		public static int XPlayer;
		public static int YPlayer;
		public static int toBreak;
		
		
		
		//takeInput--------------------------------------------------------------------------------------------------------------

		
		public static void takeInputX(Scanner scan) {
			System.out.println("Enter your Choice");
			System.out.println(Arrays.toString(filledArray));
			XPlayer = scan.nextInt();
			if(XPlayer >= 10) {
				System.out.println("Invalid Input");
				System.out.println("Are your glasses on?");
				System.out.println("\n");
			}
			System.out.println(XPlayer);
			
				emptyArray[XPlayer - 1] = 'X';
				System.out.println("Empty Array " + Arrays.toString(emptyArray));
				
				filledArray[XPlayer - 1] = ' ';
				System.out.println("Filled Array " + Arrays.toString(filledArray));
		}
		
		public static void takeInputY(Scanner scan) {
			System.out.println("Enter your Choice");
			System.out.println(Arrays.toString(filledArray));
			YPlayer = scan.nextInt();
			if(YPlayer >= 10) {
				System.out.println("Invalid Input");
				System.out.println("Are your glasses on?");
				System.out.println("\n");
			}
				emptyArray[YPlayer - 1] = 'O';
				System.out.println("Empty Array " + Arrays.toString(emptyArray));
				
				filledArray[YPlayer - 1] = ' ';
				System.out.println("Filled Array " + Arrays.toString(filledArray));
		}
		
		// toChkChance ----------------------------------------------------------------------------------------------------------

		public static void toChkChance() {
			
			// for Count Check
			for(int i = 0; i <= 8; i++) {
				if(emptyArray[i] <= '1') {
					countChk = countChk + 1;
				}else if(emptyArray[i] == 'X') {
					xCountChk = xCountChk + 1;
				}else if(emptyArray[i] == 'O') {
					oCountChk = oCountChk + 1;
					}
				}
			}
		
		// To check winner-------------------------------------------------------------------------------------------------------

		public static void toChkWinner() {

			// for sleeping 
			if(emptyArray[0] == 'X' && emptyArray[1] == 'X' && emptyArray[2] == 'X' || emptyArray[0] == 'O' && emptyArray[1] == 'O' && emptyArray[2] == 'O' ) {
				if(emptyArray[0] == 'X') {
					win = 'X';
					toDecWinner();
				}
				else {
					win = 'O';
					toDecWinner();
				}
				}
					
			if(emptyArray[3] == 'X' && emptyArray[4] == 'X' && emptyArray[5] == 'X' || emptyArray[3] == 'O' && emptyArray[4] == 'O' && emptyArray[5] == 'O' ) {
				if(emptyArray[3] == 'X') {
					win = 'X';
					toDecWinner();
					}else {
						win = 'O';
						toDecWinner();
						}
				}
					
			if(emptyArray[6] == 'X' && emptyArray[7] == 'X' && emptyArray[8] == 'X' || emptyArray[6] == 'O' && emptyArray[7] == 'O' && emptyArray[8] == 'O' ) {
				if(emptyArray[6] == 'X') {
					win = 'X';
					toDecWinner();
					}else {
						win = 'O';
						toDecWinner();
						}
				}
					
		// for standing
					
			if(emptyArray[0] == 'X' && emptyArray[3] == 'X' && emptyArray[6] == 'X' || emptyArray[0] == 'O' && emptyArray[3] == 'O' && emptyArray[6] == 'O' ) {
				if(emptyArray[0] == 'X') {
					win = 'X';
					toDecWinner();
					}else {
						win = 'O';
						toDecWinner();
						}
				}
			
			if(emptyArray[1] == 'X' && emptyArray[4] == 'X' && emptyArray[7] == 'X' || emptyArray[1] == 'O' && emptyArray[4] == 'O' && emptyArray[7] == 'O' ) {
				if(emptyArray[1] == 'X') {
					win = 'X';
					toDecWinner();
					}else {
						win = 'O';
						toDecWinner();
						}
				}
			
			if(emptyArray[2] == 'X' && emptyArray[5] == 'X' && emptyArray[8] == 'X' || emptyArray[2] == 'O' && emptyArray[5] == 'O' && emptyArray[8] == 'O' ) {
				if(emptyArray[2] == 'X') {
					win = 'X';
					toDecWinner();
					}else {
						win = 'O';
						toDecWinner();
						}
				}
					
			// for cross
			if(emptyArray[0] == 'X' && emptyArray[4] == 'X' && emptyArray[8] == 'X' || emptyArray[0] == 'O' && emptyArray[4] == 'O' && emptyArray[8] == 'O' ) {
				if(emptyArray[0] == 'X') {
					win = 'X';
					toDecWinner();
					}else {
						win = 'O';
						toDecWinner();
						}
				}
			if(emptyArray[2] == 'X' && emptyArray[4] == 'X' && emptyArray[6] == 'X' || emptyArray[2] == 'O' && emptyArray[4] == 'O' && emptyArray[6] == 'O' ) {
				if(emptyArray[2] == 'X') {
					win = 'X';
					toDecWinner();
					}else {
						win = 'O';
						toDecWinner();
						}
				}
			}
		
		// To declare winner-----------------------------------------------------------------------------------------------------
		public static void toDecWinner() {
			if(win == 'X') {
				System.out.println("Game Over");
				System.out.println("Player " + win + " wins!!");
				toBreak = 1;
				
				
			}else if(win == 'O'){
				System.out.println("Game Over");
				System.out.println("Player " + win + " wins!!");
				toBreak = 1;
				
			}
		}
		
		//Main method-------------------------------------------------------------------------------------------------------------
		public static void main(String args[]) {
			
			for(;;) {
				toChkChance();
				if(countChk == 0) {
					System.out.println("Draw");
					break;
				}
				
				
				else if(countChk == 9) {
					System.out.println("Player 1 - X");
					takeInputX(scan);
					oCountChk = 0;
					xCountChk = 0;
					countChk = 0;
					toChkWinner();
					if(toBreak == 1) {
						break;
					}
				}
				
				
				else if(oCountChk == xCountChk) {
					System.out.println("Player 1 - X");
					takeInputX(scan);
					oCountChk = 0;
					xCountChk = 0;
					countChk = 0;
					toChkWinner();
					if(toBreak == 1) {
						break;
					}
				}
				
				
				else if(oCountChk < xCountChk) {
					System.out.println("Player 2 - O");
					takeInputY(scan);
					oCountChk = 0;
					xCountChk = 0;
					countChk = 0;
					toChkWinner();
					if(toBreak == 1) {
						break;
					}
				}
				
				toChkWinner();
				
			}
			
		}
}