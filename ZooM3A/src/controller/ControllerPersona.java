/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.PantallaPrincipal;
import view.RegistrarPersona;
import view.login;

/**
 *
 * @author ALEJO
 */
public class ControllerPersona {

    login l = new login();

    public ControllerPersona() {
        l.setVisible(true);
    }

    public void iniciarcontroles() {
        l.getBtregistrarse().addActionListener(l -> abrirregistropersona());
    }

    public void abrirregistropersona() {
        RegistrarPersona rp = new RegistrarPersona();
        rp.setVisible(true);
    }

}
