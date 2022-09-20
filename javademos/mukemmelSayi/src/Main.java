public class Main {
    public static void main(String[] args) {
        int number = 20;

        int total = 0;

        for (int i=1; i<number ;i= i+1){
            if(number % i == 0){
                total = total + i;
            }
        }
        if(total == number){
            System.out.println("Mükemmel sayıdır");
        }else{
            System.out.println("Mükemmel sayı değildir");
        }
    }
}