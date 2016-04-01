import java.util.Observable;
import java.util.Observer;

public abstract class AbstractCorporationLogger implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.print(((Inventory) arg).getName());
	}

}
