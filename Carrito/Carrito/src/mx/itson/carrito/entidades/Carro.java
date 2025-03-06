
package mx.itson.carrito.entidades;

import mx.itson.carito.enums.TipoMotor;
import mx.itson.carito.enums.TipoTransmision;


/**
 *
 * @author Dorantes Rogel Angel Adrian 
 */
public class Carro {

    /**
     * @return the tipoTransmision
     */
    public TipoTransmision getTipoTransmision() {
        return tipoTransmision;
    }

    /**
     * @param tipoTransmision the tipoTransmision to set
     */
    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    /**
     * @return the tipoMotor
     */
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the kilometraje
     */
    public float getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the speed
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    /**
     * @return the miles
     */
    public Double getMiles() {
        return miles;
    }

    /**
     * @param miles the miles to set
     */
    public void setMiles(Double miles) {
        this.miles = miles;
    }
    private String model;
    private String color;
    private Double speed;
    private Double miles;
    private float kilometraje;
    private TipoMotor tipoMotor;
    private TipoTransmision tipoTransmision;
    
/**
 * Calcula el tiempo que tarda el carro en recorrer una distancia determinada por el usuario.
 * @param distance = Es la distancia a la que se espera que el carro recorra
 * @param speed = Es la velocidad a la que el carro se mueve hacia su objetivo
 * @return time = Tiempo que se tardo en recorrer la distancia
 */    
  public double calculateTime(double distance, double speed){
  this.kilometraje += distance;
            double time = distance/speed;
            return time;
        } 
    
    
}
