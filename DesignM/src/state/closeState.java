package state;

public class closeState extends liftState {

	@Override
	public void open() {
		 super.getContext().setLiftState(context.openState);
		 super.getContext().getLiftState().close();
	}

	@Override
	public void close() {
		System.out.println("µÁÃ›√≈πÿ±’...");  
	}

	@Override
	public void run() {
		 super.getContext().setLiftState(context.runState);
		 super.getContext().getLiftState().run();
	}

	@Override
	public void stop() {
		 super.getContext().setLiftState(context.stopState);
		 super.getContext().getLiftState().stop();
	}

}
