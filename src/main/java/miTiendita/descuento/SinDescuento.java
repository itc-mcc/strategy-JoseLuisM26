package miTiendita.descuento;

import miTiendita.venta.Venta;

public class SinDescuento implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
        return 0;
    }    
}
