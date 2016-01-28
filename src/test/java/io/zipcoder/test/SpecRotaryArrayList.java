package io.zipcoder.test;

/**
 * Created by roberthitchens3 on 1/28/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import io.zipcoder.RotaryArrayList;
public class SpecRotaryArrayList {

    @Test
    public void rotaryArrayTest(){
        RotaryArrayList<Integer> rotato = new RotaryArrayList<Integer>();
        for(int i = 0; i< 8; i++) {
            rotato.add(i);
        }
        RotaryArrayList<Integer> unrotato = (RotaryArrayList<Integer>) rotato.clone();
        rotato.rotate(4);
        assertFalse("rotaryArrayLists should not be equal", rotato.get(0).equals(unrotato.get(0)));
    }
}
