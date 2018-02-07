import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class VectorsTest {

    public VectorsTest() {
    }

    @BeforeClass // метод инициализатора теста
    public static void setUpClass() throws Exception {
    }

    @AfterClass // метод финализатора теста
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of equal method, of class Vectors.
     * В этом тесте используются методы JUnit assertTrue и assertFalse
     * для тестирования всех возможных результатов.
     * Для успешного прохождения теста утверждения assertTrue должны быть истинными,
     * а assertFalse – ложными.
     * Для охвата возможных перестановок нужно добавить
     * достаточное количество утверждений.
     */
    @Test
    public void equalsCheck() {
        System.out.println("* VectorsTest: equalsCheck()");
        assertTrue(Vectors.equal(new int[]{}, new int[]{}));
        assertTrue(Vectors.equal(new int[]{0}, new int[]{0}));
        assertTrue(Vectors.equal(new int[]{0, 0}, new int[]{0, 0}));
        assertTrue(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 0, 0}));
        assertTrue(Vectors.equal(new int[]{5, 6, 7}, new int[]{5, 6, 7}));

        assertFalse(Vectors.equal(new int[]{}, new int[]{0}));
        assertFalse(Vectors.equal(new int[]{0}, new int[]{0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0}, new int[]{0, 0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0}, new int[]{0}));
        assertFalse(Vectors.equal(new int[]{0}, new int[]{}));

    }

    /**
     * Test of scalarMultiplication method, of class Vectors.
     * С помощью метода assertEquals (EXPECTED_RESULT, ACTUAL_RESULT)
     * мы проверяем все ожидаемые результаты
     * на основе переменных, введенных при выполнении тестового метода
     */
    @Test
    public void ScalarMultiplicationCheck() {
        System.out.println("* VectorsTest: ScalarMultiplicationCheck()");
        assertEquals(0, Vectors.scalarMultiplication(new int[]{0, 0}, new int[]{0, 0}));
        assertEquals(39, Vectors.scalarMultiplication(new int[]{3, 4}, new int[]{5, 6}));
        assertEquals(-39, Vectors.scalarMultiplication(new int[]{-3, 4}, new int[]{5, -6}));
        assertEquals(0, Vectors.scalarMultiplication(new int[]{5, 9}, new int[]{-9, 5}));
        assertEquals(100, Vectors.scalarMultiplication(new int[]{6, 8}, new int[]{6, 8}));
    }
}