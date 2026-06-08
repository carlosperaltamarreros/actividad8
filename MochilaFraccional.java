public class MochilaFraccional {

    public static void resolverMochila(String[] nombres, double[] valores, double[] pesos, double capacidad) {
        int n = nombres.length;
        double[] ratios = new double[n];

        // 1. Calcular la relación valor/peso para cada objeto
        for (int i = 0; i < n; i++) {
            ratios[i] = valores[i] / pesos[i];
        }

    
    }

    public static void main(String[] args) {
        System.out.println("--- EJEMPLO 1 ---");
        String[] nombres1 = {"A", "B", "C"};
        double[] valores1 = {60, 100, 120};
        double[] pesos1 = {10, 20, 30};
        resolverMochila(nombres1, valores1, pesos1, 50);

        System.out.println("\n--- EJEMPLO 2 ---");
        String[] nombres2 = {"A", "B", "C"};
        double[] valores2 = {80, 100, 120};
        double[] pesos2 = {20, 10, 30};
        resolverMochila(nombres2, valores2, pesos2, 25);
    }
}