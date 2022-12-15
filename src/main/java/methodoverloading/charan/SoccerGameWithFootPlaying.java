package methodoverloading.charan;

public class SoccerGameWithFootPlaying extends Sport {

	public SoccerGameWithFootPlaying() {
		super(1);
	}

	public void rules(int time3, String timings5) {

		System.out.println("SoccerGameWithFootPlaying class method = " + time3 + " " + timings5);
	}

	@Override
	public void rules1(int time1, String timings1) {
		super.rules1(time1, timings1);
		System.out.println(" SoccerGameWithFootPlaying class method = " + time1 + " " + timings1);
	}

	public static void main(String[] args) {

		SoccerGameWithFootPlaying s1 = new SoccerGameWithFootPlaying();
		Sport s = new Sport(6);
		s1.rules(1, "one game have ");
		s1.rules1(2, "two in soccer");
		s.rules(4, "its a sport");
		s.rules1(8, "its override sport");

	}

}
