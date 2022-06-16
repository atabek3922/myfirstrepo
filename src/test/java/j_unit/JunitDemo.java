package j_unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitDemo {


    @Test
    public void test() {
        System.out.println("This is test");
    }

    public  boolean catDog(String str) {
        int countcat = 0;
        while (str.contains("cat")) {
            str = str.replace("cat", "");
            countcat++;
        }
        int countdog = 0;
        while (str.contains("dog")) {
            str = str.replace("dog", "");
            countdog++;
        }
        if (countcat!= 0 && countdog !=0){
        if (countcat==countdog){
            return true;
        } else {
            return false;
        }
        }
        else {
        return false;
        }
    }
    @Test
    public void testCatDog(){
        String str1 = "catdog";
        boolean expectedValue1 = true;
        String str2 = "catcat";
        boolean expectedValue2 = false;
        String str3 = "1ctat1caddodog";
        boolean expectedValue3 = true;

        Assertions.assertEquals(expectedValue1,catDog(str1));
        Assertions.assertEquals(expectedValue2,catDog(str2));
        Assertions.assertEquals(expectedValue3,catDog(str3));
    }

}

