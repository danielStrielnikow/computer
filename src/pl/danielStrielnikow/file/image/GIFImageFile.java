package pl.danielStrielnikow.file.image;

import pl.danielStrielnikow.file.File;
import pl.danielStrielnikow.file.FileType;

public class GIFImageFile implements File {
    private final String name;
    private final int size;

    public GIFImageFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }

    public void showAnimation() {
        System.out.println("Showing funny GIF");
    }
}
