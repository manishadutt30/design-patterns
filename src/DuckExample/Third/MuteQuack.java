package DuckExample.Third;


public class MuteQuack implements QuackInterface{

    public MuteQuack(){

    }
    @Override
    public void quack() {
        System.out.println("Duck is mute");
    }
}
