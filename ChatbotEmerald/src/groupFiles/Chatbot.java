package groupFiles;

public interface Chatbot {

	public void talk();
	
	public void talk(String userTyped);
	
	public boolean isTriggered(String userInput);
	
}
