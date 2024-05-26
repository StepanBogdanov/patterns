package com.bogstepan.patterns.adapter;

public class UsbAdapter implements IUsb{

    private final IMemoryCard memoryCard;

    public UsbAdapter(IMemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void reading() {
        memoryCard.reading();
    }
}
