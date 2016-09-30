package groupFiles;

public class FriedmanEconomy implements Chatbot{

	private String userResponse;
	private String[] strategyResponses = {"We're gonna deal with it, and it's gonna be great.",
			"I shouldn't even have to tell you, it's so much better than Crooked Hillary's"};
	

	public void talk() {
		
			userResponse = FriedmanMain.promptInput("Type something, fucker.");
			FriedmanMain.printwrap(chooseFromStringArray(strategyResponses));
		
	}

	private String chooseFromStringArray(String[] stringArray) {
		int responseSelection = (int)(Math.random()*stringArray.length);
		return stringArray[responseSelection];
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
