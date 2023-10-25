package pl.danielStrielnikow.USBDevice;

public class Mouse implements USBDevice{
    private final String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Mouse connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Mouse disconneted");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
