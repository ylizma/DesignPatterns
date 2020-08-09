package factory;

public class Pc extends Computer {

    String ram;
    String hdd;
    String cpu;

    public Pc(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    String getHdd() {
        return this.hdd;
    }

    @Override
    String getRam() {
        return this.ram;
    }

    @Override
    String getCpu() {

        return this.cpu;
    }
    
}
