
//import org.junit.*;  // for class annotation
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;  // for static method class Assert (include all assert.methods)


public class FuncTest {
    public FuncTest() {  }

     // Fixtures (DB up and clear, upload some files

    /**
     * Аннотация @BeforeClass отмечает метод инициализации именно класса теста.
     * Он выполняется только перед выполнением любых других методов
     * в тестовом классе.
     */
    @BeforeClass // Инициализатор класса тестов
    public static void setUpClass() throws Exception {
        System.out.println("* FuncTest: @BeforeClass method");
    }

    /*
      Добавление println в методы позволит отслеживать процесс
      выполнения методов и порядок их выполнения.
     */

    /**
     * Аннотация @AfterClass помечает метод финализации именно класса теста.
     * Метод финализатора тестового класса выполняется только один раз
     * и только после выполнения других методов в тестовом классе.
     */

    @AfterClass // Финализатор класса тестов
    public static void tearDownClass() throws Exception {
        System.out.println("* FuncTest: @AfterClass method");
    }

    /**
     * Аннотация @Before отмечает метод  инициализации теста.
     * Метод инициализации теста выполняется перед каждым тестом в тестовом классе.
     * Для выполнения тестов метод инициализации теста не требуется,
     * его следует использовать при необходимости инициализации
     * некоторых переменных до выполнения теста.
     */
    @Before
    public void setUp() {
        System.out.println("* FuncTest: @Before method");
    }

    /**
     * Аннотация @After помечает метод финализации теста.
     * Метод финализатора теста выполняется после каждого теста в тестовом классе.
     * Метод финализатора теста не требуется для выполнения тестов,
     * но финализатор может использоваться для удаления всех данных,
     * задействованных при выполнении тестов.
     */
    @After
    public void tearDown() {
        System.out.println("* FuncTest: @After method");
    }

    /**
     * Тестирование с помощью простого подтверждения
     * метод с именем helloWorldCheck, использующий единственное простое утверждение
     * для проверки правильности сцепления строк методом.
     */
    @Test
    public void helloWorldCheck() {
        System.out.println("* FuncTest: test method 1 - helloWorldCheck()");
        assertEquals("Hello, world!", Func.concatWords("Hello", ", ", "world", "!"));
    }

    /**
     * Тестирование с использованием тайм-аута
     * Этот тест демонстрирует проверку метода на длительность выполнения.
     * Если метод выполняется слишком долго,
     * поток выполнения теста прерывается, а тест завершается сбоем.
     * При прерывании потока выполнения тестовый метод выдает TimeoutException.
     */
    @Test(timeout = 1000)
    public void testWithTimeout() {
        System.out.println("* FuncTest: test method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int)(100 * Math.random());
        System.out.println("computing " + factorialOf + '!');
        System.out.println(factorialOf + "! = " + Func.computeFactorial(factorialOf));
    }

    /**
     * Тестирование на ожидаемое исключение
     * Этот тест предназначен для тестирования на ожидаемое исключение.
     * Метод завершится сбоем, если не будет выдано ожидаемое исключение
     */
    @Test(expected = IllegalArgumentException.class)
    public void checkExpectedException() {
        System.out.println("* FuncTest: test method 3 - checkExpectedException()");
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + Func.computeFactorial(factorialOf));
    }

    /**
     * Test of normalizeWord method, of class Utils.
     * Отключение теста
     * Этот тест включает способы временного отключения тестового метода.
     * Для отключения теста в JUnit 4 нужно добавить аннотацию @Ignore.
     */
    @Ignore
    @Test
    public void temporarilyDisabledTest() throws Exception {
        System.out.println("* FuncTest: test method 4 - checkExpectedException()");
        assertEquals(228, Func.normalizeNumber(8, 220));
        assertEquals(1337, Func.normalizeNumber(337, 1000));
        assertEquals(1488, Func.normalizeNumber(8, 1480));
    }
}