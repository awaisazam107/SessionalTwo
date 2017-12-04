package awais;

public class RightFrame implements Frame{

	@Override
	public FrameShape frameshape() {
		return new Circle();
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
		return "Picture having Right Frame ";
	}
}
