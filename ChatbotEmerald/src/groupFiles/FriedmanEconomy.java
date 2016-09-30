package groupFiles;

public class FriedmanEconomy implements Chatbot{

	private int numTimesAsked = 0;
	
	private String userResponse;
	
	private String firstPrompt = "penis";
	
	private String[] strategyQuestions = {"We got any questions?",
			"Any questions?"};
	
	private String[] strategyResponses = {"We're gonna deal with it, and it's gonna be great.",
			"I shouldn't even have to tell you, it's so much better than Crooked Hillary's"};
	

	public void talk() {
		
		if (numTimesAsked < 1){
			userResponse = FriedmanMain.promptInput(firstPrompt);
		}
		else {
			userResponse = FriedmanMain.promptInput(FriedmanMain.chooseFromStringArray(strategyResponses));
		}
		
		numTimesAsked++;
		
	}

	public boolean isTriggered(String userInput) {
//		String[] triggers = {"school", "class", "teacher"};
//		for(int i = 0; ){}
		
		if(FriedmanMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		return false;
	}

}
