import java.util.Arrays;

public class Calc {
    //Tdd - Test driven development

    //write a test case and make it fail the first part
    //implement the code to make the first one
    //refactor the code
    // - Red, Green , Refactor


    public double add(double x, double y) {
        return x + y;
    }

    public double calculateAreaOfCircle(double radius) {
        // PI + R * R
        return Math.ceil(Math.PI * radius * radius);
    }

    public Double checkIfParameterIsNull(Double number) {
        if (number != null) {
            return number;
        }
        return null;
    }

    public boolean isGreater(int x, int y) {
        if (x > y) {
            return true;
        }
        return false;
    }

    public int[] mutiplyArrayElementsByNumberGiven(int[] array, int number){

            for(int i = 0; i < array.length; i++){
               array[i] = array[i] * number;
            }
        return array;
    }

    public int finMin(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > Math.min(arr[i],arr[i])){
                return i;
            }
        }
        return 0;
    }

}