package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class MenonitaDescuento implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
        float descuento = 0;
        for (LineaDeDetalle articulo: v.getLd()) {
            switch (articulo.getP().getClave()) {
                case 1:descuento += (articulo.getP().getPunit() * articulo.getCtd()) * 0.10;
                    break;
                case 2:descuento += (articulo.getP().getPunit() * articulo.getCtd()) * 0.10;
                    break;
                case 3:descuento += (articulo.getP().getPunit() * articulo.getCtd()) * 0.10;
                    break;
                case 5:descuento += (articulo.getP().getPunit() * articulo.getCtd()) * 0.10;
                    break;


            }

        }
        return descuento;
    }
}

