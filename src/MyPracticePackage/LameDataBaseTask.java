package MyPracticePackage;

public class LameDataBaseTask {

	public static void main(String[] args) {

	}

	public static String lameDb(String db, String op, String id, String data) {
		if (op.equals("add")) {
			return db + "#" + id + data;

		}
		if (op.equals("edit")) { // ("1test#2bla#3foo","edit","2","bbb")
									// returns: 1test#2bbb#3foo
			String[] str = db.split("#");
			db = "";
			for (int i = 0; i < str.length; i++) {
				if (str[i].startsWith(id)) {
					str[i] = id + data;
				}
				db = db + str[i] + "#";
			}
			return db.substring(0, db.length() - 1);
		}
		if (op.equals("delete")) {
			String[] str = db.split("#");
			db = "";
			for (int i = 0; i < str.length; i++) {
				if (str[i].startsWith(id)) {
					continue;
				}
				db = str[i] + "#";
			}
			return  db;
		}
		if(op.equals("none")) {
			//return db;
		}
		return db;
	}

}
