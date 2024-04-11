import org.junit.Test;
import static org.junit.Assert.*;
public class New_MainTest extends New_Main {

    @Test
    public void testTask1() {
        assertEquals("Невірно", New_Main.task1(1));
        assertEquals("Вірно", New_Main.task1(0));
        assertEquals("Невірно", New_Main.task1(-3));
    }

    @Test
    public void testTask2() {
        assertEquals("Вірно", New_Main.task2(1));
        assertEquals("Невірно", New_Main.task2(0));
        assertEquals("Невірно", New_Main.task2(-3));
    }

    @Test
    public void testTask3() {
        assertEquals("Невірно", New_Main.task3(1));
        assertEquals("Невірно", New_Main.task3(0));
        assertEquals("Вірно", New_Main.task3(-3));
    }

    @Test
    public void testTask4() {
        assertEquals("Вірно", New_Main.task4(1));
        assertEquals("Вірно", New_Main.task4(0));
        assertEquals("Невірно", New_Main.task4(-3));
    }

    @Test
    public void testTask5() {
        assertEquals("Невірно", New_Main.task5(1));
        assertEquals("Вірно", New_Main.task5(0));
        assertEquals("Вірно", New_Main.task5(-3));
    }

    @Test
    public void testTask6() {
        assertEquals("Вірно", New_Main.task6(1));
        assertEquals("Невірно", New_Main.task6(0));
        assertEquals("Вірно", New_Main.task6(-3));
    }

    @Test
    public void testTask7() {
        assertEquals("Вірно", New_Main.task7("test"));
        assertEquals("Невірно", New_Main.task7("тест"));
        assertEquals("Невірно", New_Main.task7(3));
    }

    @Test
    public void testTask8() {
        assertEquals("Вірно", New_Main.task8(1));
        assertEquals("Невірно", New_Main.task8(3));
    }

    @Test
    public void testTask9() {
        assertEquals("Вірно", New_Main.task9(true));
        assertEquals("Невірно", New_Main.task9(false));
    }

    @Test
    public void testTask10() {
        assertEquals("Невірно", New_Main.task10(true));
        assertEquals("Вірно", New_Main.task10(false));
    }

    @Test
    public void testTask11() {
        assertEquals("Вірно", New_Main.task11(2));
        assertEquals("Невірно", New_Main.task11(0));
        assertEquals("Невірно", New_Main.task11(-3));
        assertEquals("Невірно", New_Main.task11(5));
    }

    @Test
    public void testTask12() {
        assertEquals(7, New_Main.task12(0));
        assertEquals(9, New_Main.task12(2));
        assertEquals(-3, New_Main.task12(-30));
        assertEquals(0, New_Main.task12(5));
    }

    @Test
    public void testTask13() {
        assertEquals(4, New_Main.task13(1, 3));
        assertEquals(6, New_Main.task13(0, 6));
        assertEquals(3, New_Main.task13(5, 2));
    }

    @Test
    public void testTask14() {
        assertEquals("Невірно", New_Main.task14(100));
        assertEquals("Вірно", New_Main.task14(7));
        assertEquals("Вірно", New_Main.task14(10));
        assertEquals("Невірно", New_Main.task14(14));
    }

    @Test
    public void testTask15() {
        assertEquals("зима", New_Main.task15(1));
        assertEquals("весна", New_Main.task15(2));
        assertEquals("лiто", New_Main.task15(3));
        assertEquals("осiнь", New_Main.task15(4));
        assertEquals("the END????", New_Main.task15(10)); // Перевірка для невідомого коду
    }
}
