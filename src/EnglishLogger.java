import java.util.Observable;

public class EnglishLogger extends AbstractCorporationLogger {

	@Override
	public void update(Observable o, Object arg) {
		System.out.print("an inventory ");
		super.update(o, arg);
		System.out.println(" added");
	}

}
