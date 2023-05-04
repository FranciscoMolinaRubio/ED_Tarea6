package ed_tarea6;

public class Tarea6EDClase {

    /**
     *
     * @param precioProducto
     * @param numProductos
     */
    public static final double REBAJA_PORCENTAJE_B = 0.95;
    public static final double REBAJA_PORCENTAJE_A = 0.8;
    public static final int REBAJA_PRODUCTO = 5;
    public static final int NUMERO_PRODUCTOS = 3;
    
    public void aplicarDescuento(double precioProducto, int numProductos){     
        double Total; 
        
    if(numProductos>NUMERO_PRODUCTOS) 
        precioProducto-=REBAJA_PRODUCTO; 
            if (numProductos!=0){ 
            Total = precioProducto*REBAJA_PORCENTAJE_A;
            salidaPorConsola(Total); 
        }else { 
            Total = precioProducto*REBAJA_PORCENTAJE_B;
            salidaPorConsola(Total); 
        }   
    } 

    public void salidaPorConsola(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
}

    


