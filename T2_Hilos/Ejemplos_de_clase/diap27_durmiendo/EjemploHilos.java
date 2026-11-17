class EjemploHilos implements Runnable {
    Thread hilo;

    EjemploHilos() throws InterruptedException {
        hilo = new Thread(this, "Ejemplo");
        hilo.start();
        Thread.sleep(5);     // duerme al hilo que ejecuta esta línea: el main
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.print("Y");
        }
    }

    public static void main(String[] args)
            throws InterruptedException {
        EjemploHilos t = new EjemploHilos();
        for (int i = 0; i < 10000; i++) {
            System.out.print("X");
        }
    }
}
