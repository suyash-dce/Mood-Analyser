public class MoodAnalyser {
	
	private String message;

	public MoodAnalyser() {}
	
	public MoodAnalyser(String message) {					//Refracted
		this.message = message;
	}
	
	public String analyzeMessage() {
		try {												//try block used in UC2
			String lower_msg=message.toLowerCase();
			if (lower_msg.contains("sad")) {				//return sad when message contains sad
				return "SAD";
			}else {
				return "HAPPY";								//return happy otherwise
			}
		}catch(NullPointerException exception) {
			return "HAPPY";
		}
	}
}
