package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class EmbutidosLacteos implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
        float descuento = 0;
        for (LineaDeDetalle articulo: v.getLd()) {
            switch (articulo.getP().getClave()) {

                case 1:
                    descuento += (articulo.getP().getPunit() * articulo.getCtd()) * 0.15;
                    break;
                case 2:
                    descuento += (articulo.getP().getPunit() * articulo.getCtd()) * 0.15;
                    break;
                case 3:
                    descuento += (articulo.getP().getPunit() * articulo.getCtd()) * 0.15;
                    break;
                case 5:
                    descuento += (articulo.getP().getPunit() * articulo.getCtd()) * 0.15;
                    break;
                case 4:
                    descuento += (articulo.getP().getPunit() * articulo.getCtd()) * 0.05;
                    break;
            }

        }
        return descuento;
        }
    }

