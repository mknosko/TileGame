package dev.martinknosko.tilegame.State;

import dev.martinknosko.tilegame.gfx.Assets;

import java.awt.*;

public class GameState extends State {

    public GameState()
    {

    }

    @Override
    public void tick()
    {

    }

    @Override
    public void render(Graphics g)
    {
        g.drawImage(Assets.dirtTile, 0, 0, null);
    }

}
