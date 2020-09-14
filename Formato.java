
public abstract class Formatos<Formato> {
	
private List<Formato>formatos;
	
	
public abstract void representar ();

public Formatos () {
	this.formatos = new Array <>();
}

public void adicionarFormatos(Formatos formatos) {
	this.formatos.add(formatos);
	
}
public List<Formato> getFormatos() {
	return formato;
}


public void setFormatos(List<Formatos> formatos) {
	this.formatos = formatos;
}