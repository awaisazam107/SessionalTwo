package awais;

public abstract class PictureDecorator implements PictureViewer {
	
	
	
	protected PictureDecorator decoratedPicture;

	   public PictureDecorator(PictureDecorator decoratedPicture){
	      this.decoratedPicture = decoratedPicture;
	   }

	@Override
	public void view() {
		decoratedPicture.view();
	}

}
