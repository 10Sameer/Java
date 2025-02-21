//swap a number 
public class swapNumber{

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        x= x+y;
        y= x-y;
        x= x-y;
        System.out.println("After Swaping, The value of a= "+ x + " " +"and The value of b= " + y);
    }
    
}
//output: after swap, a= 20 and b= 10
