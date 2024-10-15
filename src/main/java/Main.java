public class Main {

    public static void main(String[] args) {
        CajeroMayor cajeromayor = new CajeroMayor("1234564aa", 1234, 700000);


        public void retiro ( int monto){
            if (monto > cajeromayor.getLimite()) {
                System.out.println("el monto solicitado excede el limite");
            } else {
                System.out.println("Retirando $" + monto);
            }
        }
        cajeromayor.retiro(20000);
        System.out.println("Numero Tarjeta " + cajeromayor.getLimite());
        System.out.println("Clave " + cajeromayor.getLimite());
        System.out.println("Monto a retirar " + cajeromayor);
    }
}

