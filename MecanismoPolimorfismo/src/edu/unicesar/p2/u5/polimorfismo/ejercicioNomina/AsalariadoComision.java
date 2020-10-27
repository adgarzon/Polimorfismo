/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u5.polimorfismo.ejercicioNomina;

/**
 *
 * @author Duvan
 */
public class AsalariadoComision extends PorComision {
    private double sBase;

    public AsalariadoComision() {
        super(0,0);
    }

    public AsalariadoComision(double sBase, double tVentas, double pComision) {
        super(tVentas, pComision);
        this.sBase = sBase;
    }

    public double getsBase() {
        return sBase;
    }

    public void setsBase(double sBase) {
        this.sBase = sBase;
    }
    @Override
    public double liquidarNominaMes(){
       return super.liquidarNominaMes() + this.sBase;
    }
    
}
