import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {

    RestaurantService service;

    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException{
        for(Restaurant restaurant:restaurants){
            if(restaurant.getName().equals(restaurantName)){
                return restaurant;
            }
        }
      throw  new restaurantNotFoundException("No restraunt found with name"+restaurantName);
        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
        // COMPlITED THIS FUNCTION
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
