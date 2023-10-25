package pl.danielStrielnikow.USBDevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
