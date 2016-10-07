package groupFiles;

public class MaxMiscellaneous implements Chatbot {

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void talk(String userTyped) {
		// TODO Auto-generated method stub

		String[] isisResponses = {
				"We have to be tough on ISIS.",
				"Bomb the sh!t out of em.",
				"Hillary Clinton created ISIS with Obama.",
				"President Obama is acting the way he acts and can't even mention the words radical Islamic terrorism."
				+ "There's something going on.",
				" Islamic terrorism is eating up large portions of the Middle East. They've become rich. I'm in competition with them. "
				+ "They just built a hotel in Syria. Can you believe this? They built a hotel."
				+ "When I have to build a hotel, I pay interest."
				+ "They don't have to pay interest, because they took the oil that, when we left Iraq, I said we should've taken."
				+ "So now ISIS has the oil, and what they don't have, Iran has."
				};
		
		String[] latinosResponses = {
				"When Mexico sends its people, they're not sending their best. They're not sending you. They're not sending you."
				+ "They're sending people that have lots of problems, and they're bringing those problems with us."
				+ "They're bringing drugs. They're bringing crime. They're rapists. And some, I assume, are good people.",
				""
				};
		
		String[] middleEastResponses = {
				"I was against the war in Iraq. Ask anyone in the world named Sean Hannity.",
				"We spent $2 trillion in Iraq, $2 trillion. We lost thousands of lives, thousands in Iraq. "
				+ "We have wounded soldiers, who I love, I love -- they're great -- all over the place, thousands and thousands of "
				+ "wounded soldiers. And we have nothing. We can't even go there. We have nothing. And every time we give Iraq "
				+ "equipment, the first time a bullet goes off in the air, they leave it.",
				"I love the military, and I want to have the strongest military that we've ever had, and we need it more now than ever. "
				+ "But I said, \"Don't hit Iraq,\" because you're going to totally destabilize the Middle East. "
				+ "Iran is going to take over the Middle East, Iran and somebody else will get the oil, and it turned out that "
				+ "Iran is now taking over Iraq. Think of it. Iran is taking over Iraq, and they're taking it over big league.",
				""
				};
		
		String[] obamacareResponses = {
				"Obamacare is a disaster. Big lie.",
				"Yesterday, it came out that costs are going for people up 29, 39, 49, and even 55 percent, and deductibles are "
				+ "through the roof. You have to be hit by a tractor, literally, a tractor, to use it, because the deductibles are "
				+ "so high, it's virtually useless. It's virtually useless. It is a disaster.",
				"We have to repeal Obamacare, and it can be -- and -- and it can be replaced with something much better for everybody. "
				+ "Let it be for everybody. But much better and much less expensive for people and for the government. And we can do it.",
				""
				};
		
		String[] obamaResponses = {
				"Obama is out playing golf. He might be on one of my courses. I would invite him, I actually would say. "
				+ "I have the best courses in the world, so I'd say, you know what, if he wants to -- I have one right next to "
				+ "the White House, right on the Potomac. If he'd like to play, that's fine.",
				"All I have to say about Obama is that he's the Worst. President. Ever.",
				"You know, when President Obama was elected, I said, \"Well, the one thing, I think he'll do well. I think he'll be a great "
				+ "cheerleader for the country. I think he'd be a great spirit.\" He was vibrant. He was young. I really thought "
				+ "that he would be a great cheerleader. But not a leader. But he wasn't a cheerleader. He's actually a negative force. "
				+ "He's been a negative force. He wasn't a cheerleader; he was the opposite. We need somebody that can take the "
				+ "brand of the United States and make it great again. It's not great again.",
				};
		
		if (MaxMain.findKeyword(userTyped, "ISIS", 0) >= 0 
				|| MaxMain.findKeyword(userTyped, "ISIL", 0) >= 0
				|| MaxMain.findKeyword(userTyped, "Islamic State", 0) >= 0
				|| MaxMain.findKeyword(userTyped, "Al Qaeda", 0) >= 0
				|| MaxMain.findKeyword(userTyped, "Terrorism", 0) >= 0) {
			MaxMain.printwrap(MaxMain.chooseFromStringArray(isisResponses));
		}
		
		if (MaxMain.findKeyword(userTyped, "Iraq", 0) >= 0 
				|| MaxMain.findKeyword(userTyped, "Iran", 0) >= 0
				|| MaxMain.findKeyword(userTyped, "Middle East", 0) >= 0) {
			MaxMain.printwrap(MaxMain.chooseFromStringArray(middleEastResponses));
		}
		
		if (MaxMain.findKeyword(userTyped, "Obamacare", 0) >= 0 
				|| MaxMain.findKeyword(userTyped, "Affordable Care", 0) >= 0) {
			MaxMain.printwrap(MaxMain.chooseFromStringArray(middleEastResponses));
		}
		
	}

	@Override
	public boolean isTriggered(String userInput) {
		if (MaxMain.findKeyword(userInput, "Iraq", 0) >= 0){
			return true;
		}
		if (MaxMain.findKeyword(userInput, "ISIS", 0) >= 0 
				|| MaxMain.findKeyword(userInput, "ISIL", 0) >= 0
				|| MaxMain.findKeyword(userInput, "Islamic State", 0) >= 0
				|| MaxMain.findKeyword(userInput, "Al Qaeda", 0) >= 0
				|| MaxMain.findKeyword(userInput, "Terrorism", 0) >= 0) {
			return true;
		}
		if (MaxMain.findKeyword(userInput, "Iraq", 0) >= 0 
				|| MaxMain.findKeyword(userInput, "Iran", 0) >= 0
				|| MaxMain.findKeyword(userInput, "Middle East", 0) >= 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public String talk(int count) {
		// TODO Auto-generated method stub
		return null;
	}

}
