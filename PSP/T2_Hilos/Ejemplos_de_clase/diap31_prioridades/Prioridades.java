class HiloContador extends Thread {
    String nombre;

    public HiloContador(String n) {
        super();
        nombre = n;
    }

    @Override
    public void run() {
        int cont = 0;
        while (cont < 100) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("   " + nombre + ":" + cont);
            cont++;
        }
    }
}

public class Prioridades {
    public static void main(String[] args) {
        HiloContador h1 = new HiloContador("hilo1");
        h1.setPriority(10);
        HiloContador h2 = new HiloContador("hilo2");
        h2.setPriority(1);
        h2.start();
        h1.start();
    }
}
