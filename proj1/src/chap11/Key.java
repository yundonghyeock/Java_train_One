package chap11;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compaKey = (Key) obj;
			if(this.number == compaKey.number) {
				return true;
			}
		}
		return false;
	}

}
