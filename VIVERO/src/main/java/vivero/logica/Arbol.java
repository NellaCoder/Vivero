
package vivero.logica;

public class Arbol extends Planta {
    
     private String variedad;
     private String TipoTronco; 
     private double RadioTronco; 
     private String color; 
     private String TipoDeHojas;

    public Arbol() {
    }

    public Arbol(String variedad, String TipoTronco, double RadioTronco, String color, String TipoDeHojas) {
        this.variedad = variedad;
        this.TipoTronco = TipoTronco;
        this.RadioTronco = RadioTronco;
        this.color = color;
        this.TipoDeHojas = TipoDeHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public String getTipoTronco() {
        return TipoTronco;
    }

    public double getRadioTronco() {
        return RadioTronco;
    }

    public String getColor() {
        return color;
    }

    public String getTipoDeHojas() {
        return TipoDeHojas;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public void setTipoTronco(String TipoTronco) {
        this.TipoTronco = TipoTronco;
    }

    public void setRadioTronco(double RadioTronco) {
        this.RadioTronco = RadioTronco;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipoDeHojas(String TipoDeHojas) {
        this.TipoDeHojas = TipoDeHojas;
    }
    
     
     @override
     
     
     
     
     
}

