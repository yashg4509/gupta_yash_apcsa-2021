package unit11;

public class ToyRunner {

	public static void main(String[] args) {
		ToyStore t1=new ToyStore();
		t1.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println("Toys: ["+t1+"]");
	   
		System.out.println("Most frequent toy: "+t1.getMostFrequentToy());
	   
		String toy="bat";
		System.out.println("Count of toy "+toy+"="+t1.getThatToy(toy).getCount());
	   
		t1.sortToysByCount();
		System.out.println("Sorted toys: ["+t1+"]");
 
	}
 
 }
 