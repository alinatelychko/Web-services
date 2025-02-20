package HW1.Task_5;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            // Створення фабрики для XSD-схеми
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            // Завантаження XSD-схеми
            File schemaFile = new File("/Users/alinatelychko/IdeaProjects/Web-services/src/main/resources/gems.xsd");
            if (!schemaFile.exists()) {
                System.err.println("Файл XSD не знайдено: " + schemaFile.getAbsolutePath());
                return;
            }
            Schema schema = factory.newSchema(schemaFile);

            // Створення валідатора
            Validator validator = schema.newValidator();

            // Завантаження XML-файлу
            File xmlFile = new File("/Users/alinatelychko/IdeaProjects/Web-services/src/main/resources/gems.xml");
            if (!xmlFile.exists()) {
                System.err.println("Файл XML не знайдено: " + xmlFile.getAbsolutePath());
                return;
            }

            // Валідація XML
            validator.validate(new StreamSource(xmlFile));
            System.out.println("XML-файл валідний!");
        } catch (Exception e) {
            System.err.println("Помилка валідації: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
