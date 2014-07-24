package edu.kit.ipd.sdq.xtend2m.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Configuration wrapper class used by the module concept to
 * allow global configuration that is injected in all modules.
 */
public class Config {
	private Map<String, String> store;

	/**
	 * Create new Config instance.
	 */
	public Config() {
		this.store = new HashMap<String, String>();
	}
	
	/**
	 * Store a config item (String) under the specified key.
	 * @param name  the name of the config item
	 * @param value the value of the config item
	 */
	public void addConfigItem(String name, String value) {
		store.put(name, value);
	}
	
	/**
	 * Get a config item for the specified key.
	 * @param name the name of the config item
	 * @return the value of the config item for the supplied name or null
	 *   if no such item exists
	 */
	public String getConfigItem(String name) {
		return store.get(name);
	}
}
