package groupFiles;

public interface Chatbot {

	public void talk();
	
//	allows intelligent response to begin immediately upon triggering a bot
	public void talk(String userTyped);
	
	public boolean isTriggered(String userInput);

	public void talk(int count);
	
}
