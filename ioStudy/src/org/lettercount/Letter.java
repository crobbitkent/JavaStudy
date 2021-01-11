package org.lettercount;

public class Letter implements Comparable<Letter>{
	private int count;
	private char alphabet;
	
	public Letter(char ch) {
		alphabet = ch;
		count = 0;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alphabet;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals" + this);
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Letter other = (Letter) obj;
		if (alphabet != other.alphabet)
			return false;
		return true;
	}



	public int getCount() {
		return count;
	}
	
	public char getAlphabet() {
		return alphabet;
	}
	
	public void plusCount() {
		++count;
	}

	@Override
	public String toString() {
		return "Letter [count=" + count + ", alphabet=" + alphabet + "]";
	}

	@Override
	public int compareTo(Letter o) {
		
		return o.count - this.count;
	}
	
	
	
}
