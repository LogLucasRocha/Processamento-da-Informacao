
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class DistanciaEntreDoisPontos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x1, y1, x2, y2, distancia;
        
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        
        distancia = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)),0.5);
        
        System.out.printf("%.4f%n", distancia);
    }
}
