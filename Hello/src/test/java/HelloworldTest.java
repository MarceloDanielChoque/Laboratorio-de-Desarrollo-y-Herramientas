import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.logging.Logger;

public class HelloworldTest {

    private Helloworld helloWorld;

    @BeforeEach
    public void setUp() {
        helloWorld = new Helloworld("testField");
    }

    @Test
    public void testGetField() {
        assertEquals("testField", helloWorld.getField());
    }

    @Test
    public void testProcessFieldWithNonNullField() {
        helloWorld.processField();
        // Aquí puedes verificar si el log capturó correctamente el mensaje
    }

    @Test
    public void testProcessFieldWithNullField() {
        Helloworld nullFieldHelloWorld = new Helloworld(null);
        nullFieldHelloWorld.processField();
        // Aquí puedes verificar si el log capturó el mensaje de advertencia correctamente
    }

    @Test
    public void testUseMethod() {
        helloWorld.use();
        // Verifica si se usó correctamente el método deprecated y si el warning fue registrado
    }

    @Test
    public void testUseFieldForLcom4() {
        helloWorld.useFieldForLcom4();
        // Verifica que el método se ejecuta correctamente con un campo no nulo
    }
}