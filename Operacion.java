
package holamundo;

public class Operacion {
    public static final String SUMA = "suma";
    public static final String RESTA = "resta";
    public static final String MULTIPLICACION = "multiplicacion";
    public static final String DIVISION = "division";

    private String tipo; // El tipo de operación como cadena
    private double operando1; // Primer operando
    private double operando2; // Segundo operando
    private double resultado; // Resultado de la operación

    // Constructor para inicializar la operación
    public Operacion(String tipo, double operando1, double operando2) {
        this.tipo = tipo;
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = realizarOperacion(); // Calcula el resultado
    }

    public Operacion(String tipo, double operando1) {
        this.tipo = tipo;
        this.operando1 = operando1;
        this.resultado = realizarOperacion(); // Calcula el resultado
    }

    // Método para ejecutar la operación según el tipo
    private double realizarOperacion() {
        switch (tipo.toLowerCase()) {
            case SUMA:
                return operando1 + operando2;
            case RESTA:
                return operando1 - operando2;
            case MULTIPLICACION:
                return operando1 * operando2;
            case DIVISION:
                if (operando2 == 0) {
                    throw new ArithmeticException("No se puede dividir por cero");
                }
                return operando1 / operando2;
         
            default:
                throw new IllegalArgumentException("Tipo de operación no válido");
        }
    }

    // Métodos de acceso (getters)
    public String getTipo() {
        return tipo;
    }

    public double getOperando1() {
        return operando1;
    }

    public double getResultado() {
        return resultado;
    }
}  

