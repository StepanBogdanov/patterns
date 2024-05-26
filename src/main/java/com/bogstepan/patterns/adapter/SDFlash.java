package com.bogstepan.patterns.adapter;

public class SDFlash implements IMemoryCard {

    @Override
    public void reading() {
        System.out.println("Reading MicroSD device");
    }
}
