import java.util.Scanner;

public class areacirculo {
    public static void main(String[] args) {
 
       double area, r, n =3.14159;
       Scanner s = new Scanner(System.in);
      
       r = s.nextDouble();
       
       area = r*r*n;
       System.out.printf("A=%.4f\n", area);
    
       s.close();
    }
}