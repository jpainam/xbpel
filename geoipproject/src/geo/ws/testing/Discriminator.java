package geo.ws.testing;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.transform.stream.StreamSource;
/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected Discriminator pattern.
 * 
 * <pre>
 * &lt;xbpel:discriminator terminateProcess = ‘yes | no’?>*
 *    &lt;bpel:partnerLinks>?
 *     &lt;!-- At least one role must be specified. -->
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
public class Discriminator {
	enum YesNo {
		yes,
		no
	}
	@XmlAttribute
	protected YesNo terminateProcess;
	@XmlElement
	private PartnerLinks partnerLinks;
	/**
	 * 
	 * @return
	 */
	public String toBPELTags(){
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance(Discriminator.class);
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
	public Discriminator toDiscriminatorPattern(String filename){
		try{
			JAXBContext context = JAXBContext.newInstance(Discriminator.class);
			Unmarshaller unMarshal = context.createUnmarshaller();
			Discriminator discriminator = (Discriminator)unMarshal.unmarshal(
					new StreamSource(new StringReader(filename)));
			return discriminator;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
