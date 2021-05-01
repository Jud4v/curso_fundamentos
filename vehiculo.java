public class vehiculo{
    public static vehiculo[] vehiculos = new vehiculo[10];

    public static int tamano = 10;

    public static int posAnadir = 0;

    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    
    public vehiculo(){
        vehiculos[posAnadir]=this;
        posAnadir++;
    }

    public vehiculo(int mo, String ma, double va){
        this(mo, ma, va,"verde");
    }

    public vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;

    }

    public int getModelo(){
        return modelo;
    }

    public void setModelo(int mo){
        this.modelo = mo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String ma){
        this.marca = ma;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }

    public void setValorComercial(double va){
        this.valorComercial = va;
    }

    public String getColor(){
        
        return this.color;
    }

    public void setColor(String co){
        this.color = co;
    }

    public String toString(){
        return "modelo: " + this.modelo + "marca: " + this.marca + "Valor Comercial: " + this.valorComercial + "Color: " + this.color;
    }

    public static String toStringVehiculos(){
        String v = "";
        for(int i = 0;i < posAnadir;i++){
         v = vehiculos[i].toString()+v;
        }
        return v;
        }
    
    public static int cantidadVehiculos(){
        return posAnadir-1;
    }
    
    
}