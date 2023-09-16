import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[][] board=new char[3][3];
for(int row=0;row<board.length;row++) {
	for(int col=0;col<board[row].length;col++) {
		board[row][col]=' ';
	}
}

char player='X';
boolean gameOver=false;

Scanner sc=new Scanner(System.in);
while(!gameOver) {
	printBoard(board);
	System.out.println("player " + player +"enter :");
	int row=sc.nextInt();
	int col=sc.nextInt();
	
	if(board[row][col]==' ')
	{
		board[row][col]=player;
		gameOver=haveWon(board,player);
		if(gameOver) {
			System.out.println("PLAYER"+ player + "WON");
		}
		else {
//			if(player=='X') {
//				player='0';
//			}else {
//				player='X';
//			} 
			player=(player=='X') ? '0' : 'X';
		}
	}
	else {
		System.out.println("Invalid Move");
	}
	printBoard(board);
}
	}
	
	public static void printBoard(char[][] board) {
		for(int row=0;row<board.length;row++) {
			System.out.println("------");
			for(int col=0;col<board[row].length;col++) {
			
				System.out.print("|"+board[row][col]);
				
			}
			System.out.println();
			
		}
		System.out.println("------");
	}
	public static boolean haveWon(char[][] board,char player) {
//		check the rows
		for(int row=0;row<board.length;row++) {
		if(board[row][0]==player && board[row][1]==player && board[row][2]==player) {
			return true;
		}
			}
//		check the col
		for(int col=0;col<board.length;col++) {
			if(board[0][col]==player && board[1][col]==player && board[2][col]==player) {
				return true;
			}
		}
				
//				check diag
					if(board[0][0]==player && board[1][1]==player && board[2][2]==player )
						return true;
					
					if(board[0][2]==player && board[1][1]==player && board[2][0]==player )
						return true;
		return false;			
	}
}

	

