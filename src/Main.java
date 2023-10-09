import MyTime.MyTime1;

public class Main {

    public static void main(String[] args) {

       MyTime1 firstTime = new MyTime1(19,32);
       MyTime1 secondTime = new MyTime1(20,30);
     String timeResult = firstTime.timeAsString();
     String timeResult2 = secondTime.timeAsString();
        System.out.println (timeResult);
        System.out.println(timeResult2);

        }

      /* int year = 2000;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" skudår ");
        }
       else {
            System.out.println("ikke skudår");

        }
*/
    }



