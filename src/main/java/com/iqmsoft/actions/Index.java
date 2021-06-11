
package com.iqmsoft.actions;

import com.opensymphony.xwork2.ActionSupport;

/* Default action when enter the application */
public class Index extends ActionSupport {

    private static final long serialVersionUID = -3243216917801206214L;

    private boolean useMinifiedResources = false;

    public String execute() throws Exception {
        return SUCCESS;
    }

    public boolean isUseMinifiedResources() {
        return useMinifiedResources;
    }

    public void setUseMinifiedResources(boolean useMinifiedResources) {
        this.useMinifiedResources = useMinifiedResources;
    }
}

