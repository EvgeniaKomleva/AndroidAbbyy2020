import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Реализовать итератор над массивом.
 * Массив принимается в конструктор.
 * Итерация должна начинаться с первого элемента.
 * hasNext возвращает true, если итератор может вернуть следующее значение.
 * next должен возвращать следующее значение.(с переходом на следующий элемент)
 */
class ArrayIterator<T> implements Iterator<T> {

    private int cur_index;
    private final T[] array_;


    public ArrayIterator(T[] array) {
        this.cur_index = 0;
        this.array_ = array;
    }

    //@Override
    public boolean hasNext() {
        return array_.length > cur_index;
    }

    //@Override
    public T next() {
        // Если следующего значения нет, то надо бросить NoSuchElementException
        if (cur_index >= array_.length) {
            throw new NoSuchElementException();
        }
        return array_[cur_index++];
    }
}
