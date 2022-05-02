/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.actions;

import com.daniel.model.Persona;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

/**
 *
 * @author adseglocdom
 */
public class PersonasAction extends ActionSupport {

    Logger log = LogManager.getLogger(PersonasAction.class);

    private Persona persona;

    @Override
    public String execute() throws Exception {
        if (persona != null) {
            log.info("persona: " + persona);
        } else {
            log.info("Persona con valor nulo");
        }

        return SUCCESS;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
