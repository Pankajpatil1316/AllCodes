import java.util.*;


public class Demo {

    public static void main(String[] args) {
       // String s = " Pankaj  patil * | patil   pankaj   sdd ";
       // String s = "Hello";
      //  String s = "   | * & ^   ";
        //String s = "Java|Python*C++";
            //    String s = "Test ";
        String s = "java123 python3 go!";

        char[] newString = s.toLowerCase().toCharArray();
        int count=0;
        for(int i=0; i<newString.length-1; i++){

            if(newString[i]>='a'&&newString[i]<='z' && !(newString[i+1]>='a'&&newString[i+1]<='z')){
                count++;
            }
        }

        System.out.println(count);
    }
}
