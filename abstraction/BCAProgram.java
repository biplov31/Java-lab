public interface BCAProgram{
	// void viva(){}  // error because method is not implemented in interface, only declared
	void viva();  // by default public and abstract
	// protected void viva();  // error because it is public by default
	// private int numOfSem = 8  // error because it has to be public 
	int numOfSem;  // 
}
class AadimCollege implements BCAProgram{
	public void viva();  // methods from interface need to be overridden. viva() is public by default in the interface so we need to make the method public here as well.
}