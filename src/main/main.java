package main;

public class main {

    public static void main (String[] args){

        FizzBuzz fizzBuzz = new FizzBuzz();

        for(int i=1; i<=100;i++){
            if(fizzBuzz.esMultiploDeTresYCinco(i)){
                System.out.println("FizzBuzz");
            } else if (fizzBuzz.esMultiploDeCinco(i)){
                System.out.println("Buzz");
            } else if (fizzBuzz.esMultiploDeTres(i)){
                System.out.println("Fizz");
            } else{
                System.out.println(i);
            }
        }
    }
}
