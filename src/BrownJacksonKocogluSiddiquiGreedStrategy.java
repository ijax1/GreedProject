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
					return GreedOption.ROLLAGAIN;
				}
			}
		}
		if (dice.length <= 3) {
			return GreedOption.SCORE;
		}
		return GreedOption.ENDTURN;
	}
}
