public class Sensor{

    public Sensor[ ] sensores = new Sensor[8];
    public int tamaño=10;
    public int posAnadir=0;
    private String tipo;
    private double valor;

    public Sensor(){
    }

    public Sensor(String t,double v){
        this.tipo=t;
        this.valor=v;
        Sensor p1=new Sensor(t,v);
        sensores[posAnadir] = this;
        this.posAnadir=this.posAnadir+1;
    }

    public int getTamaño(){
        return this.tamaño;
    }

    public int getPosAnadir(){
        return this.posAnadir;
    }

    public String getTipo(){
        return this.tipo;
    }

    public double getValor(){
        return this.valor;
    }

    public void  setTamaño(int t){
        this.tamaño=t;
    }

    public void setPosAnadir(int p){
        this.posAnadir=p;
    }

    public void setTipo(String t){
        this.tipo=t;
    }

    public void setValor(double v){
        this.valor=v;
    }
    
    public String toString(){
        String text1= this.tipo;
        String text2 = String.valueOf(this.valor);
        String text3= text1 + text2;
        return text3;
    }

    public String toStringSensores(){
        String s = "";
        for(int i = 0;i < posAnadir;i++){
         s = sensores[i].toString()+s;
        }
        return s;
    }
    
    

    public int cantidadSensores(){
        return posAnadir-1;
    }

}