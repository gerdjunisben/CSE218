package p5;

public class Demo {

	public static void main(String[] args) {
		ComparableBag<Dummy> bag = new ComparableBag<>(Dummy.class,50);
		
		bag.insert(new Dummy("A",5));
		bag.insert(new Dummy("C",21));
		bag.insert(new Dummy("Z",3));
		bag.insert(new Dummy("Q",89));
		
		
		int x = bag.search((s)->{
			return ((Dummy)s).getName().equalsIgnoreCase("A");
		});
		
		System.out.println(x);
		
		bag.remove((s)->{
			return ((Dummy)s).getName().equalsIgnoreCase("A");
		});
		
		bag.display();
		

	}

}
