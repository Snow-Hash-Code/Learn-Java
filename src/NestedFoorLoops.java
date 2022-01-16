
public class NestedFoorLoops {

	public static void main(String[] args) {
		String fancyColors[][] = {{"red ","blue", "green"},
								 {"cyan","magenta", "turqouise"}
		};
		
		System.out.println(fancyColors.length);
		
		for(int i = 0; i < fancyColors.length; i++) {
			for(int j = 0; j <= fancyColors.length; j++) {
				System.out.print(fancyColors[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
