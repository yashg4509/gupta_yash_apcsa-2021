package magpie;

public class Magpie2 {

	public String getGreeting() {
		return "Hello, let's talk.";
	}

	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0 || statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.contains("dog") || statement.contains("cat")) {
			response = "Tell me more about your pets.";
		} else if (statement.contains("mauro")) {
			response = "What a great teacher!";
		} else if (statement.contains("food")) {
			response = "What are you eating?";
		} else if (statement.contains("drink")) {
			response = "What are you drinking?";
		} else if (statement.contains("tired")) {
			response = "What did you do today?";
		} else if (statement.trim().length() == 0) {
			response = "Say something, please.";
		} else if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "That's insane!";
		} else if (whichResponse == 5) {
			response = "That's interesting!";
		}

		return response;
	}
}
