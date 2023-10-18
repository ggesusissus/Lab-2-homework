import java.math.BigDecimal;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task2();
        task3();
        task4();
        task5();
    }
        public static void task2()
        {
            float earthWeightIatsuk = 80.0f;
            float marsGravityIastuk = 0.38f;
            // calculating a mars weight
            double marsWeightIastuk = earthWeightIatsuk * marsGravityIastuk;
            // printing mars weight with 4 decimal places
            System.out.printf("Your weight on Mars is: %.4f", marsWeightIastuk);
            // Casting double to an int
            int marsWeightInt = (int) marsWeightIastuk;
            // casting int to char
            char marsWeightChar = (char) marsWeightInt;
            // calculation on char
            int IntVariable = marsWeightChar + 1;
        }
        public  static  void task3()
        {
            // creating new random
            Random Random = new Random();
            // creating new number for Random Num
            int RandomNum = Random.nextInt(1,100);
            System.out.println("\nRandomNumber: " + RandomNum);
            // cheking if random num is odd or even
            if (RandomNum % 2 == 0)
            {System.out.println(RandomNum + " is an even number.");}
            else {System.out.println(RandomNum + " is an odd number.");
            }


        }
    public  static  void task4()
    {
        int Bricks = 54;
        System.out.println("Amount of bricks: " + Bricks);
        int containerCap = 8;
        System.out.println("Cap of containers: " + containerCap);
        // calculation on full containers
        int fullContainers = Bricks / containerCap;
        System.out.println(" fullContainers: " + fullContainers);
        // calculation on total containers
        int totalContainers = (Bricks + containerCap - 1);
        System.out.println(" totalContainers: " + totalContainers);
        // calculation on remaningblocks
        int remainingBlocks = Bricks % containerCap;
        System.out.println("last container has " + remainingBlocks + " blocks.");


    }
    public  static  void task5() {
        BigDecimal Cost = new BigDecimal("9.99");
        BigDecimal vat = new BigDecimal("0.23");
        // adding vat to cost
        BigDecimal grossValue = Cost.add(Cost.multiply(vat));
        System.out.println("Value including VAT:  " + grossValue);
        // total revenue on 10000 sales
        BigDecimal quantity = new BigDecimal("10000");
        BigDecimal totalRevenue = grossValue.multiply(quantity);
        System.out.println("totalRevenue: " + totalRevenue);
        // calculating without vat
        BigDecimal minusVAT = Cost.multiply(quantity);
        System.out.println("Value without vat: " + minusVAT);
        //

    }

}