package dk.via.pro2.junit;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample
{
    private ArrayList<Integer> intList;

    public ArrayListExample(Integer[] array)
    {
        this.intList = new ArrayList<>(Arrays.asList(array));
    }

    public void add(int n)
    {
        this.intList.add(n);
    }

    public Object[] getListAsAnArray()
    {
        return this.intList.toArray();
    }
}