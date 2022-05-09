package mvc;

public class ScreenCastController {
	
	private ScreenCastModel model;
	private ScreenCastView view;
	
	public ScreenCastController(ScreenCastModel model, ScreenCastView view) {
		this.model = model;
		this.view = view;
	}
	
	public void SetScreen(String screen) {
		model.setColor(screen);
	}
	
	public String getScreen(String getScreen) {
		return model.getColor();
	}
	
	public void updateView() {
		view.changeScreen(model.getColor());
	}
	
}
