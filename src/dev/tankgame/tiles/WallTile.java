package dev.tankgame.tiles;

import dev.tankgame.graphics.Assets;

public class WallTile extends Tile {

    public WallTile(int id){
        super(Assets.wall, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
