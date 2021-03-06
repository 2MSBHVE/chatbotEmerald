package groupFiles;

//push test

public class MaxEconomy implements Chatbot{

	private int numTimesAsked = 0;
	
	private String userResponse;
	
	private String[] strategyResponses = {
			"We're gonna bring back jobs, and it's gonna be great.",
			"America is going to manufacture again!",
			"It's all gonna start with the wall. We're gonna employ lots and lots of people to build that wall."
			+ "Respectable jobs with good pay. And speaking of pay, who's gonna pay for it?! MEXICO!",
			"I'm gonna bring jobs BACK TO AMERICA, unlike Crooked Hillary and her Wall Street friends.",
			"Well we wouldn't have been hit so hard by 7/11 if OBAMA wasn't one of them!"
			};
	
	
	
//	counts the number of times each specific response is printed
	int jobsCount = 0;
	int wagesCount0 = 0;
	int manufacturingCount0 = 0;
	

	public void talk() {
//		
//		if (numTimesAsked < 1){
//			userResponse = MaxMain.promptInput(firstPrompt);
//		}
////		else if (MaxMain.findKeyword(userResponse, "Mexico", 0) >= 0){
////			
////		}
//		else {
//			userResponse = MaxMain.promptInput(MaxMain.chooseFromStringArray(strategyResponses));
//		}
//		
//		numTimesAsked++;
//		
	}

	public boolean isTriggered(String userInput) {
//		String[] triggers = {"Economy", "Mexico", "jobs"};
//		for(int i = 0; ){}
		
		if (MaxMain.findKeyword(userInput, "economy", 0) >= 0
				|| MaxMain.findKeyword(userInput, "economic", 0) >= 0){
			return true;
		}
//		if (MaxMain.findKeyword(userInput, "Mexico", 0) >= 0){
//			return true;
//		}
//		if (MaxMain.findKeyword(userInput, "China", 0) >= 0){
//			return true;
//		}
		if (MaxMain.findKeyword(userInput, "jobs", 0) >= 0){
			return true;
		}
		if (MaxMain.findKeyword(userInput, "manufacturing", 0) >= 0 
				|| MaxMain.findKeyword(userInput, "manufacture", 0) >= 0
				|| MaxMain.findKeyword(userInput, "manufacturer", 0) >= 0
				|| MaxMain.findKeyword(userInput, "manufacturers", 0) >= 0
				|| MaxMain.findKeyword(userInput, "manufactures", 0) >= 0
				|| MaxMain.findKeyword(userInput, "manufactured", 0) >= 0){
			return true;
		}
		if (MaxMain.findKeyword(userInput, "poverty", 0) >= 0){
			return true;
		}
		if ((MaxMain.findKeyword(userInput, "wage", 0) >= 0 || MaxMain.findKeyword(userInput, "wages", 0) >= 0)
				&& (MaxMain.findKeyword(userInput, "war", 0) < 0 && MaxMain.findKeyword(userInput, "wars", 0) < 0)) {
			return true;
		}
		return false;
	}

	
	public void talk(String userTyped) {
		
		String[] jobsResponses = {
				"We're gonna bring back jobs, and it's gonna be great.",
				"It's all gonna start with the wall. We're gonna employ lots and lots of people to build that wall. "
				+ "Respectable jobs with good pay. And speaking of pay, who's gonna pay for it? That's right; Mexico.",
				"I'm gonna bring jobs BACK TO AMERICA, unlike Crooked Hillary and her Wall Street friends.",
				"We're gonna bring back jobs. I'm gonna make deals - great, great deals - with China that work in our favor, "
				+ "not theirs. There's gonna be so much winning, I guarantee it.",
				"I will be the greatest jobs president that God ever created. I tell you that.",
				"I'll bring back our jobs from China, from Mexico, from Japan, from so many places."
				+ "I'll bring back our jobs, and I'll bring back our money."
				};
		String[] wageResponses = {
				(String)("There are" + MaxMain.multiplyWord("way", wagesCount0, true, false) 
				+ " too many people in America that aren't making enough money to live on."),
				"The jobs created by the wall will pay, and they'll pay well, and they'll be paid by Mexico.",
				"If you're making minimum wage you're probably an immigrant anyway. I love immigrants. Love em.",
				};
		String[] manufacturingResponses = {
				(String)("America is going to manufacture" + MaxMain.multiplyWord("bigly", manufacturingCount0, true, false) + " again!"),
				"First we're gonna get rid of all those Japanese cars. Then we're gonna get rid of Japan.",
				"Sometimes I go past those abandoned factories. It's a disaster.",
				"Hillary had thirty years to end NAFTA. I will. She called the TPP the gold standard of trade deals. I don't."
				};
		
		userTyped = userTyped.toLowerCase();
		if (MaxMain.findKeyword(userTyped, "jobs", 0) >= 0){
			MaxMain.printwrap(MaxMain.chooseFromStringArray(jobsResponses));
		}
		else if (MaxMain.findKeyword(userTyped, "wage", 0) >= 0 || MaxMain.findKeyword(userTyped, "wages", 0) >= 0){
			String toPrint = MaxMain.chooseFromStringArray(wageResponses);
			if(toPrint.equals(wageResponses[0])) {
				wagesCount0++;
			}
			MaxMain.printwrap(toPrint);
		}
		else if (MaxMain.findKeyword(userTyped, "manufacturing", 0) >= 0 
				|| MaxMain.findKeyword(userTyped, "manufacture", 0) >= 0
				|| MaxMain.findKeyword(userTyped, "manufacturer", 0) >= 0
				|| MaxMain.findKeyword(userTyped, "manufacturers", 0) >= 0
				|| MaxMain.findKeyword(userTyped, "manufactures", 0) >= 0
				|| MaxMain.findKeyword(userTyped, "manufactured", 0) >= 0) {
			String toPrint = MaxMain.chooseFromStringArray(manufacturingResponses);
			if(toPrint.equals(manufacturingResponses[0])) {
				manufacturingCount0++;
			}
			MaxMain.printwrap(toPrint);
			
		}
		
		else {
			
			MaxMain.printwrap("The economy is failing. We need to improve the economy.");
		}
	}

	@Override
	public void talk(int count) {
		// TODO Auto-generated method stub
		return;
	}
 
}
