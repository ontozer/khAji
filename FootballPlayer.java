
public class FootballPlayer {

	int no;
    String name;
	int minutes;
    boolean inPlay;
    int number0fGoals;
    
    void play(int minutesToPlay)  {
    	minutes = minutes + minutesToPlay;
    	}
    
    void score() {
    	number0fGoals = number0fGoals + 1;
    	
    }
    
}
