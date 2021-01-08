package Utilities;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

  public static final String RESOURCE_FOLDER = "src/test/resources/UploadFile";

  private static String getFixtureFile(String fileName) {
    return getFileFromTestResource(fileName).toString();
  }

  public static Path getFileFromTestResource(String name) {
    return Paths.get(RESOURCE_FOLDER + "/" + name);
  }
}
