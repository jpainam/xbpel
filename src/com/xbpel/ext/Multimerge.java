package com.xbpel.ext;

import java.util.Vector;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.omg.CORBA.VersionSpecHelper;

import com.xbpel.process.Activity;
import com.xbpel.process.Condition;
/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected Multimerge pattern.
 * 
 * <pre>
 * &lt;xbpel:multimerge>
 * 	&lt;bpel:condition>.......&lt;/bpel:condition>
 * &lt;bpel:flow>+
 * 		&lt;activityA conditionSatisfied = "yes | no"? />
 * 		. . .
 * 		&lt;activityA conditionSatisfied = "yes | no"? />
 * 		. . .
 * 		&lt;activityA conditionSatisfied = "yes | no"? />
 * &lt;/bpel:flow>
 * &lt;/xbpel:multimerge>
 * </pre>
 * 
 */


@XmlRootElement(name = "multimerge",  namespace = "http://www.xbpel.org/cs/bpelextension")
public class Multimerge extends Activity{
	@XmlElement
	protected Condition condition;
	/**
	 * Flow activity
	 */
	@XmlElement
	protected Vector<? extends Activity> flow;
	/**
	 * A list of all the child activities.
	 */
	@XmlElement
	protected final Vector<?> children = new Vector<Object>();
	/**
	 * @see com.xbpel.process.Activity#marshaller()
	 */
	@Override
	public String marshaller() {
		return super.marshaller();
	}

	/**
	 * @see com.xbpel.process.Activity#unMarshaller(java.lang.String)
	 */
	@Override
	public Object unMarshaller(String filename) {
		return super.unMarshaller(filename);
	}

}
