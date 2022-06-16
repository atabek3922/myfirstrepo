package javafaker;

import com.github.javafaker.Faker;

public class Demo {

   protected static Faker faker = new Faker();
    public static void main(String[] args) {
        System.out.println(generatorFakeFirstName());
        System.out.println(generatorFakeLastName());
        System.out.println(generatorFakeEmailaddress());
        System.out.println(generateFunnyWords());

    }
    public static String generatorFakeFirstName(){

        return "Hello my name is: " + faker.name().firstName();

    }
    public static String generatorFakeLastName(){

        return "My last name is " + faker.name().lastName();
    }
    public static String generatorFakeEmailaddress(){

        return "Email: " + faker.internet().emailAddress();
    }
    public static String generateFunnyWords(){
        return faker.artist().name();
    }

}
