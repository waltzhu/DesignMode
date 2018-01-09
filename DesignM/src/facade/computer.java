package facade;

public class computer implements electOperate{
  private cpu cpu;
  private memory memory;
  private disk disk;
  
    public computer(){
    	this.cpu=new cpu();
    	this.memory=new memory();
    	this.disk=new disk();
    }
  
	@Override
	public void start() {
		 this.cpu.start();
		 this.memory.start();
		 this.disk.start();
	}
	
	@Override
	public void close() {
		 this.cpu.close();
		 this.memory.close();
		 this.disk.close();
	}
}
