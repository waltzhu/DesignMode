package state;

public class stopState extends liftState {

	@Override
	public void open() {
		super.getContext().setLiftState(context.openState);
		 super.getContext().getLiftState().open();
	}

	@Override
	public void close() {
		//do nothing
	}

	@Override
	public void run() {
		super.getContext().setLiftState(context.runState);
		 super.getContext().getLiftState().run();
	}

	@Override
	public void stop() {
		System.out.println("µçÌÝÍ£Ö¹...");  
	}

}
