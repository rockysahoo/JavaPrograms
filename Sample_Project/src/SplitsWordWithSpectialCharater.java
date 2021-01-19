
public class SplitsWordWithSpectialCharater { 
														//. , _ - $ # % ? : ; 
														//[.] [,] [-] [_] [$] [#] [%] [?] [:] [;]
	public static void main(String[] args) {
		
		String file="PricePlanReport.xls";
		String[] fileSPlit=file.split("[.]");
		System.out.println(fileSPlit.length);
		System.out.println(fileSPlit[0]+" "+fileSPlit[1]);

		
		String file2="FeatureCloneReport-xls";
		String[] fileSPlit2=file2.split("[-]");
		System.out.println(fileSPlit2.length);
		System.out.println(fileSPlit2[0]+" "+fileSPlit2[1]);
		
	}

}
