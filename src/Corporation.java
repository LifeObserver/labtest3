import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/**
 * Represents a company that owns and operates one or more grocery stores, each
 * with its own inventory.
 */
public class Corporation extends Observable {

	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();

	public static void main(String[] args) {
		Corporation corp = new Corporation();
		Observer obs1 = new EnglishLogger();
		Observer obs2 = new FrenchLogger();
		corp.addObserver(obs1);
		corp.addObserver(obs2);
		corp.addInventory(new Inventory("Rick"));
		System.out.println();
		corp.addInventory(new Inventory("Ross"));
	}

	/**
	 * @param pInventory
	 *            An inventory to add to the corporation.
	 */
	public void addInventory(Inventory pInventory) {
		aInventories.put(pInventory.getName(), pInventory);
		setChanged();
		notifyObservers(pInventory);
	}

}
