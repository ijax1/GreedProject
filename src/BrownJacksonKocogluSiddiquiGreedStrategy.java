public class BrownJacksonKocogluSiddiquiGreedStrategy extends GreedStrategy {
	public String playerName() {
		return "Brown, Jackson, Kocoglu, Siddiqui's Strategy";
	}
	
	public String author() {
		return "Brown, Jackson, Kocoglu, Siddiqui";
	}

	public int choose(GreedOption[] options, int[] dice, int bank) {		
		if (options[0].optionType() == GreedOption.SCORE) {
			if (((ScoringCombination) options[0]).getValue() > 50 || dice.length <= 3) { //if highest scoring option more than 50
				return 0; //bank scoring combination
			}
		}
		if (dice.length <= 3 && dice.length != 0) {
			return options.length - 1; //end turn
		}
		return options.length - 2; //roll again
	}
}
