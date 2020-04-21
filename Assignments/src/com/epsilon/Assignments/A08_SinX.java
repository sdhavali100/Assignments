package src.com.epsilon.Assignments;

public class A08_SinX {

    public static int factorial(int a){
        int fact = 1;
        for(int i=a;i>0;i--){
            fact*=i;
        }
        return fact;
    }

    public static void main(String [] args) {
        int n=10;
        double sinX = 0.0f;
        double x= (180*Math.PI)/180;
        for( int i=0;i<n;i++)
        {
                sinX+=(Math.pow(-1,i)*Math.pow(x,2*i+1))/factorial(2*i+1);
        }
        System.out.println("Sin 30 = " +sinX);
    }
}
