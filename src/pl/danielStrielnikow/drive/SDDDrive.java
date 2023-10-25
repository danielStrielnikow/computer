package pl.danielStrielnikow.drive;

import pl.danielStrielnikow.file.File;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SDDDrive implements Drive {
    Map<String, File> files = new HashMap<>();
    @Override
    public void addFile(File file) {
        files.put(file.getName(), file);
    }

    @Override
    public void listFile() {
        Set<String> fileNames = files.keySet();

        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
    }

    @Override
    public File findFile(String fileName) {
        return files.get(fileName);
    }
}
