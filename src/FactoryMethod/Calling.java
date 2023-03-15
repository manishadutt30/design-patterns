package FactoryMethod;

import java.util.Calendar;

public class Calling {

    public static void main(String[] args){

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
