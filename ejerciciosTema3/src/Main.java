
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coche miCoche=new Coche();
        int a=0;
        int b=0;
        int c=0;
        int op=0;
        int op1=0;
        Scanner teclado= new Scanner(System.in);
        menuGeneral(op,op1,a,b,c,teclado,miCoche);

    }

    public static int sumaNumeros(int a,int b,int c){
        int resultado;
        resultado=a+b+c;
        return resultado;
    }
    public static void printeoMenu(){
        System.out.println("Ejercicios Tema 3 Elija su opcion");
        System.out.println("1)----Primera Parte ( SUMA DE 3 NUMEROS)");
        System.out.println("2)----Segunda Parte (Clase Coche y su numero de puertas)");
        System.out.println("3)----Salir");
    }
    public static void menuOpciones(Scanner teclado,int op, int op1,int a,int b,int c,Coche miCoche){
        switch (op) {
            case 1: {
                System.out.println("Ingrese un numero");
                a = teclado.nextInt();
                System.out.println("Ingrese otro numero");
                b = teclado.nextInt();
                System.out.println("Ingrese otro numero");
                c = teclado.nextInt();
                System.out.println("Numeros ingresados son :[" + a + "]" + "[" + b + "]" + "[" + c + "]");
                System.out.println("La suma de los numeros ingresados son : " + sumaNumeros(a, b, c));

                break;
            }
            case 2: {
                System.out.println("numero de puertas actuales " + miCoche.getCantPuertas());
                System.out.println("Desea agregar una puerta a su coche? 1/0");
                op1 = teclado.nextInt();
                if (op1==1) {
                    miCoche.añadirPuerta(miCoche);
                }
                System.out.println("Ahora su coche tiene : " + miCoche.getCantPuertas());
                break;
            }
            case 3: {
                teclado.close();
                System.out.println("Saliendo.........");
                break;
            }
            default: {
                System.out.println("Opcion invalida!");
                break;
            }
        }
    }
    public static void menuGeneral(int op,int op1,int a,int b,int c,Scanner teclado, Coche miCoche){
        do {
            printeoMenu();
            op = teclado.nextInt();
            menuOpciones(teclado,op,op1,a,b,c,miCoche);

        } while (op!=3);
    }

}