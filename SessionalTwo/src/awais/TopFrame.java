package awais;

public class TopFrame implements Frame{

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
	@Override
	public String FrameName() {
		return "Picture having Top Frame ";
	}

}
