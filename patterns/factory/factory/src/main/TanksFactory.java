package main;

import java.io.IOException;

abstract class Tanks{}
class Heavy extends Tanks{}
class Medium extends Tanks{}
class Light extends Tanks{}
class Destroyer extends Tanks{}
class Artillery extends Tanks{}

public class TanksFactory {
    public static Tanks createTanks(TanksType tanksType) throws IOException {
        switch(tanksType)
        {
            case Heavy:
                return new Heavy();
            case Medium:
                return new Heavy();
            case Light:
                return new Heavy();
            case Destroyer:
                return new Heavy();
            case Artillery:
                return new Heavy();
            default:
                throw new IOException();
        }
    }

    public static void main(String[] args) throws IOException {
        Tanks tank = TanksFactory.createTanks(TanksType.Medium);
    }
}