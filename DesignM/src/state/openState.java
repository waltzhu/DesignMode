package state;

public class openState extends liftState {
	@Override
	public void open() {
		System.out.println("µçÌÝÃÅ¿ªÆô...");  
	}
	@Override
	public void close() {
		 super.getContext().setLiftState(context.closeState);
		 super.getContext().getLiftState().close();
	}
	@Override
	public void run() {
		//do nothing
	}
	@Override
	public void stop() {
		//do nothing
	}
}
