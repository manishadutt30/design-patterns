package FactoryMethod;

public class TEST {

    private static int counter = 0;

    void TEST(){
        counter = 10;
    }

    TEST(int x){
        counter = x;
    }

    public static void main(String[] args){
        TEST TEST = new TEST(10);
    }
}
