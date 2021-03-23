package miTiendita.venta;

import miTiendita.descuento.*;
import miTiendita.productos.Producto;
import java.util.*;

public class Venta {
    int diaSemana;
    boolean terceraEdad;
    List<LineaDeDetalle> ld = new ArrayList<LineaDeDetalle>();
    IDesctoStrategy IDescto;

    public Venta(int diaSemana, boolean terceraEdad)
    {
        this.diaSemana = diaSemana;
        this.terceraEdad = terceraEdad;

        addDescto();
    }

    public void addProducto(Producto p, double ctd)
    {
        ld.add(new LineaDeDetalle(p,ctd));
    }

    public void addDescto()
    {
       /* switch (diaSemana) {
            case 1, 7 -> IDescto = new AdultoMayor();
            case 2, 6 -> IDescto = new SinDescuento();
            case 3 -> IDescto = new MenonitaDescuento();
            case 4 -> IDescto = new FrutaDescuento();
            case 5 -> IDescto = new EmbutidosLacteos();


        }*/
        switch (diaSemana){
            case 1,7:
                IDescto = new AdultoMayor();
                break;
        }

    }


    public double getTotal()
    {
        double subTotal = 0;
        double total = 0;
        for (LineaDeDetalle articulo: ld) {
         subTotal+= articulo.p.getPunit()*articulo.ctd;
        }
        return total =  (subTotal- IDescto.getDescto(this))+(subTotal-IDescto.getDescto(this))*(0.16);
    }

    public List<LineaDeDetalle> getLd() {
        return ld;
    }
}