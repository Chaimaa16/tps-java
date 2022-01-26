package ma.education.tp5.annotations;

public class TestReflectionAnnotation {
	public static void main(String[] args) {
		Class<Calculatrice> c = Calculatrice.class;
		Programmer programmer = (Programmer)
				c.getAnnotation(Programmer.class);
		System.out.println(programmer.id()+":"+programmer.name());
	}

}
