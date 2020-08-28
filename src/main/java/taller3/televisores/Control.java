package taller3.televisores;

public class Control {
	// Attributes
	TV tv;
	
	// Getters
	public TV getTV() {
		return tv;
	}
	
	
	// Setters
	public void setTV(TV tv) {
		this.tv = tv;
	}
	
	// Methods
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
}
