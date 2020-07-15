package lt.verbus;

public class SuperPair<T, E, N extends Number> {
    T parameter1;
    E parameter2;
    N parameter3;

    public SuperPair(T parameter1, E parameter2, N parameter3) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.parameter3 = parameter3;
    }

}
