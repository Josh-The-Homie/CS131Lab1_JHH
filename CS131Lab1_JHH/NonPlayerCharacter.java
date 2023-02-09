import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Joshua henderson
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	private boolean active;
	private String intelligenceType;
	/**
	 * Default constructor for NonPlayerCharacter
	 */
	public NonPlayerCharacter() {
		super();
		active=false;
		intelligenceType="AVERAGE";	}//end NonPlayerCharacter
	/**
	 * Preferred constructor
	 * @param id
	 * @param personality
	 * @param active
	 * @param intelligenceType
	 */
	public NonPlayerCharacter(String id, String personality,boolean active,String intelligenceType) {
	super(id,personality);}//end NonPlayerCharacter
	/**
	 * Sets active to aactive
	 * and aactive to false
	 * @param aactive
	 */
	public void setActive(boolean aactive) {
		this.active=aactive;
		aactive=false;}//end setActive
	/**
	 * @return active
	 */
	public boolean getActive() {
		return active;}//end getActive
	/**
	 * Sets intelligenceType to aintelligenceType
	 * and aintelligenceType to AVERAGE
	 * @param aintelligenceType
	 */
	public void setintelligenceType(String aintelligenceType) {
		this.intelligenceType=aintelligenceType;
		aintelligenceType="AVERAGE";}//end setintelligenceType
	/**
	 * @return intelligece
	 */
	public String getintelligenceType() {
		return intelligenceType;}//end getintelligenceType
	/**
	 * Sets sb to that whole thing
	 * @param sb
	 */
	public String reportStructure() {
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("UniqueID: "+getUniqueID()+"\n");
		sb.append("Personality: "+getPersonality()+"\n");
		sb.append("==================================\n");
		sb.append("Active: "+getActive()+"\n");
		sb.append("Intelligence: "+getintelligenceType()+"\n");
		sb.append("==================================\n");
		return sb.toString();}//end reportStructure
	/**
	 * @param introduction
	 * @return introduction
	 */
	public String introduce(String introduction) {
	introduction="Hello, my name is"+getUniqueID()+"\n";
	return introduction;}//end introduce
	/**
	 * @param exclamation
	 * @param i
	 * @return exclamation
	 */
	public String exclaim(String exclamation,int i){
	i = (int)(Math.random()*5); 
	if(i==0) {
		exclamation="Dag Gummit";}
	if(i==1) {
		exclamation="Doggone it";}
	if(i==2) {
		exclamation="Holy cow";}
	if(i==3) {
		exclamation="Jeez";}
	if(i==4) {
		exclamation="Well chese and crackers";}
	return exclamation;}//end exclaim
}//end class
