
package vivero.logica;

public abstract class Planta {
    
    private String nombre; 
    private int altodelTallo;
    private boolean tieneHojas;
    private String climaIdeal;
    
    
  public static void main(String[] args) {
        
    }

    public Planta() {
    }

    public Planta(String nombre, int altodelTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altodelTallo = altodelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAltodelTallo() {
        return altodelTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltodelTallo(int altodelTallo) {
        this.altodelTallo = altodelTallo;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
  
  public abstract void decirloquesoy();
  

}
