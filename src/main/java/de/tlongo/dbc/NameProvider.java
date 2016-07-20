/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tlongo.dbc;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

/**
 *
 * @author tomas
 */
@ApplicationScoped
public class NameProvider {
    
    @Produces
    @GreetersName
    public String name() {
        String[] names = {
            "John",
            "Mike",
            "Sandra",
            "Tina"
        };
        
        return names[(int)(Math.random() * (double)names.length)];
    }
}
