import java.util.*;
import java.util.Map.Entry;

public class Magazins extends PrintedMedia {
					private String Popularity;
					private Map<Integer, String> PupolarityScale = new HashMap<Integer, String>();// <K, V>: K- min number of subscribers to achieve popularity V 
					private int NumberOfSubscribers;
			
			public void addPopularityLevel(int SubscribersRequired, String PopularityLevel) {
				PupolarityScale.put(SubscribersRequired, PopularityLevel);
			}
			private void changeNumberOfSubscribers(int Changes) {
				NumberOfSubscribers+=Changes;
				String result = "";
				for (Entry<Integer, String> entry : PupolarityScale.entrySet()) {
					if (entry.getKey()<=NumberOfSubscribers) {result = entry.getValue();};
				}
				Popularity = result;
			};

}
