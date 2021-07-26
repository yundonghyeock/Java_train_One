package chap13.four;

public class Util {
	public static <K, V> Boolean compare(Pair<K, V> p1, Pair<K, V> p2){
		boolean keyCompare = p1.equals(p2.getClass());
		boolean valueCompare = p2.equals(p2.getClass());
		return keyCompare && valueCompare;
	}
}
