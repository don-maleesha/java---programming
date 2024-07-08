public class TypeConversion{
    public static void main(String[] args){
        //convert byte into int
        byte number=8;
        int intNumber=number;
        System.out.println(intNumber);

       //convert int into byte (dataloss)
        int value=128;
        byte bvalue=(byte) value;
        System.out.println(bvalue);

        //convert double into int
        double v=34.56;
        int i=(int) v;
        System.out.println(i);

        int x=15;
        int y=8;
        double z=x/y;
        System.out.println(z);

        //get a double answer by getting values of x and y as double values
         x=15;
         y=8;
         z=(double)x/(double)y;
        System.out.println(z);
    }
}