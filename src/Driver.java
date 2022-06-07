
public class Driver {
	public static void main(String[]args) {
		
		//Human player
		System.out.println(new GreedGame(true).evaluatePlayer(new HumanGreedPlayer()));

//		//Our strat
//		double score = 0;
//		for (int i = 0; i < 100000; i++) {
//			score += new GreedGame(false).evaluatePlayer(new ComputerGreedStrategyPlayer(new BrownJacksonKocogluSiddiquiGreedStrategy()),1);
//		}
//		score /= 100000.0;
//		System.out.println("Score: " + score);
	}
}
