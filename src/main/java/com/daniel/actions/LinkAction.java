/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

/**
 *
 * @author adseglocdom
 */
@Results({
    @Result(name = "bienvenidoResult", location = "bienvenidoTile", type = "tiles"),
    @Result(name = "personasResult", location = "personasTile", type = "tiles")
})
public class LinkAction extends ActionSupport {

    @Action(value = "bienvenidoAction")
    public String bienvenido() {
        return "bienvenidoResult";
    }

    @Action(value = "personasAction")
    public String personas() {
        return "personasResult";
    }

}
