package m2.idm.project;

public class Command {
	
	public static String getPython() {
		if (CurrentOS.isWindows()) {
			return "python";
		}
		return "python3";
	}
	
	public static String getR() {
		return "Rscript";
	}
	
}
