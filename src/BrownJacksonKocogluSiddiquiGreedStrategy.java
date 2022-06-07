public class BrownJacksonKocogluSiddiquiGreedStrategy extends GreedStrategy {
	public String playerName() {
		return "Ian, Connor, Jasir, Aybars' Strat";
	}
	
	public String author() {
		return "Brown, Jackson, Kocoglu, Siddiqui";
	}

	public int choose(GreedOption[] options, int[] dice, int bank) {
		int bonusTurns = 0;
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
		//gets about 404 points
//		if(bank >= 4000) {
//			return options.length - 1; //end turn
//		}
		
		if(dice.length == 0) {
				bonusTurns++;
				return options.length - 2; //roll again
		}
		if (options[0].optionType() == GreedOption.SCORE) {
			if (((ScoringCombination) options[0]).getValue() > 50 || dice.length <= 3) { //if highest scoring option more than 50
				return 0; //bank scoring combination
			}
		}
		if (dice.length <= 3) {
			return options.length - 1; //end turn
		}
		return options.length - 2; //roll again
	}
}
