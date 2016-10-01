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
//		
//		if (numTimesAsked < 1){
//			userResponse = FriedmanMain.promptInput(firstPrompt);
//		}
////		else if (FriedmanMain.findKeyword(userResponse, "Mexico", 0) >= 0){
////			
////		}
//		else {
//			userResponse = FriedmanMain.promptInput(FriedmanMain.chooseFromStringArray(strategyResponses));
//		}
//		
//		numTimesAsked++;
//		
	}

	public boolean isTriggered(String userInput) {
//		String[] triggers = {"Economy", "Mexico", "jobs"};
//		for(int i = 0; ){}
		
		if(FriedmanMain.findKeyword(userInput, "economy", 0) >= 0){
			return true;
		}
		if(FriedmanMain.findKeyword(userInput, "Mexico", 0) >= 0){
			return true;
		}
		if(FriedmanMain.findKeyword(userInput, "China", 0) >= 0){
			return true;
		}
		if(FriedmanMain.findKeyword(userInput, "jobs", 0) >= 0){
			return true;
		}
		if(FriedmanMain.findKeyword(userInput, "manufacturing", 0) >= 0){
			return true;
		}
		if(FriedmanMain.findKeyword(userInput, "poverty", 0) >= 0){
			return true;
		}
		if(FriedmanMain.findKeyword(userInput, "wage", 0) >= 0 && (FriedmanMain.findKeyword(userInput, "war", 0) < 0 && FriedmanMain.findKeyword(userInput, "wars", 0) < 0)){
			return true;
		}
		return false;
	}

	
	public void talk(String userTyped) {
		userTyped = userTyped.toLowerCase();
		if (FriedmanMain.findKeyword(userTyped, "Mexico", 0) >= 0){
			FriedmanMain.printwrap("It's all gonna start with the wall. We're gonna employ lots and lots of people to build that wall."
					+ "Respectable jobs with good pay. And speaking of pay, who's gonna pay for it?! MEXICO!");
		}
		
		else if (FriedmanMain.findKeyword(userTyped, "jobs", 0) >= 0){
			FriedmanMain.printwrap("We're gonna bring back jobs. I'm gonna make deals - great, great deals - with China that work in our favor, not theirs. "
					+ "There's gonna be so much winning, I guarantee it.");
		}
		
		else {
			FriedmanMain.printwrap("The economy is failing. We need to improve the economy.");
		}
	}
 
}
