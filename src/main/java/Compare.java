public class Compare <T extends Comparable<T>> implements Comparable<Compare<T>> {

    T firstObject;
    T secondObject;
    T thirdObject;

    public Compare(T firstObject, T secondObject, T thirdObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
        this.thirdObject = thirdObject;
    }

    public T getFirstObject() {
        return firstObject;
    }

    public Compare<T> setFirstObject(T firstObject) {
        this.firstObject = firstObject;
        return this;
    }

    public T getSecondObject() {
        return secondObject;
    }

    public Compare<T> setSecondObject(T secondObject) {
        this.secondObject = secondObject;
        return this;
    }

    public T getThirdObject() {
        return thirdObject;
    }

    public Compare<T> setThirdObject(T thirdObject) {
        this.thirdObject = thirdObject;
        return this;
    }

    @Override
    public int compareTo(Compare<T> o) {
        return (firstObject.compareTo(o.firstObject) + secondObject.compareTo(o.secondObject)
                + thirdObject.compareTo(o.thirdObject)) / 3;
    }
}
