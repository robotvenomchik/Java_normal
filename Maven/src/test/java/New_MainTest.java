import org.junit.Test;
import static org.junit.Assert.*;
public class New_MainTest extends New_Main {

    @Test
    public void testTask1Zero() {
        assertEquals("Вірно", New_Main.task1(0));
    }

    @Test
    public void testTask1NonZero() {
        assertEquals("Невірно", New_Main.task1(5));
    }

    @Test
    public void testTask2PositiveNumber() {
        assertEquals("Вірно", New_Main.task2(5));
    }

    @Test
    public void testTask2NegativeNumber() {
        assertEquals("Невірно", New_Main.task2(-5));
    }

    @Test
    public void testTask3NegativeNumber() {
        assertEquals("Вірно", New_Main.task3(-5));
    }

    @Test
    public void testTask3PositiveNumber() {
        assertEquals("Невірно", New_Main.task3(5));
    }

    @Test
    public void testTask4PositiveNumber() {
        assertEquals("Вірно", New_Main.task4(5));
    }

    @Test
    public void testTask4NegativeNumber() {
        assertEquals("Невірно", New_Main.task4(-5));
    }

    @Test
    public void testTask5NegativeNumber() {
        assertEquals("Вірно", New_Main.task5(0));
    }

    @Test
    public void testTask5PositiveNumber() {
        assertEquals("Невірно", New_Main.task5(5));
    }

    @Test
    public void testTask6Negative() {
        assertEquals("Вірно", New_Main.task6(-3));
    }

    @Test
    public void testTask6Zero() {
        assertEquals("Невірно", New_Main.task6(0));
    }

    @Test
    public void testTask7() {
        assertEquals("Вірно", New_Main.task7("test"));
    }

    @Test
    public void testTask7WordFromPepa() {
        assertEquals("Невірно", New_Main.task7("peoa"));
    }

    @Test
    public void testTask7Integer() {
        assertEquals("Невірно", New_Main.task7(3));
    }

    @Test
    public void testTask8() {
        assertEquals("Вірно", New_Main.task8(1));
    }

    @Test
    public void testTask8NonOne() {
        assertEquals("Невірно", New_Main.task8(3));
    }

    @Test
    public void testTask9() {
        assertEquals("Вірно", New_Main.task9(true));
    }

    @Test
    public void testTask9False() {
        assertEquals("Невірно", New_Main.task9(false));
    }

    @Test
    public void testTask10False() {
        assertEquals("Невірно", New_Main.task10(true));
    }

    @Test
    public void testTask10True() {
        assertEquals("Вірно", New_Main.task10(false));
    }

    @Test
    public void testTask11InRange() {
        assertEquals("Вірно", New_Main.task11(3));
    }

    @Test
    public void testTask11OutOfRange() {
        assertEquals("Невірно", New_Main.task11(6));
    }

    @Test
    public void testTask12Zero() {
        assertEquals(7, (long)New_Main.task12(70));
    }

    @Test
    public void testTask12Two() {
        assertEquals(9, (long)New_Main.task12(2));
    }

    @Test
    public void testTask12NonZeroNonTwo() {
        assertEquals(5, (long)New_Main.task12(50));
    }

    @Test
    public void testTask13Case1() {
        assertEquals(4, (long)New_Main.task13(1, 3));
    }

    @Test
    public void testTask13Case2() {
        assertEquals(3, (long)New_Main.task13(5, 2));
    }

    @Test
    public void testTask14InRange1() {
        assertEquals("Вірно", New_Main.task14(8));
    }

    @Test
    public void testTask14InRange2() {
        assertEquals("Вірно", New_Main.task14(10));
    }

    @Test
    public void testTask14OutOfRange() {
        assertEquals("Невірно", New_Main.task14(14));
    }

    @Test
    public void testTask15Winter() {
        assertEquals("зима", New_Main.task15(1));
    }

    @Test
    public void testTask15Spring() {
        assertEquals("весна", New_Main.task15(2));
    }

    @Test
    public void testTask15Summer() {
        assertEquals("лiто", New_Main.task15(3));
    }

    @Test
    public void testTask15Autumn() {
        assertEquals("осiнь", New_Main.task15(4));
    }

    @Test
    public void testTask15Default() {
        assertEquals("the END????", New_Main.task15(0));
    }

    @Test
    public void testFibonacciNormal() {
        assertEquals(5, New_Main.fib(5));
    }

    @Test
    public void testFibonacci2Normal() {
        assertEquals(5, New_Main.fib2(5));
    }

    @Test
    public void testTask1Null() {
        assertEquals("Невірно", New_Main.task1(null));
    }

    @Test
    public void testTask2Null() {
        assertEquals("Невірно", New_Main.task2(null));
    }

    @Test
    public void testTask3Null() {
        assertEquals("Невірно", New_Main.task3(null));
    }

    @Test
    public void testTask4Null() {
        assertEquals("Невірно", New_Main.task4(null));
    }

    @Test
    public void testTask5Null() {
        assertEquals("Невірно", New_Main.task5(null));
    }

    @Test
    public void testTask6Null() {
        assertEquals("Невірно", New_Main.task6(null));
    }

    @Test
    public void testTask7Null() {
        assertEquals("Невірно", New_Main.task7(null));
    }

    @Test
    public void testTask8Null() {
        assertEquals("Невірно", New_Main.task8(null));
    }

    @Test
    public void testTask9Null() {
        assertEquals("Невірно", New_Main.task9(null));
    }

    @Test
    public void testTask10Null() {
        assertEquals("Невірно", New_Main.task10(null));
    }

    @Test
    public void testTask11Null() {
        assertEquals("Невірно", New_Main.task11(null));
    }

    @Test
    public void testTask12Null() {
        assertEquals(0, (long) New_Main.task12(null));
    }

    @Test
    public void testTask13FirstParamNull() {
        assertEquals(0, (long) New_Main.task13(null, 3));
    }

    @Test
    public void testTask13SecondParamNull() {
        assertEquals(0, (long) New_Main.task13(1, null));
    }

    @Test
    public void testTask13BothParamsNull() {
        assertEquals(0, (long) New_Main.task13(null, null));
    }

    @Test
    public void testTask14Null() {
        assertEquals("Невірно", New_Main.task14(null));
    }

    @Test
    public void testTask15Null() {
        assertEquals("Невірно", New_Main.task15(null));
    }

    @Test
    public void testFibonacciNull() {
        assertEquals(0, New_Main.fib(null));
    }

    @Test
    public void testFibonacci2Null() {
        assertEquals(0, New_Main.fib2(null));
    }

}
