import java.util.Scanner;
public class trry{

    public static void main (String[]args){

    }

    public static void mostarMenu (int [] m ){
        Scanner sc = new Scanner(System.in);
        vehiculo v1 = new vehiculo();
        Sensor s1= new Sensor();
        int x = sc.nextInt();
        while(x >= 0){
            switch(x){
                case 0:
                break;

                case 1:

                if(v1.posAnadir <= 10){
                    System.out.print("DIGITE EL MODELO: ");
                    v1.setModelo(sc.nextInt());
                    System.out.print("DIGITE EL MARCA: ");
                    v1.setMarca(sc.nextLine());
                    System.out.print("DIGITE EL VALOR: ");
                    v1.setValorComercial(sc.nextDouble());
                    System.out.print("DIGITE EL COLOR: ");
                    v1.setColor(sc.nextLine());

                }else{
                    System.out.println("Error base de datos llena");
                }

                case 2:
                

                case 3:
                System.out.println(v1.cantidadVehiculos()); 

                case 4:
                
                      
                

                case 5:
                if(s1.posAnadir <= 8){
                    System.out.print("DIGITE EL MODELO: ");
                    s1.setTipo(sc.nextLine());
                    System.out.print("DIGITE EL VAlOR: ");
                    s1.setValor(sc.nextDouble());
                }else{
                    System.out.println("Error base de datos llena");
                }
                case 6:
                

                case 7:
                System.out.println(s1.cantidadSensores()); 

                case 8:
                
                

                case 666:
            }
        }
    }
}