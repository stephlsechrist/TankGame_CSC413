package dev.tankgame.states;

import dev.tankgame.Game;
import dev.tankgame.Handler;
import dev.tankgame.graphics.Assets;

import java.awt.*;

public class IntroState extends State{
    public IntroState(Handler handler){
        super(handler);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.intro, 300, 300, null);
    }
}
