package app;

import service.ServiceMarshall;

import java.io.File;
import java.security.Provider;

public class Actividad4 {

    private static final String PATH_XML = "src/main/resources/xml";

    private static final String PATH_XSD = "src/main/resources/xsd";

    public static void main(String[] args) {
        File file = new File(PATH_XML);
        ServiceMarshall serviceMarshall = new ServiceMarshall();
        serviceMarshall.marshalling(file);
    }
}
