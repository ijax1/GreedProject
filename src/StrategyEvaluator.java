
public class StrategyEvaluator {

	public static int evaluateStrategy(GreedStrategy theStrategy, int turns){
		ComputerGreedStrategyPlayer player 
		= new ComputerGreedStrategyPlayer(theStrategy);
		int score
		= (new GreedGame(false)).evaluatePlayer(player, turns);
		return score;
	}
	
	public static double practiceGreed(){
		return (new GreedGame(false))
				.evaluatePlayer(new ComputerGreedStrategyPlayer(
						new BrownJacksonKocogluSiddiquiGreedStrategy()),100000);
	}
	
	public static void main(String[] args) {
		System.out.println(practiceGreed());
	}

}
