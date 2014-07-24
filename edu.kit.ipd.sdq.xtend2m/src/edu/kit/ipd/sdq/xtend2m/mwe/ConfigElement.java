package edu.kit.ipd.sdq.xtend2m.mwe;

/**
 * Configuration element that can be defined in the workflow.
 * 
 * @see edu.kit.ipd.sdq.xtend2m.api.Config
 */
public class ConfigElement {
	/** the key for the config element */
	public String key;
	/** the value for the config element */
	public String value;
	
	/**
	 * Sets the key of the element to <tt>key</tt>
	 * @param key the new key
	 */
	public void setKey(String key) {
		this.key = key;
	}
	
	/**
	 * Sets the value of the element to <tt>value</tt>
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
