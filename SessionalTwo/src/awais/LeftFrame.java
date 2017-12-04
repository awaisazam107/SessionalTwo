package awais;

public class LeftFrame implements Frame{
	@Override
	public String FrameName() {
		return "Picture having Left Frame ";
	}

	@Override
	public FrameShape frameshape() {
		return new Rectangle();
	}

	@Override
	public int frameSize(){
		return 20;
	}
	@Override
	public int NoOfFrames(){
		return 2;
	}

	

}
