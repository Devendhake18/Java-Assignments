package Assignment_01_part2;
import java.util.Scanner;
public class Calculator {

    Scanner sc = new Scanner(System.in);

    public double addition(double n1, double n2) {

        return n1 + n2;
    }

    public double subtract(double n1,double n2){
        return n1-n2;
    }

    public double multiply(double n1,double n2){
        return n1+n2;
    }

    public double divide(double n1, double n2){
        if(n2!=0){
            return n1/n2;
        } else{
            System.out.println("Cannot divide this");
            return Double.NaN;
        }
    }

    public double sqrt(double n1){
        return Math.sqrt(n1);
    }

    public double power(double base,double exponent){

        return Math.pow(base,exponent);
    }

    public double mean(double[] nums)
    {
        int count = 0;
        double sum = 0;

        for (int i=0; i < nums.length; i++)
        {
            if (nums[count] != 0.0)
            {
                sum = sum + nums[count];
                count++; }
        }
        double result = sum/count;
        return result;
    }
    public double variance(double[] nums)
    {
        int count = 0;
        double var = 0;

        double mean = mean(nums);

        for (int i=0; i < nums.length; i++)
        {
            if (nums[count] != 0.0)
            {
                double sub = nums[count] - mean;
                var += power(sub,2.0);
                count++;
            }
        }
        var = var/(count-1);

        return var;
    }


}
