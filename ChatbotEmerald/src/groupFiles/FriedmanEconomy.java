package groupFiles;

public class FriedmanEconomy implements Chatbot{

	private int numTimesAsked = 0;
	
	private String userResponse;
	
	private String firstPrompt = "Ah, the economy. ";
	
	private String[] strategyQuestions = {"We got any questions?",
			"Any questions?"};
	
	private String[] strategyResponses = {"We're gonna bring back jobs, and it's gonna be great.",
			"America is going to manufacture again!",
			"It's all gonna start with the wall. We're gonna employ lots and lots of people to build that wall."
			+ "Respectable jobs with good pay. And speaking of pay, who's gonna pay for it?! MEXICO!",
			"I'm gonna bring jobs BACK TO AMERICA, unlike Crooked Hillary and her Wall Street friends.",
			"Well we wouldn't have been hit so hard by 7/11 if OBAMA wasn't one of them!"};
	

	public void talk() {
		
		if (numTimesAsked < 1){
			userResponse = FriedmanMain.promptInput(firstPrompt);
		}
		else if (FriedmanMain.findKeyword(userResponse, "Mexico", 0) >= 0){
			
		}
		else {
			userResponse = FriedmanMain.promptInput(FriedmanMain.chooseFromStringArray(strategyResponses));
		}
		
		numTimesAsked++;
		
	}

	public boolean isTriggered(String userInput) {
//		String[] triggers = {"school", "class", "teacher"};
//		for(int i = 0; ){}
		
		if(FriedmanMain.findKeyword(userInput, "economy", 0) >= 0){
			return true;
		}
		return false;
	}

	@Override
	public void talk(String userTyped) {
		// TODO Auto-generated method stub
		
	}

}
