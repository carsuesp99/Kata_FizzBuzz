package main;

public class FizzBuzz {

    public String imprimir(int i){

        if(esMultiploDeTres(i) && esMultiploDeCinco(i)){
            return "FizzBuzz";
        }
        if(esMultiploDeCinco(i)){
            return "Buzz";
        }
        if(esMultiploDeTres(i)){
            return "Fizz";
        }

        return String.valueOf(i);
    }

    public boolean esMultiploDeTres(int i){
        return i % 3 == 0;
    }

    public boolean esMultiploDeCinco(int i){
        return i % 5 == 0;
    }


}
