/**
 * Copyright (C) 2014 KAIST RESL 
 *
 * This file is part of Oliot (oliot.org).

 * @author Jack Jaewook Byun, Ph.D student
 * Korea Advanced Institute of Science and Technology
 * Real-time Embedded System Laboratory(RESL)
 * bjw0829@kaist.ac.kr
 */

/**
 * EPCISDocumentExtensionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.oliot.epcis.model;

import org.apache.axis.message.MessageElement;

public class EPCISDocumentExtensionType {
	private org.apache.axis.message.MessageElement[] _any;

	public EPCISDocumentExtensionType() {
	}

	public EPCISDocumentExtensionType(MessageElement[] _any) {
		this._any = _any;
	}

	public org.apache.axis.message.MessageElement[] get_any() {
		return _any;
	}

	public void set_any(org.apache.axis.message.MessageElement[] _any) {
		this._any = _any;
	}

}