/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
package org.apache.struts.action2.views.jsp.iterator;

import org.apache.struts.action2.components.AppendIterator;
import org.apache.struts.action2.components.Component;
import org.apache.struts.action2.views.jsp.ComponentTagSupport;
import com.opensymphony.xwork.util.OgnlValueStack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Append a list of iterators. The values of the iterators will be merged
 * into one iterator.
 *
 * @author Rickard �berg (rickard@dreambean.com)
 * @author tmjee (tm_jee (at) yahoo.co.uk )
 * @see AppendIterator
 */
public class AppendIteratorTag extends ComponentTagSupport {

	private static final long serialVersionUID = -6017337859763283691L;

	public Component getBean(OgnlValueStack stack, HttpServletRequest req, HttpServletResponse res) {
		return new AppendIterator(stack);
	}
	
}
