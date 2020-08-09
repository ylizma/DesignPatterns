package factory;

public class ComputerFactory {

    public Computer getComputer(String type,String ram,String hdd,String cpu){
        if (type.equalsIgnoreCase("pc")) return new Pc(ram,hdd,cpu);
        else if (type.equalsIgnoreCase("server")) return new Server(ram,hdd,cpu);
        return null;
    }
}
