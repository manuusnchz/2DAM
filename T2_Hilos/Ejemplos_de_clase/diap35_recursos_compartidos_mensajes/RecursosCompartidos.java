public class RecursosCompartidos {
    static int variable = 5;

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
                System.out.println("Suma contador(" + i + "): "
                        + variable);
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
                System.out.println("Resta contador(" + i + "): "
                        + variable);
            }
        }
    }

    public static void main(String[] args)
            throws InterruptedException {
        Sumador c1 = new Sumador(3);
        Restador c2 = new Restador(4);

        c1.start();
        c2.start();
        c1.join();      // esperamos a los dos hilos
        c2.join();      // antes de mirar el resultado
        System.out.println("Final contador: " + variable);
    }
}
