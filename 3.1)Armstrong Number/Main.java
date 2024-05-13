import java.util.Scanner;
//407 ==> Armstrong
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int stepNum = 0;
        int headNum;
        int basPow;
        int result = 0;

        int tempNumber = number;
        while(tempNumber != 0){
            tempNumber /= 10;
            stepNum++ ;
        }
        tempNumber = number;
        while (tempNumber != 0){
            headNum = tempNumber % 10;
            basPow = 1;

            for(int i = 1; i <= stepNum; i++){
                basPow *= headNum;
            }
             result += basPow;
            tempNumber /= 10;
        }
        if (result == number){
            System.out.println(number + " sayısı armstrong sayıdır.");
        }else {
            System.out.println(number + " sayısı armstrong sayı degildir.");
        }

    }
}