/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
package org.apache.struts.action2.views.freemarker.tags;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action2.components.Component;
import org.apache.struts.action2.components.RichTextEditor;
import com.opensymphony.xwork.util.OgnlValueStack;

/**
 * Freemarker's Transform model for Richtexteditor 
 * 
 * @author tm_jee
 * @version $Date: 2006/02/18 05:29:26 $ $Id: RichTextEditorModel.java,v 1.1 2006/02/18 05:29:26 tmjee Exp $
 */
public class RichTextEditorModel extends TagModel {

	public RichTextEditorModel(OgnlValueStack stack, HttpServletRequest req, HttpServletResponse res) {
		super(stack, req, res);
	}

	protected Component getBean() {
		return new RichTextEditor(stack, req, res);
	}
}
