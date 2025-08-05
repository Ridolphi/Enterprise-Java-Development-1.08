package intlist;

public class IntArrayList implements IntList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public IntArrayList() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newSize = array.length + (array.length / 2); // 50% maior
            int[] newArray = new int[newSize];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + id);
        }
        return array[id];
    }
}