public class BrownJacksonKocogluSiddiquiGreedStrategy extends GreedStrategy {
	public String playerName() {
		return "";
	}
	
	public String author() {
		return "Brown, Jackson, Kocoglu, Siddiqui";
	}
	
	public int choose(GreedOption[] options, int[] dice, int bank) {
		for (int i = 1; i < options.length; i++) {
			if (options[i].optionType() == GreedOption.SCORE) {
				if (((ScoringCombination) options[i]).getValue() != 50) {
					return 1;
				}
			}
		}
		if (dice.length <= 3) {
			return 2;
		}
		return 1;
	}
}
