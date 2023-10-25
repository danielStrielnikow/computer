package pl.danielStrielnikow;

import pl.danielStrielnikow.USBDevice.MemoryStick;
import pl.danielStrielnikow.USBDevice.Mouse;
import pl.danielStrielnikow.USBDevice.USBDevice;
import pl.danielStrielnikow.drive.Drive;
import pl.danielStrielnikow.drive.HDDDrive;
import pl.danielStrielnikow.drive.SDDDrive;
import pl.danielStrielnikow.file.File;
import pl.danielStrielnikow.file.image.GIFImageFile;
import pl.danielStrielnikow.file.image.JPGImageFile;
import pl.danielStrielnikow.file.music.MP3File;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Monitor monitor = new Monitor("Dell");
//        Drive hddDrive = new HDDDrive();
//
//        Computer computer = new Computer(monitor, hddDrive);
////        hddDrive.addFile(new pl.danielStrielnikow.File.File( "photo.jpg"));
////        hddDrive.listFile();
//
////        computer.addFile(new File("file.png"));
////        computer.listFile();
//
//        Mouse myszka = new Mouse("Myszka");
//        MemoryStick memoryStick = new MemoryStick("Pedrive");
//
//        computer.addUSBDevice(myszka);
//        computer.addUSBDevice(memoryStick);
//
//        List<USBDevice> usbDeviceList = computer.getUsbDevice();
//
//        for (USBDevice usbDevice : usbDeviceList) {
//            System.out.println(usbDevice.getName());
//        }
//
//        computer.removeUSBDevice(myszka);
//        memoryStick.eject();
//        computer.removeUSBDevice(memoryStick);
//
//        for (USBDevice usbDevice : usbDeviceList) {
//            System.out.println(usbDevice.getName());
//        }
        MP3File mp3File = new MP3File("audio.mp3", 4000,
                "Rammstein", "Sonne", 100);

        GIFImageFile gifImageFile = new GIFImageFile("funnydog.gif", 150);
        JPGImageFile jpgImageFile = new JPGImageFile("holidays.jpg", 400, 80);

        Monitor monitor = new Monitor("Dell");
        Drive hddDrive = new HDDDrive();

        Computer computer = new Computer(monitor, hddDrive);
        computer.addFile(mp3File);
        computer.addFile(gifImageFile);
        computer.addFile(jpgImageFile);

        File file = computer.findFile("audio.mp3");
        System.out.println(file.getSize());
        System.out.println(file.getName());
        System.out.println(file);


    }
}