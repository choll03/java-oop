package programmer.zaman.now.data;

public interface Car extends HasBrand, IsMaintaince {

    void drive();

    int getTired();

    default boolean isBig() {
        return false;
    };
}
