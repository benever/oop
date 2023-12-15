package main;

class Heavy {}
class Medium {}
class Light {}

class ChinaHeavy extends Heavy{}
class ChinaMedium extends Medium{}
class ChinaLight extends Light{}

class RussianHeavy extends Heavy{}
class RussianMedium extends Medium{}
class RussianLight extends Light{}

abstract class Army {
    public abstract Heavy createHeavy();

    public abstract Medium createMedium();

    public abstract Light createLight();
}
class ChinaArmy extends Army {
    public Heavy createHeavy() {
        return new ChinaHeavy();
    }

    public Medium createMedium() {
        return new ChinaMedium();
    }

    public Light createLight() {
        return new ChinaLight();
    }
}

class RussianArmy extends Army {
    public Heavy createHeavy() {
        return new RussianHeavy();
    }

    public Medium createMedium() {
        return new RussianMedium();
    }

    public Light createLight() {
        return new RussianLight();
    }
}