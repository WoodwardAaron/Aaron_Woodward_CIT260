
package memorygame;

/**
 *
 * @author Airwad NEW COMPY
 */
public class shufflecards {
private void initPanel() { 
 
 // create list of matched pairs of one-character strings, then 
 // shuffle the list 
 Character c; 
 for ( int i = 0; i < row * col / 2; i++ ) { 
 c = new Character( (char) ('A' + i) ); 
 matchList.add( c.toString() ); 
 matchList.add( c.toString() ); 
 } 
 Collections.shuffle( matchList );   

