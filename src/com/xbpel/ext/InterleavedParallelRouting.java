package com.xbpel.ext;

import java.util.List;
import java.util.Vector;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.xbpel.process.Activity;

/**
 * 
 * @author Jean-Paul Ainam
 * Date : 30 March 2014
 * <p>Interleaved Parallel Routing
 * <pre>
 * &lt;xbpel:interleaved>*
 * &lt;xbpel:iterator 
 * 	references = “$(a, b, . . ., c)”? 
 * 	executed = “xsd:list”
 * &lt/xbpel:iterator>?
 * &lt;activityA ref = “a”>*
 * . . .
 * &lt;/activityA>
 * <activityB ref = “b”>*
 * 	. . .
 * &lt;/activityB>*
 * &lt;!—Define all the activities to be interleaved here -->
 * &lt;activityC ref = “c”>*
 * . . .
 * &lt;/activityC>
 * &lt;/xbpel:interleaved>
 * </pre>
 */
@XmlRootElement(name = "interleaved", namespace = "http://www.xbpel.org/cs/bpelextension")
public class InterleavedParallelRouting extends Activity{
	class xIterator{
		@XmlAttribute
		protected List<String> references;
		@XmlAttribute
		protected List<String> executed;
	}
	@XmlElement
	protected xIterator iIterator;
	/**
	 * A list of all the child activities.
	 * Refer to list of activities to be interleaved
	 */
	@XmlElement
	protected final Vector<? extends Activity> children = new Vector<>();
	
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
