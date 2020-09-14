
public class Quadrado extends Formato {

	@Override
	public void representar();
	System.out.print ("#");
	for (formatos forma : super.getFormatos()) {
		forma.representar();
		

	}