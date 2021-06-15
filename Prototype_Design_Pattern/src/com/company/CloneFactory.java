package com.company;

public class CloneFactory {
    public Game getClone(Game game) throws CloneNotSupportedException {
    return game.makeCopy();
    }
}
