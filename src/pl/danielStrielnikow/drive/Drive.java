package pl.danielStrielnikow.drive;

import pl.danielStrielnikow.file.File;

public interface Drive {
    void addFile(File file);
    void listFile();
    File findFile(String fileName);
}
