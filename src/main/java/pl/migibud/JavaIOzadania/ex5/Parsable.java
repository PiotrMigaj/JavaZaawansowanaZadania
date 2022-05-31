package pl.migibud.JavaIOzadania.ex5;

import java.nio.file.Path;
import java.util.List;

public interface Parsable {
    User parseSingleLine(String input);
    List<User> parseWholeFile(Path path);
}
