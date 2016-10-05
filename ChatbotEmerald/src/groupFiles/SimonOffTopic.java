package groupFiles;

public class SimonOffTopic implements Chatbot {

	private boolean inOffTopicLoop = true;
	private String userResponse;
	private int offTopic = 0;
	private String firstPrompt = "We're gonna make America great again!  Want to know how?";
	private String[] offTopicResponses = {
			"I have the best people, the best", 
			"we're going to make the best plan you've ever seen",
			"The wall just got 10 feet higher",
			"We're going to make Mexico pay for it",
			"I know alot of words, I know the best words",
			"I cant talk about it, I'm under audit",
			"I'll ask Putin","We need to fix this rigged system",
			"We're going to do so much winning"
	};
	public void talk() {

		MaxMain.printwrap((MaxMain.chooseFromStringArray(offTopicResponses)));
		
	}

	public boolean isTriggered(String userInput) {

		if(MaxMain.findKeyword(userInput, "how", 0) >= 0){

			return true;

		}
		
		return false;
	}




	@Override
	public void talk(String userTyped) {
		// TODO Auto-generated method stub
		
	}

}