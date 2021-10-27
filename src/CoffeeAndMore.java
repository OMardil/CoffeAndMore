import java.util.Scanner;

public class CoffeeAndMore {
    public static void main(String[] args) throws Exception {
        double precioCappuccino = 51.50; //precio del cappuccino
        double precioMocha = 65.00; //precio del mocha
        double precioAmericano = 33.70; //precio del café americano

        int totalCappuccinos = 0; //cantidad total de Capuccinos en la orden
        int totalMocha = 0; //cantidad total de mochas en la orden
        int totalAmericano = 0; //cantidad total de americanos en la orden
        
        double costoTotal = 0; // costo total
        double puntosFinales = 0; //puntos promocionales generados por la compra

        Scanner keyboard = new Scanner(System.in);
        System.out.print("¿Cuántos cafés americanos quieres?: ");
        totalAmericano = keyboard.nextInt();

        System.out.print("¿Cuántos mochas quieres?: ");
        totalMocha = keyboard.nextInt();        

        System.out.print("¿Cuántos cappuccinos quieres?: ");
        totalCappuccinos = keyboard.nextInt();             

        if (totalCappuccinos < 0 || totalAmericano < 0 || totalMocha < 0){
            System.out.println("Error. Información inválida.");
            System.exit(0);
        }

        //complete code here



        //Salida datos en consola
        System.out.println();
        System.out.println("El costo final es: " + costoTotal);
        System.out.println("Los puntos generados por la compra son: " + puntosFinales);
        keyboard.close();
    }

}
