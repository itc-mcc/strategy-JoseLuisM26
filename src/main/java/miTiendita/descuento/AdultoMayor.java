package miTiendita.descuento;


import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class AdultoMayor implements IDesctoStrategy {
    @Override
    public float getDescto(Venta v) {
        float descuento = 0;
        for (LineaDeDetalle articulo: v.getLd()) {
            descuento+= (articulo.getP().getPunit()*articulo.getCtd())*0.05;
        }
        return descuento;
    }    
}