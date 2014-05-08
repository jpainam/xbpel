package com.xbpel.process;

public class Attribute {
	/**
	 * The name of the attribute
	 */
	private String name;
	/**
	 * The actual value of the attribute
	 */
	private String value;
	/**
	 * 
	 */
	public Attribute(){
		name = value = new String();
	}
	public Attribute(String name, String value){
		this.name = name;
		this.value = value;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Attribute){
			Attribute attr = (Attribute)obj;
			if(this.name.equals(attr.name))
				return true;
			else
				return false;
		}else
			return false;
	}
	
}
