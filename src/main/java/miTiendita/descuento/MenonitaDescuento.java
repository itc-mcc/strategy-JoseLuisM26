package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class MenonitaDescuento implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
        float descuento = 0;
        for (LineaDeDetalle articulo: v.getLd()) {
            switch (articulo.getP().getClave()) {
                case 1, 2, 3, 5 -> descuento += (articulo.getP().getPunit() * articulo.getCtd()) * 0.10;
            }

        }
        return descuento;
    }
}

