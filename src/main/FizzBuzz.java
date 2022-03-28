package main;

public class FizzBuzz {

    public boolean esMultiploDeTres(int n){

        if(n % 3 == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean esMultiploDeCinco(int n){

        if(n % 5 == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean esMultiploDeTresYCinco(int i){

        if(esMultiploDeTres(i) && esMultiploDeCinco(i)){
            return true;
        } else {
            return false;
        }
    }
}
