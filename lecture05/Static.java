public class Static {
    
    public static void main(String[] args){

        System.out.println(leapyear(2002)); // what it this? 

    }

    public static boolean leapyear(int year){
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }

}
