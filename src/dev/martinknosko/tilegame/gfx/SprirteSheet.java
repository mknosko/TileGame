package dev.martinknosko.tilegame.gfx;

import java.awt.image.BufferedImage;

public class SprirteSheet {

    private BufferedImage sheet;

    public SprirteSheet(BufferedImage sheet)
    {
        this.sheet = sheet;
    }

    public BufferedImage crop(int x, int y, int width, int height)
    {
        return sheet.getSubimage(x,y,width,height);
    }

}
