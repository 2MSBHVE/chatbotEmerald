// THIS FILE IS HERE AS KIND OF A TEMPLATE

package groupFiles;

public class FriedmanSchool implements Chatbot {

	private boolean inSchoolLoop;
	private String schoolResponse;
	

	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			FriedmanMain.println("(Type 'quit' to go back.)");
			schoolResponse = FriedmanMain.promptInput("");
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				FriedmanMain.promptInputForever("");
			}
			FriedmanMain.println("That's my favorite part about school!");
		}
		
	}

	public boolean isTriggered(String userInput) {
//		String[] triggers = {"school", "class", "teacher"};
//		for(int i = 0; ){}
		
		if(FriedmanMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		return false;
	}

	@Override
	public void talk(String userTyped) {
		// TODO Auto-generated method stub
		
	}

}
