package com.xbpel.process;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <pre>
 * &lt;bpel:partnerLinks>?
 *     &lt;!-- At least one role must be specified. -->
 *    &lt;bpel:partnerLink name="NCName"
 *       partnerLinkType="QName"
 *        myRole="NCName"?
 *        partnerRole="NCName"?
 *       initializePartnerRole="yes|no"?>+
 *    &lt;/bpel:partnerLink>
 * &lt;/bpel:partnerLinks>
 * </pre>
 * @author jpainam
 *
 */
@XmlRootElement(name = "PartnerLinks", namespace = "http://schemas.xmlsoap.org/ws/2003/03/business-process/")
public class PartnerLinks {
	@XmlElement
	protected List<PartnerLink> partnerLink;
	
}
