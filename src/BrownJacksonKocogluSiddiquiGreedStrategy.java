public class BrownJacksonKocogluSiddiquiGreedStrategy extends GreedStrategy {
	public String playerName() {
		return "";
	}
	
	public String author() {
		return "Brown, Jackson, Kocoglu, Siddiqui";
	}
	
	public int choose(GreedOption[] options, int[] dice, int bank) {
		//gets about 361 points
		/*
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
		*/
		//gets about 400 points
		if (options[0].optionType() == GreedOption.SCORE) {
			if (((ScoringCombination) options[0]).getValue() > 50 || dice.length <= 3) {
				return 0; //bank scoring combination
			}
		}
		if (dice.length <= 2 && dice.length != 0) {
			return 1;
		}
		return options.length - 2;
	}
}
