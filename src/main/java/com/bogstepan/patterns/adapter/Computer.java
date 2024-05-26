package com.bogstepan.patterns.adapter;

public class Computer {

    public void read(IUsb usbDevice) {
        usbDevice.reading();
    }
}
