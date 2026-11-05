public class BonoFijo implements EstrategiaDescuento{
    private double montoMinimo;
    private double valorDescuento;
    public double aplicar(double subtotal){
        if (subtotal>=150000){
            return subtotal-20000;
        }
        return subtotal;
    }
}