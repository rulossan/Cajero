public class CajeroMayor extends Cajero {

    //ATRIBUTO PROPIO
    private int limite;

    //METODO CONSTRUCTOR
    public CajeroMayor(String Numerotarjeta, int clave, int limite) {
        super(Numerotarjeta, clave);
        this.limite = limite;
    }

    //METODO GET
    public int getLimite() {
        return limite;
    }
    @Override
    public void retiro(int monto) {
        if (monto > limite) {
            System.out.println("excede el capital limite");
        } else {
            System.out.println("retirando $" + monto);
        }
    }

    //METODO SET
    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void transferencia(int monto) {
        System.out.println("Transfiriendo " + monto);

    }

}
