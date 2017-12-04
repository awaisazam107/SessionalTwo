package awais;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		
		PictureViewer picture = new Picture();

		Frame LF = new LeftFrame();
		Frame RF = new RightFrame();
		Frame TF = new TopFrame();
		Frame BF = new BottomFrame();

		
		picture.view();
		LF.FrameName();
		LF.frameshape();
		LF.frameSize();
		LF.NoOfFrames();
		
		
		picture.view();
		RF.FrameName();
		RF.frameshape();
		RF.NoOfFrames();
		RF.frameSize();
		
		picture.view();
		TF.FrameName();
		TF.frameshape();
		TF.NoOfFrames();
		TF.frameSize();
		
		picture.view();
		BF.FrameName();
		BF.frameshape();
		BF.NoOfFrames();
		BF.frameSize();
		
		

	}

}
