package groupFiles;

public class SimonOffTopic implements Chatbot {

	private boolean inOffTopicLoop;
	private String offTopicResponse;
	
	private String[] offTopicResponses = {
			"We already said hello. "
			+ "Let's move the conversation along.", "You said hello already, did you forget?"};
	public void talk() {
		inOffTopicLoop = true;
		while(inOffTopicLoop){
			FriedmanMain.println("(Type 'quit' to go back.)");
			offTopicResponse = FriedmanMain.promptInput("");
			if(offTopicResponse.indexOf("quit") >= 0){
				inOffTopicLoop = false;
				FriedmanMain.promptInputForever("");
			}
			FriedmanMain.println("That's my favorite part about school!");
		}
		
	}

	public boolean isTriggered(String userInput) {
//		String[] triggers = {"school", "class", "teacher"};
//		for(int i = 0; ){}
		
		if(FriedmanMain.findKeyword(userInput, "how", 0) >= 0){
			return true;
		}
		return false;
	}

}