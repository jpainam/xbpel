package com.xbpel.process;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.transform.stream.StreamSource;

public  class Activity {
	protected final String type = null;
	/**
	 * The tag's namespace
	 */
	protected final String namespace = null;
	
	/**
	 * The tag's name attribute.
	 */
	protected String name;	
	/**
	 * The tag's suppressJoinFailure attribute.
	 */
	protected boolean suppressJoinFailure = false;
	/**
	 * The tag's joinCondition attribute.
	 */
	@XmlAttribute
	protected String joinCondition = null;
	
	/**
	 * The current scope name.
	 */
	protected final String scopeData = null;
	/**
	 * The tag's target links.
	 */
	protected String [] tagName;
	/**
	 * The tag's source links.
	 */
	protected String sources;
	/**
	 * A list of attribute and their actual value
	 * @see com.xbpel.process.Attribute 
	 * <p>which is a set of pairs of form (key, value)
	 */
	protected List<Attribute> listAttribute = null;
	/**
	 * Default constructor
	 */
	public Activity(){
		this.listAttribute = new ArrayList<>();
		
	}
	public String marshaller(){
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance(Activity.class);
			Marshaller marshal = context.createMarshaller();
			marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			marshal.marshal(this, output);
			return output.toString();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 
	 * @param filename
	 * @return
	 */
	public Object unMarshaller(String filename){
		try{
			JAXBContext context = JAXBContext.newInstance(Activity.class);
			Unmarshaller unMarshal = context.createUnmarshaller();
			Object obj = (Object)unMarshal.unmarshal(
					new StreamSource(new StringReader(filename)));
			return obj;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 
	 * @param key key or property of the attribut to be added
	 * @param value value of the attribut to add
	 */
	public void addAttribut(String key, String value) throws Exception{
		Attribute attr = new Attribute(key, value);
		if(listAttribute.contains(attr)) throw new Exception("The attribut " + key + " already exist for this activity");
		
		this.listAttribute.add(new Attribute(key, value));
	
	}
	public static void main(String arg[]){
		Activity act = new Activity();
		act.joinCondition = "yes";
		act.name = "Activity";
		//act.scopeData = "This scope";
		String str = act.marshaller();
		System.out.println(str);
		
	}

}
