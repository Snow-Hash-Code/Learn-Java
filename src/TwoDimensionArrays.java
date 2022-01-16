
public class TwoDimensionArrays {

	public static void main(String[] args) {
		int lotteryCard[][] = {{20, 15, 7}, 
							   {8, 10, 19},
							   {7, 13, 47}
		};
		
		for(int i = 0; i < lotteryCard.length; i++) {
			for(int j = 0; j < lotteryCard.length; j++) {
				System.out.print(lotteryCard[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		int lotteryCard2[][] = new int[3][3];
		lotteryCard2[0][0] = 20;
		lotteryCard2[0][1] = 15;
		lotteryCard2[0][2] = 7;
		lotteryCard2[1][0] = 8;
		lotteryCard2[1][1] = 10;
		lotteryCard2[1][2] = 19;
		lotteryCard2[2][0] = 7;
		lotteryCard2[2][1] = 13;
		lotteryCard2[2][2] = 47;
		//[row][column] [fila][columna]
		
//		for(int i = 0; i < lotteryCard2.length; i++) {
//			for(int j = 0; j < lotteryCard2.length; j++) {
//				System.out.print("[" + i + "]" + "[" + j + "]: " + lotteryCard2[i][j]);
//			}
//		}
		
		for(int i = 0; i < lotteryCard2.length; i++) {
			for(int j = 0; j < lotteryCard2.length; j++) {
				System.out.print(lotteryCard2[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		String fancyColors[][] = {{"red ","blue", "green"},
				 {"cyan","magenta", "turqouise"}
		};
		
		for(int i = 0; i < fancyColors.length; i++) {
			for(int j = 0; j <= fancyColors.length; j ++) {
				System.out.print(fancyColors[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
