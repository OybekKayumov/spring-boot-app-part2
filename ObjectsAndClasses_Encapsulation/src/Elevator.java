// package src;

public class Elevator {

   private int currentFloor = 1;
   private int minFloor;
   private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Извините, нет такого этажа");
        } else if (floor == currentFloor) {
            System.out.println("Текущий этаж: " + floor);
        } else {
            while (floor > currentFloor) {
                moveUp();
                System.out.println("Текущий этаж: " + currentFloor);
            }
            while (floor < currentFloor) {
                moveDown();
                System.out.println("Текущий этаж: " + currentFloor);
            }
        }
    }
}
