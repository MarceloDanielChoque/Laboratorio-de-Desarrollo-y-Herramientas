import java.util.logging.Logger;
import java.util.logging.Level;

public class Helloworld {

    // Definir el registrador
    private static final Logger logger = Logger.getLogger(Helloworld.class.getName());

    private String field;

    public Helloworld(String field) {
        this.field = field;
    }

    public void use() {
        DeprecatedExample example = new DeprecatedExample(); // Inicializar correctamente el objeto
        example.deprecatedMethod(); // Uso correcto del objeto

        // Registrar un mensaje en lugar de finalizar abruptamente la aplicación
        logger.warning("Saliendo con código 33 por motivo de advertencia, pero no se detendrá la aplicación.");
    }

    public void useFieldForLcom4() {
        if (field != null) {
            // Usar formato integrado para evitar concatenación
            logger.info(String.format("El valor de field es: %s", field));
        } else {
            logger.warning("El campo 'field' es null, no se puede imprimir su valor.");
        }

    }

  public void processField() {
    if (field != null) {
        if (logger.isLoggable(Level.INFO)) {  // Verificar si el nivel INFO está habilitado
            logger.info(String.format("Procesando el campo 'field' con valor: %s", field));
        }
    } else {
        logger.warning("El campo 'field' es null, no se puede procesar.");
    }
}

    // Nombres de métodos más descriptivos
    public void logWarningMessage() {
        logger.warning("Este método muestra una advertencia con un nombre descriptivo.");
    }

    // Getter para el campo, útil para pruebas unitarias
    public String getField() {
        return field;
    }
}



class DeprecatedExample {
    public void deprecatedMethod() {
        // Implementación dummy
    }
}

class SpecificException extends Exception {
    public SpecificException(String message) {
        super(message);
    }
}