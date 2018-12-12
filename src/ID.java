import java.util.ArrayList;

public final class ID {
	
	private int numericID;
	private String alphabeticalID;
	private static ArrayList<Object> ids = new ArrayList<Object>();

	public ID(IDTYPE type) {
		switch(type) {
		case NUMERIC:
			this.numericID = generateNumericID();
			break;
		case ALPHABETICAL:
			break;
		}
	}
	
	public static int generateNumericID() {
		String id = "";
		int result;
		for (int i = 0; i < 8; i++) {
			id += (int) Math.floor(Math.random() * 10);

			if (!ids.contains(id) && i == 7) {
				ids.add(id);
			} else if (i == 7) {
				i = -1;
			}
		}
		result = Integer.parseInt(id);
		return result;
	}
	
}
