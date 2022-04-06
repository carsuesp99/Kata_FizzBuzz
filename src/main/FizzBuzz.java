package main;

public class FizzBuzz {

    public String imprimir(int numero){

        if(esMultiploDeTres(numero) && esMultiploDeCinco(numero)){
            return "FizzBuzz";
        }
        if(esMultiploDeCinco(numero) || contieneElCinco(numero)){
            return "Buzz";
        }
        if(esMultiploDeTres(numero) || contieneElTres(numero)){
            return "Fizz";
        }

        return String.valueOf(numero);
    }

    public boolean esMultiploDeTres(int numero){
        return numero % 3 == 0;
    }

    public boolean esMultiploDeCinco(int numero){
        return numero % 5 == 0;
    }

    public boolean contieneElTres(int numero){
        String numeroParseado = Integer.toString(numero);
        if(numeroParseado.contains("3")){
            return true;
        }
        return false;
    }

    public boolean contieneElCinco(int numero){
        String numeroParseado = Integer.toString(numero);
        if(numeroParseado.contains("5")){
            return true;
        }
        return false;
    }


}
