package ro.trc.ziua3.recapitulare;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {

    /**
     * Citirea unui fisier prin varianta Java7
     */
    public String continutFisier(String path) throws BusinessException {
        StringBuilder continut = new StringBuilder();
        String line;

        try (InputStream is = getClass().getResourceAsStream(path);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {

            while ((line = reader.readLine()) != null) {
                continut.append(line).append('\n');
            }

            return continut.toString();
        } catch (Exception e) {
            throw new BusinessException("Exceptie la citirea fisierului", e);
        }
    }

    public String continutFisierJava11(String path) throws BusinessException {
        try {
            URI loc = getClass().getResource(path).toURI();
            Path filePath = Paths.get(loc);

            return Files.readString(filePath);
        } catch (Exception e) {
            throw new BusinessException("Exceptie la citirea fisierului", e);
        }
    }
}
