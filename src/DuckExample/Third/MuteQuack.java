package DuckExample.Third;


public class MuteQuack implements QuackInterface{
    @Override
    public void quack() {
        System.out.println("Duck is mute");
    }
}
