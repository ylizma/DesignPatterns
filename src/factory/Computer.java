package factory;

public abstract class Computer {
    abstract String getHdd();
    abstract String getRam();
    abstract String getCpu();

    @Override
	public String toString(){
		return "RAM= "+this.getRam()+", HDD="+this.getHdd()+", CPU="+this.getCpu();
	}
}
