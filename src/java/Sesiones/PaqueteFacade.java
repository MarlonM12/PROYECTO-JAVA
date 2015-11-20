/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesiones;

import Entidades.Paquete;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author M4rloN
 */
@Stateless
public class PaqueteFacade extends AbstractFacade<Paquete> {

    @PersistenceContext(unitName = "ProyectoJavaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaqueteFacade() {
        super(Paquete.class);
    }
    
}
