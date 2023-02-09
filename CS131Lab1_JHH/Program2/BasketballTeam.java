package Program2;

public class BasketballTeam {
private int fieldGoals;
private int fieldGoalsAttempted;
private int freeThrows;
private int freeThrowsAttempted;
protected int wins;
protected int losses;
/**
 * Sets all String instance fields to "" and all integer instance fields to 0.
 */
public void BasketballTeam() {
	fieldGoals=0;
	fieldGoalsAttempted=0;
	freeThrows=0;
	freeThrowsAttempted=0;
	wins=0;
	losses=0;
}
/**
 * Sets all integer instance variables to 0.
 * @param teamName
 * @param teamMascot
 * @param headCoach
 */
public void BasketballTeam(String teamName,String teamMascot,String headCoach) {
	fieldGoals=0;
	fieldGoalsAttempted=0;
	freeThrows=0;
	freeThrowsAttempted=0;}
/**
 * I was not told to do anything with this.
 * @param wins
 * @param losses
 * @param fieldGoals
 * @param FieldGoalsAttempted
 * @param freeThrows
 * @param freeThrowsAttempted
 */
public void setStats(int wins,int losses,int fieldGoals,int FieldGoalsAttempted,int freeThrows,int freeThrowsAttempted{
}//end setStats
/**
 * Uses the formula fieldGoals/fieldGoalsAttempted.
 * @return double
 */
public double fieldGoalPercentage() {
	return fieldGoals/fieldGoalsAttempted;}//end fieldGoalPercentage
/**
 * Uses the formula freeThrows/freeThrowsAttempted.
 * @return double
 */
public double freeThrowPercentage() {
	return freeThrows/freeThrowsAttempted;}//end freeThrowPercentage
/**
 * returns an array of doubles with the win percentage, field goals percentage and free throw percentage (in that order).
 * @return array
 */
public double[] getStats() {
	double[] Stats=new double[2];
	Stats[0]=wins/(wins+losses);
	Stats[1]=fieldGoals/fieldGoalsAttempted;
	Stats[2]=freeThrows/freeThrowsAttempted;
	return Stats;
}//end getStats
}
