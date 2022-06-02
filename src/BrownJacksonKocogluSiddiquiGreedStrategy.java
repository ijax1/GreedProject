public class BrownJacksonKocogluSiddiquiGreedStrategy extends GreedStrategy {
	public String playerName() {
		return "";
	}
	
	public String author() {
		return "Brown, Jackson, Kocoglu, Siddiqui";
	}
	
	public int choose(GreedOption[] options, int[] dice, int bank) {
		/*
		for (int i = 1; i < options.length; i++) {
			if (options[i].optionType() == GreedOption.SCORE) {
				if (((ScoringCombination) options[i]).getValue() != 50) {
					return 1; //bank scoring combination
				}
			}
		}
		if (dice.length <= 3) {
			return 2; //end turn
		}
		
		return 0; //end turn
		*/
		for (int i = 0; i < options.length; i++) {
			if (options[i].optionType() == GreedOption.SCORE) {
				if (((ScoringCombination) options[i]).getValue() != 50 || dice.length <= 3) {
					return 0; //bank scoring combination
				}
			}
		}
		if (dice.length <= 2) {
			return 1; //end turn
		}
		return 0; //roll again
	}
}
