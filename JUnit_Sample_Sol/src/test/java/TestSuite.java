
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * Аннотации @RunWith() и @Suite.SuiteClasses()
 * позволяют выполнить одновременно несколько тестов как один
 * и отобразить результат в одном окне
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({VectorsTest.class,FuncTest.class})
public class TestSuite { }