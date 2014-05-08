package com.xbpel.process;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

/**
 * <pre>
 * &lt;bpel:partnerLink name="NCName"
 *       partnerLinkType="QName"
 *        myRole="NCName"?
 *        partnerRole="NCName"?
 *       initializePartnerRole="yes|no"?>+
 *    &lt;/bpel:partnerLink>
 * </pre>
 * @author jpainam
 * @param <Remaining>
 *
 */
@XmlRootElement(name = "partnerLink", namespace = "http://schemas.xmlsoap.org/ws/2003/03/business-process/")
public class PartnerLink {
	enum YesNo{
		yes,
		no,
	}
	@XmlAttribute
	protected String name;
	@XmlAttribute
	protected QName partnerLinkType;
	@XmlAttribute
	protected String partnerRole;
	@XmlAttribute
	protected YesNo initiliazePartnerRole;

}
