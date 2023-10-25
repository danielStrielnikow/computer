package pl.danielStrielnikow.file.image;

import pl.danielStrielnikow.file.AbstractFile;
import pl.danielStrielnikow.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    public AbstractImageFile(String name, int size) {
        super(name, size);
    }

    public FileType getType() {
        return FileType.IMAGE;
    }
}
