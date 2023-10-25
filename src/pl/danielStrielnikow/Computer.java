package pl.danielStrielnikow;

import pl.danielStrielnikow.file.File;
import pl.danielStrielnikow.USBDevice.USBDevice;
import pl.danielStrielnikow.drive.Drive;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private Headphone headphone;

    List<USBDevice> usbDevices = new ArrayList<>();

    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }
    public void addFile(File file) {
        drive.addFile(file);
    }

    public void listFile() {
        drive.listFile();
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphone getHeadphone() {
        return headphone;
    }

    public void setHeadphone(Headphone headphone) {
        this.headphone = headphone;
    }

    public List<USBDevice> getUsbDevice() {
        return usbDevices;
    }

    // Dodawanie USB
    public void addUSBDevice(USBDevice usbDevice) {
        boolean isConnect = usbDevice.connect();
        if(isConnect == true){
            usbDevices.add(usbDevice);
        }
    }

    public File findFile(String fileName) {
        return drive.findFile(fileName);
    }

    public void removeUSBDevice(USBDevice usbDevice) {
        boolean isDisconnect = usbDevice.disconnect();

        if (!isDisconnect){
            System.out.println("USBDevice forcefully disconnected");
        }
        usbDevices.remove(usbDevice);
    }
}
