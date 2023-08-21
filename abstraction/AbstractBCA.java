/* public class AbstractBCA{
	// public void teach(); // error because method cannot be abstract in a non-abstract class
	void teach(){};
}	*/

public abstract class AbstractBCA implements BCAProgram{
	public void teach();
	void bangkokTour(){};
}
class AadimBCA extends AbstractBCA{
	public void viva(){};
	
	public void teachJavaInThirdSemester(){};
	
	public void teach(){};
	
	// bangkokTour() is not compulsory
}