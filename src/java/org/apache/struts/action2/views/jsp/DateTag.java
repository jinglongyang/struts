package org.apache.struts.action2.views.jsp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action2.components.Component;
import org.apache.struts.action2.components.Date;
import com.opensymphony.xwork.util.OgnlValueStack;

/**
 * @see Date
 */
public class DateTag extends ComponentTagSupport {

    protected String name;
    protected String format;
    protected boolean nice;

    public Component getBean(OgnlValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new Date(stack);
    }

    protected void populateParams() {
        super.populateParams();
        Date d = (Date)component;
        d.setName(name);
        d.setFormat(format);
        d.setNice(nice);

    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setNice(boolean nice) {
        this.nice = nice;
    }

    public void setName(String name) {
        this.name = name;
    }
}
