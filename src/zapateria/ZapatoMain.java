package zapateria;

public class ZapatoMain {

    public static void main(String[] args) {

        Zapato par1= new Zapato("N�utico", "Azul", 42, false, 10, 40);        
        Zapato par2= new Zapato("De sal�n", "Rojo", 38, true, 3, 25);
        
        par1.imprimir();
        par2.imprimir();
    }
}

