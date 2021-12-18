package by.ushanov.rectangl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    Rectangle testRectangle = new Rectangle();

    @Before
    public void setUp() throws Exception {

        testRectangle = new Rectangle();
    }

    @After
    public void tearDown() throws Exception {
        testRectangle = null;
    }

    @Test
    public void areaCalculator() {
        Rectangle rec = new Rectangle();
       assertEquals(!(rec.side1 <= 0), rec.side1, rec.side2);
    }

    @Test
    public void perimeterCalculator() {
        Rectangle rec = new Rectangle();
        assertEquals(!(rec.side1 <= 0), rec.side1, rec.side2);
    }

    private void assertEquals(boolean b, double side1, double side2) {

    }

    @Test
    public void viewResult() {

    }
}