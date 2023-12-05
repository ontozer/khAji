
public class FootballPlayerTest {

	public static void main(String[] args) {
		
		FootballPlayer hagi = new FootballPlayer();
		hagi.no = 10;
		hagi.name = "Georghe Hagi";
		hagi.minutes = 0;
		hagi.inPlay = true;
		hagi.number0fGoals = 0;
		
		hagi.play(90);
		hagi.score();
		hagi.score();
		
		hagi.play(75);
		hagi.score();
		
		
		System.out.println("Number of goals Hagi scored: " + hagi.number0fGoals);
		System.out.println("Hagi played totally: " + hagi.minutes + " minutes so far. ");
		
		System.out.println("**********");
		
		FootballPlayer sneijder = new FootballPlayer();
		sneijder.no = 10;
		sneijder.name = "Wesley Sneijder";
		sneijder.minutes = 450;
		sneijder.inPlay = true;
		sneijder.number0fGoals = 5;
		
		sneijder.play(90);
		sneijder.score();
		sneijder.score();
		
		System.out.println("Number of Sneijder scored: " + sneijder.number0fGoals);
		System.out.println("Sneijder played totally: " + sneijder.minutes + " minutes so far. ");
		
		}
}
