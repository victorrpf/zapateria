package zapateria;

class Zapato {
    public String tipo;
    public String color;
    public int numero;
    public boolean liquidacion;
    private int cantidad;
    private double precio;

    public Zapato(String tipo, String color, int numero, boolean liquidacion, int cantidad, int precio) {
        this.tipo = tipo;
        this.color = color;
        this.numero = numero;
        this.liquidacion = liquidacion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Zapato() {
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setLiquidacion(boolean liquidacion) {
        this.liquidacion = liquidacion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void imprimir(){
        System.out.print("Tipo: " + tipo + "\t ");
        System.out.print("Color: " + color + "\t ");
        System.out.print("Número: " + numero + "\t ");
        System.out.print("Liquidación: " + liquidacion + "\t ");
        System.out.print("Cantidad: " + cantidad + "\t ");
        System.out.println("Precio: " + precio + "\t ");
    }
}
