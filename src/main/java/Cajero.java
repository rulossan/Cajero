public abstract class Cajero {
    private String numerotarjeta;
    private int clave;


    //METODOS CONSTRUCTOR
    public Cajero(String numerotarjeta,int clave){
        this.numerotarjeta = numerotarjeta;
        this.clave = clave;

    }

    //CREAR LOS METODOS GET Y SET
    public String getNumerotarjeta(){
        return numerotarjeta;
    }

    public int getClave() {
        return clave;
    }

    public void setNumerotarjeta(String numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    //METODO VALIDAR SIN PARAMETROS QUE MUESTRE EL MENSAJE
    public void Validar(){
        System.out.println("Tarjeta validada");
    }

    //SOBRECARGANDO EL METODO PARA INGRESAR LA CLAVE
    public void validar (int claveingresada){
        if(claveingresada == clave){
            System.out.println("Clave correcta, tarjeta correcta");
        }else{
            System.out.println("Clave incorrecta");
        }
    }

    //CREO EL METODO PARA RETIROS
    public void retiro (int monto){
        System.out.println("Retiro realizado" + monto);
    }

    //SOBRECARGA METODO RETIRO
    public void retiro(String numerotarjeta, int monto){
        System.out.println("Estas retirando" + monto + "de la cuenta " + numerotarjeta);
    }

    //OTRA SOBRECARGA AL METODO RETIRAR
    public void retiro(int monto,String mensaje){
        System.out.println(mensaje + "retirando" + monto);

    }

    public abstract void retiro(int monto);
}


