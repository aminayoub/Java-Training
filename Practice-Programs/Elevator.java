import java.util.*;
import java.util.stream.Collectors;

public class Elevator {

    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        elevator.elevatorInput();
    }

    public void elevatorInput(){
        List<Integer> floors = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current floor: ");
        int position = sc.nextInt();
        if(position < 1 || position > 12){
            System.err.println("Invalid floor, please try again.");
            return;
        }
        System.out.println("Enter your direction: ");
        String direction = sc.next();
        if(direction.equalsIgnoreCase("Up") || direction.equalsIgnoreCase("Down")){
            System.out.println("Enter your required floors: ");
            while(sc.hasNextInt()){
                floors.add(sc.nextInt());
            }
            if(!floors.contains(position)){
                floors.add(position);
            }
            elevatorDirection(floors, position, direction);
        } else {
            System.err.println("Incorrect direction, please try again.");
        }
    }

    private static void elevatorDirection(List<Integer> floors, int position, String direction){
        if(direction.equalsIgnoreCase("Up")){
            Collections.sort(floors);
            String floorsString = floors.stream().distinct().map(Object::toString).collect(Collectors.joining(", "));
            System.out.println(floorsString);
        }
        if(direction.equalsIgnoreCase("Down")){
            floors.sort(Collections.reverseOrder());
            String floorsString = floors.stream().distinct().map(Object::toString).collect(Collectors.joining(", "));
            System.out.println(floorsString);
        }
    }
}
