package state;

public class runState extends liftState {

	@Override
	public void open() {
		//do nothing
	}

	@Override
	public void close() {
		//do nothing
	}

	@Override
	public void run() {
		System.out.println("µÁÃ›‘À––...");  
	}

	@Override
	public void stop() {
		 super.getContext().setLiftState(context.stopState);
		 super.getContext().getLiftState().stop();
	}

}
