import java.util.Collection;
import java.util.HashSet;

public class Task01 {

    /**
     * Реализуйте метод, который возвращает новую коллекцию,
     * но уже без дубликатов.
     * Дубликаты, если equals true.
     */
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        Set<T> h_set = new HashSet<T>(collection);
        collection.clear();
        collection.addAll(h_set);
        
        return collection;
    }

}
