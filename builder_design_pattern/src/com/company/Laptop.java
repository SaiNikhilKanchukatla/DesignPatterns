package com.company;

public class Laptop {
    //required parameters
    private String HDD;
    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;


    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    Laptop(LaptopBuilder builder) {
        this.HDD=builder.HDD;
        this.RAM=builder.RAM;
        this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }

    public String toString(){
        return "Laptop Features: \n Hard disk :"+this.HDD+"\n RAM: "+this.RAM+"\n Bluetooth "+this.isBluetoothEnabled+"\nGraphic Card: "+this.isGraphicsCardEnabled;
    }
    //Builder Class
    public static class LaptopBuilder {

        // required parameters
        private String HDD;
        private String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public LaptopBuilder(String hdd, String ram){
            this.HDD=hdd;
            this.RAM=ram;
        }

        public LaptopBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public LaptopBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Laptop build(){
            return new Laptop(this);
        }

    }

}
