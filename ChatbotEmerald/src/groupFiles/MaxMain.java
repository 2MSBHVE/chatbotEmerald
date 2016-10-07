package groupFiles;

import java.util.Scanner;

public class MaxMain {
	
	static String user;
	static Scanner input;
	static boolean inMainLoop;
	static String response;
	
	
	
	
//	add group chatbots below
	static Chatbot economy;
	static Chatbot comeback;
	static Chatbot offTopic;
	static Chatbot hillary; 
	static Chatbot misc;
	static Chatbot flipflop;
	 
	
//	economy triggered by "economy" "jobs" "manufacture" "wage(w/o 'war')" "
//	fightback triggered by "stupid", "dumb", "dumbass", "f***", "fake", "orange", "baby"
//	offTopic triggered by "how"
	
	public static void main(String[] args) {
//		demonstrateStringMethods();
		printwrap("*DRAMATIC ENTRANCE*");
		printwrap("*CROWD CHEERS*");
		createFields();
		promptName();
//		promptInput("Please type something.");
		promptInputForever((String)("So what's your question, " + user + "?"));
//		while(true){
//			println(input.next());
//		}
	}
	
	public static void promptName() {
		user = "";
		
		while(user.compareTo("A") < 0){
			println("What's your name?");
			user = input.nextLine();
		}
		
		
		
		if (findKeyword(user, "Hillary", 0) >= 0 || (findKeyword(user, "Clinton", 0) >= 0 && findKeyword(user, "Bill", 0) < 0)) {
			user = "Crooked Hillary";
		}
		else if (findKeyword(user, "Bernie", 0) >= 0 || findKeyword(user, "Sanders", 0) >= 0) {
			user = "Crazy Bernie";
		}
		else if (findKeyword(user, "Marco", 0) >= 0 || findKeyword(user, "Rubio", 0) >= 0) {
			user = "Little Marco";
		}
		else if (findKeyword(user, "Ted", 0) >= 0 || findKeyword(user, "Cruz", 0) >= 0) {
			user = "Lyin' Ted";
		}
		else if (findKeyword(user, "Elizabeth", 0) >= 0 || findKeyword(user, "Warren", 0) >= 0) {
			user = "Goofy Elizabeth";
		}
		else if (findKeyword(user, "Barack", 0) >= 0 || (findKeyword(user, "Obama", 0) >= 0 && findKeyword(user, "Michelle", 0) < 0)) {
			user = "Baby Obama";
		}
		else if (findKeyword(user, "Machado", 0) >= 0 || (findKeyword(user, "Alicia", 0) >= 0 && findKeyword(user, "Machado", 0) < 0)) {
			user = "Miss Housekeeping";
		}
		else if (findKeyword(user, "Putin", 0) >= 0 || (findKeyword(user, "Vladimir", 0) >= 0 && findKeyword(user, "Putin", 0) >= 0)) {
			user = "Vladimir";
			
//			replaces "so we've got..."
			printwrap("Ah, Vladimir, my friend and long-time supplier of young Slavic women!");
			return;
		}
		
		printwrap("So we've got " + user + " here ready to make America great again!");
		
	}

	public static String promptInput(String prompt) {
		printwrap(prompt);
		String userInput = input.nextLine();
		return userInput;
	}

	public static void promptInputForever(String prompt) {
		inMainLoop = true;
		
		int untriggeredCount = 0;
		
		while(inMainLoop){
			
			response = promptInput(prompt);
			
//			makes sure the user types something
			while(response.equals("")){
				response = promptInput(prompt);
			}
			
			if (economy.isTriggered(response)){
				untriggeredCount = 0;
				economy.talk(response);
			}
			
			else if (comeback.isTriggered(response)){
				untriggeredCount = 0;
				comeback.talk();	
			}
			
			else if (hillary.isTriggered(response)){
				untriggeredCount = 0;
				hillary.talk(untriggeredCount);
			}
			
			else if (flipflop.isTriggered(response)){
				flipflop.talk(response);
				untriggeredCount = 0;
			}
			
			else if (misc.isTriggered(response)){
				untriggeredCount = 0;
				misc.talk(response);
			}
			
//			LEAVE OFFTOPICBOT LAST BECAUSE "HOW" IS A COMMON WORD!!!!!!!!!
			else if (offTopic.isTriggered(response)){
				untriggeredCount = 0;
				offTopic.talk();
				
			}
		
			
			else{
				untriggeredCount++;
//				println("I don't understand." + untriggeredCount);
			}
			
			prompt = MaxChangeMainPrompt.talk(untriggeredCount, user);
		}
	}
	
	public static int findKeyword(String searchString, String keyword, int startPos) {
		
		searchString = searchString.trim();//delete white space
		searchString = searchString.toLowerCase();
		
		keyword = keyword.toLowerCase();
		
//		find first position of keyword
		int pos = searchString.indexOf(keyword);
		
//		keep searching until context keyword found
		while(pos >= 0){
//			Assume preceded and followed by space
			String before = " ";
			String after = " ";
			
//			check character in front, if it exists
			if(pos > 0){
				before = searchString.substring(pos-1, pos);
//				System.out.println("The character before us is " + before);
			}
			
//			check if there is a character after the keyword
			if(pos + keyword.length() < searchString.length()){
				after = searchString.substring((pos + keyword.length()),(pos + keyword.length() + 1));
//				System.out.println("The character after us is " + after);
			}
			
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0 && noNegotiations(searchString, pos)){
//				System.out.println("Found " + keyword + " at " + pos);
				return pos;
			}
			else{
//				pos + 1 is one space after our current position, so this finds the NEXT word
				pos = searchString.indexOf(keyword, (pos + 1));
//				System.out.println("Did not find " + keyword + ", checking position " + pos);
			}
			
		}
		
		return -1;
	}

	/**
	 * This is a helper method.
	 * A helper method is a method designed for "helping" a larger method.
	 * Because of this, helper methods are generally private
	 * because they are only used by the methods they are helping.
	 * Also, Nockles expects helper methods in projects
	 * because they also make code more READABLE.
	 * @param searchString
	 * @param pos
	 * @return "true" if there is no negation words in front of position
	 */
	private static boolean noNegotiations(String searchString, int pos) {
//		check to see if the word "no " is in front of pos
//		check to see if there are three spaces in front
//		then check to see if "no " is there
		
//		this if statement works because Java checks conditions with && sequentially
		if (pos - 3 >= 0 && searchString.substring(pos - 3, pos).equals("no ")){
			return false;
		}
		if (pos - 4 >= 0 && searchString.substring(pos - 4, pos).equals("not ")) {
			return false;
		}
		if (pos - 6 >= 0 && searchString.substring(pos - 6, pos).equals("never ")) {
			return false;
		}
		if (pos - 4 >= 0 && searchString.substring(pos - 4, pos).equals("n't ")) {
			return false;
		}
		
		return true;
	}

	public static void createFields() {
		input = new Scanner(System.in);
		user = "";
		
//		initialize group chatbots below
		economy = new MaxEconomy();
		comeback = new MaxFightBack();
		offTopic = new SimonOffTopic();
		hillary = new JoyceHillary();
		flipflop = new JoyceFlipFlop();
		misc = new MaxMiscellaneous();
	}

	public static void demonstrateStringMethods(){
		String text1 = new String("Hello World!");
		String text2 = "Hello World!"; //same as above
		
		if(text1.equals(text2)){ //.equals(---) is very important
			print("true");
		}
		
		System.out.println(text1.compareTo(text2) < 0);
	}
	
	public static void println(String s){
		System.out.println(s);
	}
	public static void print(String s){
		System.out.print(s);
	}
	
	public static void printwrap(String s){
		String printString = "";
		int cutoff = 70;
//		check for words to add
//		IWO s has length > 0
		while(s.length() > 0){
			String cut = "";
			String nextWord = "";
//			check to see if the next word will fit on the line AND there must still be words to add
			while(cut.length() + nextWord.length() < cutoff && s.length() > 0){
//				add the next word to the line
				cut += nextWord;
				
				s = s.substring(nextWord.length());
				
//				identify following word without the spaces
				int endOfWord = s.indexOf(" ");
				
//				if there are no more spaces, this is the last word, so add the whole thing
				if(endOfWord == -1){
					endOfWord = s.length() - 1;//-1 for index
				}
				
				
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += cut + "\n";
		}
		System.out.println(printString);
	}
	
	@SuppressWarnings("unused")
	private static String getCut(String s, int cutoff, int cut, int startIndex){
		int cutIndex = cut * cutoff;
		if(cutIndex > s.length()){
			cutIndex = s.length();
		}
		String currentCut = s.substring(startIndex,cutIndex);
		
		int indexOfLastSpace = currentCut.length();
		for(int i = currentCut.length()-1; i >= 0; i--){
			String letter = currentCut.substring(i, i+1);
//			System.out.println(letter);
			if(letter.equals(" ")){
				indexOfLastSpace = i;
				break;
			}
		}
		
//		shorten the cut to end on a space
		currentCut = currentCut.substring(0, indexOfLastSpace);
		return currentCut;
	}

	static String chooseFromStringArray(String[] stringArray) {
		int responseSelection = (int)(Math.random()*stringArray.length);
		return stringArray[responseSelection];
	}
	
	static String[] newPrompt(){
		
		String[][] askMes = {
				{"Questions, ", "?"},
				{"So what's your question, ", "?"},
				{"Ask away, ", "."}
				};
		
		int rand = (int) (Math.random()*askMes.length);
		return askMes[rand];
		
	}
	
	static String multiplyWord(String word, int multiplier, boolean useSpaces, boolean useCommas){
		String multipliedWord = "";
		for(int i = 0; i < multiplier; i++){
			if(useSpaces) {
				multipliedWord += " ";
			}
			multipliedWord += word;
			if(useCommas) {
				multipliedWord += ",";
			}
		}
		
		return multipliedWord;
				
	}
}
