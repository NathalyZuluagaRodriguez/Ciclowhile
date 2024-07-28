
public class CicloWhileSeg {
    public static void main(String[] args) {
        int numero = 1;
        int suma = 0;

        while (numero <= 5) {
            suma += numero;
            numero++;
        }

        System.out.println("La suma de los primeros 5 números naturales es: " + suma);
    }

}
