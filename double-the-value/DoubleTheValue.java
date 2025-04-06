public class DoubleTheValue {
    public static void main(String[] args) {
        
        int a = 5;
        double b = 10.2;
        
        System.out.println(doubleTheValue(a));
        System.out.println(doubleTheValue(b));
                
    }
    //complete the method for integer value type
    public static int doubleTheValue(int a) {
        int b = (a*2);
        return b;
    }
    //overload the method for double value type
    public static double doubleTheValue(double a) {
        double b = (2*a);
        return b; 
    }
}