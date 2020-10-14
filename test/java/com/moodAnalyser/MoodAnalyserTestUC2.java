import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTestUC2 {

	private MoodAnalyser analyser;
	
	//Testing for Sad case
	@Test
	public void message_WhenSad_MustReturn_Sad() {
		analyser = new MoodAnalyser("I am a SAD Person");
		Assert.assertEquals("SAD", analyser.analyzeMessage());
	}
	
	//Testing for other case
	@Test
	public void message_WhenNotSad_MustReturn_Happy() {
		analyser = new MoodAnalyser("I am a Happy Person");
		Assert.assertEquals("HAPPY", analyser.analyzeMessage());
	}
	
	//Testing when Null is passed
	@Test
	public void message_WhenNull_MustReturn_Happy() {
		analyser = new MoodAnalyser(null);
		Assert.assertEquals("HAPPY", analyser.analyzeMessage());
	}
}
