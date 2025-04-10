package dk.via.pro2.junit;//package junit;

import dk.via.pro2.junit.ArrayListExample;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListExampleTest
{
    private ArrayListExample arraylistExample;
    @BeforeEach
    void setUP()
    {
        System.out.println(this.getClass().getName()+ ">>> setting up ...");
        Integer array[] = {1,2,3,4,5};
        arraylistExample = new ArrayListExample(array);
    }

    @Test
    public void add_test()
    {
        arraylistExample.add(10);
        assertArrayEquals(new Integer[]{1,2,3,4,5,10}, arraylistExample.getListAsAnArray());
    }
}
