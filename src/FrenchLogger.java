import java.util.Observable;

public class FrenchLogger extends AbstractCorporationLogger {

	@Override
	public void update(Observable o, Object arg) {
		System.out.print("un inventaire ");
		super.update(o, arg);
		System.out.println(" ajoute");
	}

}
