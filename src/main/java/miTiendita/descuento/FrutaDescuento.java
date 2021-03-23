package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class FrutaDescuento implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
        float descuento = 0;
        for (LineaDeDetalle articulo: v.getLd()) {
            switch (articulo.getP().getClave()) {
                case 6, 7 -> descuento += (articulo.getP().getPunit() * articulo.getCtd()) * 0.15;
            }

        }
        return descuento;
    }
}
