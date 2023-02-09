package Program2;

public class BasketballTeam {
private int fieldGoals;
private int fieldGoalsAttempted;
private int freeThrows;
private int freeThrowsAttempted;
protected int wins;
protected int losses;
public void BasketballTeam() {
	fieldGoals=0;
	fieldGoalsAttempted=0;
	freeThrows=0;
	freeThrowsAttempted=0;
	wins=0;
	losses=0;
}
public void BasketballTeam(String teamName,String teamMascot,String headCoach) {
	fieldGoals=0;
	fieldGoalsAttempted=0;
	freeThrows=0;
	freeThrowsAttempted=0;}
public void setStats(int wins,int losses,int fieldGoals,int FieldGoalsAttempted,int freeThrows,int freeThrowsAttempted{
}
public double fieldGoalPercentage() {
	return fieldGoals/fieldGoalsAttempted;}
public double freeThrowPercentage() {
	return freeThrows/freeThrowsAttempted;}
public double[] getStats() {
	double[] Stats=new double[2];
	Stats[0]=wins/(wins+losses);
	Stats[1]=fieldGoals/fieldGoalsAttempted;
	Stats[2]=freeThrows/freeThrowsAttempted;
	return Stats;
}
}