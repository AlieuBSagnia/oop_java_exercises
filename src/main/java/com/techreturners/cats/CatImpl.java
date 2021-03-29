package com.techreturners.cats;


public abstract class CatImpl implements Cat {
    private boolean sleeping;
    private int height;
    private String eatingSound;
    private String setting;

    public CatImpl(String eatingSound ,int height, String setting){
        this.eatingSound = eatingSound;
        this.height = height;
        this.setting = setting;
    }

    @Override
    public boolean isAsleep() {
        return this.sleeping;
    }

    @Override
    public boolean goToSleep() {
        this.sleeping = true;
        return sleeping;
    }

    @Override
    public boolean wakeUp() {
        this.sleeping = false;
        return this.sleeping;
    }

    public String getSetting() {
        return this.setting;
    }

    public int getAverageHeight() {
        return this.height;
    }

    public String eat() {
        return eatingSound;
    }
}
