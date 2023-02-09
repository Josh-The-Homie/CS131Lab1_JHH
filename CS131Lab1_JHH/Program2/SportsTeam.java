package Program2;

public abstract class SportsTeam {
protected String teamName;
protected String teamMascot;
protected String headCoach;
protected int wins;
protected int losses;
/**
 * Sets all String instance fields to "" and all integer instance fields to 0.
 */
public void Team() {
teamName="";
teamMascot="";
headCoach="";
wins=0;
losses=0;
}//end Team
/**
 * Sets all instance fields to 0.
 * @param teamName
 * @param teamMascot
 * @param headCoach
 */
public void Team(String teamName, String teamMascot,String headCoach){
	teamName="0";
	teamMascot="0";
	headCoach="0";
	wins=0;
	losses=0;}//end Team
/**
 * uses the formula wins/(wins + losses).
 * @return Win percentage
 */
public double getWinPercentage() {
	return wins/(wins+losses);}//end getWinPercentage
public abstract double getStats();//end getStats
}//end class
