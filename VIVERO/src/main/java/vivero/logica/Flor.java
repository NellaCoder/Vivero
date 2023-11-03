
package vivero.logica;

  
public class Flor extends Planta {
    
     private String colordePetalos;
     private int cantidadPromdepetalos;  
     private String colordelpistilo; 
     private String variedaddeFlor;
     private String estacionqueFlorece;

    public Flor() {
    }

    public Flor(String colordePetalos, int cantidadPromdepetalos, String colordelpistilo, String variedaddeFlor, String estacionqueFlorece) {
        this.colordePetalos = colordePetalos;
        this.cantidadPromdepetalos = cantidadPromdepetalos;
        this.colordelpistilo = colordelpistilo;
        this.variedaddeFlor = variedaddeFlor;
        this.estacionqueFlorece = estacionqueFlorece;
    }

    public String getColordePetalos() {
        return colordePetalos;
    }

    public int getCantidadPromdepetalos() {
        return cantidadPromdepetalos;
    }

    public String getColordelpistilo() {
        return colordelpistilo;
    }

    public String getVariedaddeFlor() {
        return variedaddeFlor;
    }

    public String getEstacionqueFlorece() {
        return estacionqueFlorece;
    }

    public void setColordePetalos(String colordePetalos) {
        this.colordePetalos = colordePetalos;
    }

    public void setCantidadPromdepetalos(int cantidadPromdepetalos) {
        this.cantidadPromdepetalos = cantidadPromdepetalos;
    }

    public void setColordelpistilo(String colordelpistilo) {
        this.colordelpistilo = colordelpistilo;
    }

    public void setVariedaddeFlor(String variedaddeFlor) {
        this.variedaddeFlor = variedaddeFlor;
    }

    public void setEstacionqueFlorece(String estacionqueFlorece) {
        this.estacionqueFlorece = estacionqueFlorece;
    }


}
