/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redparqueaderos.vehiculos;

public abstract class Vehiculo {
    protected String placa;
    protected String propietario;

    public Vehiculo(String placa, String propietario) {
        this.placa = placa;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Propietario: " + propietario;
    }
}
