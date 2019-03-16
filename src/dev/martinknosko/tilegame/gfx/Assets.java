package dev.martinknosko.tilegame.gfx;


import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 32, height = 32;

    public static BufferedImage player, dirtTile, grassTile, stoneTile, treeTile;

    public static void init()
    {
        SprirteSheet sheet = new SprirteSheet(ImageLoader.loadImage("/textures/grid_texture.jpg"));

        player = sheet.crop(0,0, width, height);
        dirtTile = sheet.crop(width, 0, width, height);
        grassTile = sheet.crop(width * 2, 0, width, height);
        stoneTile = sheet.crop(width * 3, 0, width, height);
        treeTile = sheet.crop(0, height, width, height);
    }

}
