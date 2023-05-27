package tareaprograiipoo;

public class CalculadoraEspecial {
  
    public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;

   
    public CalculadoraEspecial(String propietario){
        this.tipoCalculadora="Calculadora Especial";
        this.dimensionPantalla=10;
        this.numeroDeSerie="12345abc";
        this.color="Celeste";
        this.nombrePropietario=propietario;
    }

    public CalculadoraEspecial(){
    }
    
    public double redondear(double numero) {
        return Math.round(numero);
    }
    
    public double seno(double numero) {
        return Math.sin(Math.toRadians(numero));
    }

    public double valorAleatorio() {
        return Math.random();
    }

    public double tangente(double numero) {
        return Math.tan(Math.toRadians(numero));
    }
    
    public int Factorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double coseno(double numero) {
        return Math.cos(Math.toRadians(numero));
    }
}

