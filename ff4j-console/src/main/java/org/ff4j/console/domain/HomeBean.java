package org.ff4j.console.domain;

/*
 * #%L
 * ff4j-console
 * %%
 * Copyright (C) 2013 - 2014 Ff4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.io.Serializable;

/**
 * Webbean to display home information
 *
 * @author <a href="mailto:cedrick.lunven@gmail.com">Cedrick LUNVEN</a>
 */
public class HomeBean implements Serializable {

    /** serial. */
    private static final long serialVersionUID = 9115704270593636619L;

    /** uptime. */
    private String uptime;
    
    private String store;

    private String caching;

    private String security;

    private String monitoring;

    private String version;
    
    private int nbFeature = 0;

    private int nbGroup = 0;

    private int nbEvents = 0;

    public HomeBean() {
}

    /**
     * Getter accessor for attribute 'store'.
     *
     * @return current value of 'store'
     */
    public String getStore() {
        return store;
    }

    /**
     * Setter accessor for attribute 'store'.
     * 
     * @param store
     *            new value for 'store '
     */
    public void setStore(String store) {
        this.store = store;
    }

    /**
     * Getter accessor for attribute 'caching'.
     *
     * @return current value of 'caching'
     */
    public String getCaching() {
        return caching;
    }

    /**
     * Setter accessor for attribute 'caching'.
     * 
     * @param caching
     *            new value for 'caching '
     */
    public void setCaching(String caching) {
        this.caching = caching;
    }

    /**
     * Getter accessor for attribute 'security'.
     *
     * @return current value of 'security'
     */
    public String getSecurity() {
        return security;
    }

    /**
     * Setter accessor for attribute 'security'.
     * 
     * @param security
     *            new value for 'security '
     */
    public void setSecurity(String security) {
        this.security = security;
    }

    /**
     * Getter accessor for attribute 'monitoring'.
     *
     * @return current value of 'monitoring'
     */
    public String getMonitoring() {
        return monitoring;
    }

    /**
     * Setter accessor for attribute 'monitoring'.
     * 
     * @param monitoring
     *            new value for 'monitoring '
     */
    public void setMonitoring(String monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * Getter accessor for attribute 'version'.
     *
     * @return current value of 'version'
     */
    public String getVersion() {
        return version;
    }

    /**
     * Setter accessor for attribute 'version'.
     * 
     * @param version
     *            new value for 'version '
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Getter accessor for attribute 'uptime'.
     *
     * @return current value of 'uptime'
     */
    public String getUptime() {
        return uptime;
    }

    /**
     * Setter accessor for attribute 'uptime'.
     * 
     * @param uptime
     *            new value for 'uptime '
     */
    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    /**
     * Getter accessor for attribute 'nbFeature'.
     *
     * @return current value of 'nbFeature'
     */
    public int getNbFeature() {
        return nbFeature;
    }

    /**
     * Setter accessor for attribute 'nbFeature'.
     * 
     * @param nbFeature
     *            new value for 'nbFeature '
     */
    public void setNbFeature(int nbFeature) {
        this.nbFeature = nbFeature;
    }

    /**
     * Getter accessor for attribute 'nbGroup'.
     *
     * @return current value of 'nbGroup'
     */
    public int getNbGroup() {
        return nbGroup;
    }

    /**
     * Setter accessor for attribute 'nbGroup'.
     * 
     * @param nbGroup
     *            new value for 'nbGroup '
     */
    public void setNbGroup(int nbGroup) {
        this.nbGroup = nbGroup;
    }

    /**
     * Getter accessor for attribute 'nbEvents'.
     *
     * @return current value of 'nbEvents'
     */
    public int getNbEvents() {
        return nbEvents;
    }

    /**
     * Setter accessor for attribute 'nbEvents'.
     * 
     * @param nbEvents
     *            new value for 'nbEvents '
     */
    public void setNbEvents(int nbEvents) {
        this.nbEvents = nbEvents;
    }

}
