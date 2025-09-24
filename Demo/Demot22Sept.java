package Demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Demot22Sept {
    public static void main(String[] args) {

        int a = 0;

        do{
            //System.out.println(a);
            if(a%2 == 0){
                System.out.printf("%d est un nom pair!%n", a);
            }
            a++;
        }while(a<20);
        

    }
}
