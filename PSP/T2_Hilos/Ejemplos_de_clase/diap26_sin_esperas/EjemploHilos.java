class EjemploHilos implements Runnable {
    Thread hilo;

    EjemploHilos() throws InterruptedException {
        hilo = new Thread(this, "Ejemplo");
        hilo.start();
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
