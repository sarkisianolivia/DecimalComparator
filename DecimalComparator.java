public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double myFirstNumber, double mySecondNumber) {

        return ((int) (myFirstNumber * 1000)) == ((int) (mySecondNumber * 1000));

        //int myFirstInt = (int) myFirstNumber;
       // int mySecondInt = (int) mySecondNumber;

       // if ((myFirstNumber * 1000) - (mySecondNumber * 1000) == 0)  {
          //  return true;

        //} else {
          //  return false;
       // }



    }
}
