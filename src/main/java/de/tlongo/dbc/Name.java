package de.tlongo.dbc;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * This guy here should 
 */
@RequestScoped
public class Name {

    @Inject
    @GreetersName
    private String name;
    
    public String getName() {
        return this.name;
    }
}
