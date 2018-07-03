package camelkase;

public class CamelCase {

	public static String TransfoCamelNull(String ArgChaine) {

		String result = "ChampionDuMonde";
		if ((ArgChaine == null) || (ArgChaine == " ")) {
			result = null;
		}
		else {
		
		
		String[] separation = ArgChaine.split("-");	
	
		String part1 = separation[0];
		String part2 = separation[1];
		
		result = ucfirst(part1) + ucfirst(part2);
		
		}
		System.out.println(result);
		return result;

	}
	
	public static String ucfirst(String chaine){
		return chaine.substring(0, 1).toUpperCase()+ chaine.substring(1).toLowerCase();
		}
	
}
