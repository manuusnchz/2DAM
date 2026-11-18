public class RecursosCompartidos {
    static int variable = 0;

    static class Sumador extends Thread {
        int aumento;

        Sumador(int n) {
            aumento = n;
        }

        @Override
        public void run() {
            for (int i = 0; i < aumento; i++) {
                int aux = variable;
                aux = aux + 1;
                variable = aux;
            }
        }
    }

    static class Restador extends Thread {
        int aumento;

        Restador(int n) {
            aumento = n;
        }

        @Override
        public void run() {
            for (int i = 0; i < aumento; i++) {
                int aux = variable;
                aux = aux - 1;
                variable = aux;
            }
        }
    }

    public static void main(String[] args)
            throws InterruptedException {
        Sumador c1 = new Sumador(1000000);
        Restador c2 = new Restador(1000000);

        c1.start();
        c2.start();
        c1.join();      // esperamos a los dos hilos
        c2.join();      // antes de mirar el resultado
        System.out.println("Contador: " + variable);
    }
}
