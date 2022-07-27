package innerCls;
import java.util.*;
class Outer {
    class Inner {
        public void show()
        {
            System.out.println("In a nested class method");
        }
    }
}
     
    public class InnerClassN {
            	
                public static void main(String[] args)
                {
     
                    Outer.Inner in = new Outer().new Inner();
             
                    in.show();
                }
            }
        
    //nested class


