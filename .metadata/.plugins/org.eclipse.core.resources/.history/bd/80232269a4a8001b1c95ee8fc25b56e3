package Sample;

public class Tuple implements Comparable<Tuple>{

	public int count;
    public String word;

    public Tuple(String word, int count) {
        this.word = word;
        this.count = count;
    }
	
    @Override
    public int compareTo(Tuple o) {
        return new Integer(this.count).compareTo(o.count);
    }
    public String toString() {
        return word + " " + count;
    }

}
