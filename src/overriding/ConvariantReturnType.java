package overriding;

// overriding
public class ConvariantReturnType {
	public ConvariantReturnType clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return (ConvariantReturnType) obj;
	}
}
