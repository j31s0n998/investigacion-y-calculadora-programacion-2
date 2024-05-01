
package holamundo;


public class Calculadora {

   
    public double sumar(double... numeros) {
        double resultado = 0; 
        for (int i = 0; i < numeros.length; i++) { 
            resultado += numeros[i];
        }
        return resultado; 
    }

   
    public double restar(double... numeros) {
        if (numeros.length == 0) { 
            throw new IllegalArgumentException("Debe haber al menos un número para restar");
        }
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) { 
            resultado -= numeros[i];
        }
        return resultado; 
    }

    public double multiplicar(double... numeros) {
        double resultado = 1; 
        for (int i = 0; i < numeros.length; i++) { 
            resultado *= numeros[i];
        }
        return resultado; 
    }

    public double dividir(double... numeros) throws ArithmeticException {
        if (numeros.length == 0) { 
            throw new IllegalArgumentException("Debe haber al menos un número para dividir");
        }
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) { 
            if (numeros[i] == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            resultado /= numeros[i];
        }
        return resultado; 
    }

    
}