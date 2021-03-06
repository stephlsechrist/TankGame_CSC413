package dev.tankgame.states;

import dev.tankgame.Handler;
import dev.tankgame.graphics.Assets;

import java.awt.*;

public class OverState extends State {
    public OverState(Handler handler) {
        super(handler);
    }

    @Override
    public void tick() {
//        if(handler.getTankControl1().space)
//            State.setState(handler.getGame().overState);
    }

    @Override
    public void render(Graphics g) {
        handler.getWorld().render(g);
        g.drawImage(Assets.end, handler.getGame().getHeight()/4, handler.getGame().getWidth()/4, null);
        if (handler.getTankControl1().exit)
            System.exit(0);
    }
}
