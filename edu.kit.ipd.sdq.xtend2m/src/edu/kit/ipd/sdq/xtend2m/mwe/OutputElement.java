package edu.kit.ipd.sdq.xtend2m.mwe;

/**
 * Output element that can be defined in the workflow.
 */
public class OutputElement {
	/** the package for which elements are to be collected */
	public String pack;
	/** the slot in which the elements are saved */
	public String slot;
	
	/**
	 * Set the package for which elements are to be collected.
	 * 
	 * @param pack the new package
	 */
	public void setPackage(String pack) {
		this.pack = pack;
	}

	/**
	 * Set the slot in which elements are saved.
	 * 
	 * @param slot the new slot
	 */
	public void setSlot(String slot) {
		this.slot = slot;
	}
	

}
