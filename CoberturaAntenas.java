import java.util.Arrays;

public class CoberturaAntenas {

    public static void calcularAntenas(int[] casas, int R) {
        // 1. Ordenar las casas en la línea recta de menor a mayor
        Arrays.sort(casas);

        int cantidadAntenas = 0;
        // Al inicio, no hay ninguna zona cubierta (cobertura total actual hasta -1)
        int limiteCoberturaActual = -1; 

        System.out.println("Antenas colocadas aproximadamente en:");

        for (int i = 0; i < casas.length; i++) {
            // Si la casa actual está fuera de la cobertura de la última antena colocada
            if (casas[i] > limiteCoberturaActual) {
                
                // Colocamos de forma voraz la antena a distancia R a la derecha de esta casa
                int posicionAntena = casas[i] + R;
                System.out.println("- " + posicionAntena);
                cantidadAntenas++;

                // El rango máximo de cobertura de esta nueva antena hacia la derecha es posicion + R
                limiteCoberturaActual = posicionAntena + R;
            }
        }

        System.out.println("Cantidad total: " + cantidadAntenas);
    }

    public static void main(String[] args) {
        System.out.println("--- EJEMPLO 1 ---");
        int[] casas1 = {1, 2, 7, 11, 20, 21, 30};
        calcularAntenas(casas1, 5);

        System.out.println("\n--- EJEMPLO 2 ---");
        int[] casas2 = {2, 4, 8, 15, 18, 22};
        calcularAntenas(casas2, 3);
    }
}