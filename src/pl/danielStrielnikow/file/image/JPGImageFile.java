package pl.danielStrielnikow.file.image;

import pl.danielStrielnikow.file.File;
import pl.danielStrielnikow.file.FileType;

public class JPGImageFile implements File {
    private final String name;
    private final int size;
    private final int compresion;

    public JPGImageFile(String name, int size, int compresion) {
        this.name = name;
        this.size = size;
        this.compresion = compresion;
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

    public int getCompresion() {
        return compresion;
    }
    public void showImage() {
        System.out.println("Showing Image");
    }
}
