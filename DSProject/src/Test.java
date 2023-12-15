import java.util.*;
public class Test {
	
	public static double w1 = 1;
	public static double w2 = 0.8;
	public static double w3 = 0.6;
	public static double w4 = 0.4;
	
	public static void main(String[] args) {
        
		KeywordList kList = new KeywordList();
        kList.add(new Keyword("Australia", w1)); 
        kList.add(new Keyword("Travel", w1)); 
        kList.add(new Keyword("Tourism", w1)); 
        kList.add(new Keyword("Trip", w1)); 
        kList.add(new Keyword("Attraction", w1)); 
        kList.add(new Keyword("Airplane", w2)); 
        kList.add(new Keyword("Ticket", w2)); 
        kList.add(new Keyword("Accommodation", w2)); 
        kList.add(new Keyword("Hotel", w2)); 
        kList.add(new Keyword("Packages", w2)); 
        kList.add(new Keyword("Kangaroo", w2)); 
        kList.add(new Keyword("Koala", w2)); 
        kList.add(new Keyword("Beach", w2)); 
        kList.add(new Keyword("National Park", w2)); 
        kList.add(new Keyword("Natural", w2)); 
        kList.add(new Keyword("Sight", w2)); 
        kList.add(new Keyword("Sydney", w3)); 
        kList.add(new Keyword("Melbourne", w3)); 
        kList.add(new Keyword("Brisbane", w3)); 
        kList.add(new Keyword("Gold Coast", w3)); 
        kList.add(new Keyword("Perth", w3)); 
        kList.add(new Keyword("Cairns", w3)); 
        kList.add(new Keyword("Ayers Rock", w3)); 
        kList.add(new Keyword("Opera House", w3)); 
        kList.add(new Keyword("Surfing", w3)); 
        kList.add(new Keyword("Harbour Bridge", w3));
        kList.add(new Keyword("Working holiday", w4)); 
        kList.add(new Keyword("Self-guided", w4));
        kList.add(new Keyword("backpacking", w4));
        kList.add(new Keyword("Tour", w4));
        kList.add(new Keyword("Group", w4));
        kList.add(new Keyword("Surfing", w4));
        kList.add(new Keyword("Zoo", w4));
        kList.add(new Keyword("Skydiving", w4));
        
//        Iterator<Keyword> itr = kList.iterator();
//        while(itr.hasNext()) {
//        	System.out.println(itr.next());
//        }
        
    }
	
}
