
package vivero.logica;

public class Arbusto extends Planta {

private Double anchoArbusto;
private boolean esDomestico; 
private String variedadArbusto;
private String colordeHojas;
private boolean sepodaONo; 

    public Arbusto() {
    }

    public Arbusto(Double anchoArbusto, boolean esDomestico, String variedadArbusto, String colordeHojas, boolean sepodaONo) {
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colordeHojas = colordeHojas;
        this.sepodaONo = sepodaONo;
    }

    public Double getAnchoArbusto() {
        return anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public String getColordeHojas() {
        return colordeHojas;
    }

    public boolean isSepodaONo() {
        return sepodaONo;
    }

    public void setAnchoArbusto(Double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public void setColordeHojas(String colordeHojas) {
        this.colordeHojas = colordeHojas;
    }

    public void setSepodaONo(boolean sepodaONo) {
        this.sepodaONo = sepodaONo;
    }


 
}
