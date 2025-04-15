/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg1_ldp_lv;

import javax.swing.JOptionPane;

/**
 *
 * @author brian
 */
public class Persona {
    
    private float peso;
    private float estatura;
    private float imc; 

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc() {
        this.imc = getPeso() / (getEstatura()*getEstatura());
     }
    
    public void mostrarImc(){
        JOptionPane.showConfirmDialog(null, "Su IMC es: " +getImc());
        
        if(getImc()<18.5){
            JOptionPane.showConfirmDialog(null, "Bajo Peso");
        } else if (getImc()>= 18.5 && getImc() <= 24.9){
            JOptionPane.showConfirmDialog(null, "Peso Normal");
        } else if (getImc()>=25 && getImc() <= 29.9){
            JOptionPane.showConfirmDialog(null, "Sobre Peso");
        } else if (getImc()>= 30 && getImc()<=34.9){
            JOptionPane.showConfirmDialog(null, "Obesidad I");
        } else if (getImc()>= 35 && getImc()<=39.9){
            JOptionPane.showConfirmDialog(null, "Obesidad II");
        } else {
             JOptionPane.showConfirmDialog(null, "Obesidad III");
        }
    }
    
}
