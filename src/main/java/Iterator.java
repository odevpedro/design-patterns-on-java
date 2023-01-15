public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();

//implements Iterator<String> T : String
// implements Iterator<User> T : User
}
