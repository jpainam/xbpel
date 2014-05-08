package com.xbpel.ext;

import java.util.Vector;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.xbpel.process.Activity;
import com.xbpel.process.PartnerLinks;
/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected Discriminator pattern.
 * 
 * <pre>
 * &lt;xbpel:discriminator 
 * 		remaining = ‘forget | retain’?
 * 		count = "xsd:int"
 * 		>*
 *    &lt;bpel:partnerLinks>?
 *     &lt;!-- At least one activity must be specified. -->
 *    &lt;bpel:partnerLink name="NCName"
 *       partnerLinkType="QName"
 *        myRole="NCName"?
 *        partnerRole="NCName"?
 *       initializePartnerRole="yes|no"?>+
 *    &lt;/bpel:partnerLink>
 * &lt;/bpel:partnerLinks>
 * &lt;/xbpel:discriminator>
 * </pre>
 * 
 */

@XmlRootElement(name = "discriminator", namespace = "http://www.xbpel.org/cs/bpelextension")
public class Discriminator extends Activity{
	enum Remaining {
		forget,
		retain
	}
	@XmlAttribute
	protected Remaining remaining;
	@XmlAttribute
	protected int count;
	/**
	 * A list of all the child activities.
	 */
	@XmlElement
	protected final Vector<? extends Activity> children = new Vector<>();
	@Override
	public String marshaller() {
		return super.marshaller();
	}
	@Override
	public Object unMarshaller(String filename) {
		return super.unMarshaller(filename);
	}
	
	public static void main(String arg[]){
		Discriminator disc = new Discriminator();
		disc.count = 2;
		disc.joinCondition = "yes";
		disc.name = "discriminator";
		//disc.children.addElement(new Flow());
		disc.remaining = Remaining.forget;
		String str = disc.marshaller();
		System.out.println(str);
	}
	
	
}
