/******************************************************************************
 * 
 * Author:		Ryan Ragnell
 * Assignment:	Program 0
 * Class:		CSI 4321
 * 
 *****************************************************************************/
package bettercom.nmbl.serialization;
import java.util.*;
import java.io.PrintStream;


public class NameValueList extends java.lang.Object {
	
	//The list containing all name value pairs
	private Map<String, List<String>> nameValueList;
	
	/*
	 * Creates a new NameValueList with an empty list of name/value pairs
	 */
	public NameValueList(){
		nameValueList = new HashMap<String, List<String>>();
	}
	
	/*
	 * Creates a new NameValueList by decoding the input byte buffer
	 */
	public NameValueList(byte[] buf){
		
	}
	
	public NameValueList(Scanner in, PrintStream out){}
	
	/*
	 * Adds the name/value pair.
	 */
	public void addValue(String name, String value) throws BadAttributeException{
		if(name.isEmpty()){
			throw new BadAttributeException("Usage: addValue(name, value) - "
					+ "name empty", name);
		}
		else if(value.isEmpty()){
			throw new BadAttributeException("Usage: addValue(name, value) - "
					+ "value empty", value);
		}
		if(this.nameValueList.containsKey(name)){
			this.nameValueList.get(name).add(value);
		}
		else{
			List<String> list = new ArrayList<String>();
			list.add(value);
			this.nameValueList.put(name, list);
		}
	}
	
	/*
	 * Encodes the name-value list
	 */
	public byte[] encode(){
		return null;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		NameValueList other = (NameValueList) obj;
		if(nameValueList == null) {
			if(other.nameValueList != null){
				return false;
			}
		}
		else if(!nameValueList.equals(other.nameValueList)){
			return false;
		}
		
		return true;
	}
	
	/*
	 * Gets the list of names
	 */
	public Set<String> getNames(){
		return this.nameValueList.keySet();
	}
	
	/*
	 * Gets the list of strings associated with the given name
	 */
	public List<String> getValue(String name){
		if(this.nameValueList.containsKey(name)){
			return this.nameValueList.get(name);
		}
		return null;	
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nameValueList == null) ? 0 : nameValueList.hashCode());
		return result;
	}
	
	/*
	 * Create string representative of name/value list Adding the values
	 *  ("x","y"),("z",""),("z","no") generates [x:y,z:,no] Note this 
	 *  representation does not inject spurious spaces
	 */
	public String toString(){
		return null;
	}
}
