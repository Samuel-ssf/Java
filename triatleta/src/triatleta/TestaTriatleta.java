package triatleta;

public class TestaTriatleta {

	public static void main(String[] args) {

		Triatleta t1 = new Triatleta(" Jo�o");

		t1.visualizar();

		t1.aquecer();
		t1.nadar();
		t1.Pedalar();
		t1.correr();
		t1.cansou();
	}

}
