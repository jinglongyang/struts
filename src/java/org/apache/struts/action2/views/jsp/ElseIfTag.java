/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
package org.apache.struts.action2.views.jsp;

import org.apache.struts.action2.components.Component;
import org.apache.struts.action2.components.ElseIf;
import com.opensymphony.xwork.util.OgnlValueStack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @see ElseIf
 */
public class ElseIfTag extends ComponentTagSupport {
    protected String test;

    public Component getBean(OgnlValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new ElseIf(stack);
    }

    protected void populateParams() {
        ((ElseIf) getComponent()).setTest(test);
    }

    public void setTest(String test) {
        this.test = test;
    }
}
