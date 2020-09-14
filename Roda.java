
public class Roda extends Formato {

	
	@Override
	public void representar();
	System.out.print ("O");
	for (formatos forma : super.getFormatos()) {
		forma.representar();
	}