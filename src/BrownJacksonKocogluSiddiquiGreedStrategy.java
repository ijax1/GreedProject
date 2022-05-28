public class BrownJacksonKocogluSiddiquiGreedStrategy extends GreedStrategy {
	public String playerName() {
		return "";
	}
	
	public String author() {
		return "Brown, Jackson, Kocoglu, Siddiqui";
	}
	
	public int choose(GreedOption[] options, int[] dice, int bank) {
		return 1;
	}
}
