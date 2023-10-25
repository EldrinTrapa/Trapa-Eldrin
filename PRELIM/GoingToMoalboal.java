
//Eldrin A. Trapa
//BSIT-2B


import java.util.Scanner;

public class GoingToMoalboal {
   public static void main(String[] args) {
      Route route = new Route();
      Eta eta = new Eta();
      Scanner scanner = new Scanner(System.in);
      int speed;

      System.out.println("Welcome, I'll guide you to your destination...");
      route.defRoute();
      System.out.print("Is Route to barili blocked?[Y/N]: ");
      char ans = scanner.next().charAt(0);
      ans = Character.toLowerCase(ans);

      if (ans == 'y') {
         System.out.print("Is Route Dumanjug blocked?[Y/N]: ");
         char ans2 = scanner.next().charAt(0);
         ans2 = Character.toLowerCase(ans2);
         if (ans2 == 'y') {
            route.routeC();
            System.out.print("Speed: ");
            speed = scanner.nextInt();
            double distance = 120.5; 
            double estimatedHours = eta.est_time_arr(distance, speed);
            int hours = (int) estimatedHours;
            int minutes = (int) ((estimatedHours - hours) * 60);
            System.out.println("Distance: " + distance + "km");
            System.out.println("Estimated Time of Arrival: " + hours + " hour(s) and " + minutes + " minutes");
         } else {
            route.routeB();
            System.out.print("Speed: ");
            speed = scanner.nextInt();
            double distance = 85.2; 
            double estimatedHours = eta.est_time_arr(distance, speed);
            int hours = (int) estimatedHours;
            int minutes = (int) ((estimatedHours - hours) * 60);
            System.out.println("Distance: " + distance + "km");
            System.out.println("Estimated Time of Arrival: " + hours + " hour(s) and " + minutes + " minute(s)");
         }
      } else {
         route.routeA();
         System.out.print("Speed: ");
         speed = scanner.nextInt();
         double distance = 110.3;
         double estimatedHours = eta.est_time_arr(distance, speed);
         int hours = (int) estimatedHours;
         int minutes = (int) ((estimatedHours - hours) * 60);
         System.out.println("Distance: " + distance + "km");
         System.out.println("Estimated Time of Arrival: " + hours + " hour(s) and " + minutes + " minute(s)");
      }

      scanner.close();
   }

   static class Route {
      public void defRoute() {
         System.out.println("Default Route: ");
         System.out.println("Cebu City    --- START");
         System.out.println("Minglanilla  --- Route 1");
         System.out.println("San Fernando --- Route 2");
         System.out.println("Carcar City  --- Route 3");
         System.out.println("Barili       --- Route 4");
         System.out.println("Dumanjug     --- Route 4.2.1");
         System.out.println("Alcantara    --- Route 4.2.2");
         System.out.println("Moalboal     --- Arrived");

        }
      public void routeB() {
         System.out.println("Recommended Route: ");
         System.out.println("Cebu City    --- START");
         System.out.println("Minglanilla  --- Route 1");
         System.out.println("San Fernando --- Route 2");
         System.out.println("Carcar City  --- Route 3");
         System.out.println("Sibonga      --- Route 4.2");
         System.out.println("Dumanjug     --- Route 4.2.1");
         System.out.println("Alcantara    --- Route 4.2.2");
         System.out.println("Moalboal     --- Arrived");

        }

      public void routeC() {
         System.out.println("Recommended Route: ");
         System.out.println("Cebu City    --- START");
         System.out.println("Minglanilla  --- Route 1");
         System.out.println("San Fernando --- Route 2");
         System.out.println("Carcar City  --- Route 3");
         System.out.println("Argao        --- Route 5");
         System.out.println("Ronda        --- Route 5.1");
         System.out.println("Alcantara    --- Route 5.2");
         System.out.println("Moalboal     --- Arrived");
       
        }
      public void routeA() {
         System.out.println("Recommended Route: ");
         System.out.println("Cebu City    --- START");
         System.out.println("Minglanilla  --- Route 1");
         System.out.println("San Fernando --- Route 2");
         System.out.println("Carcar City  --- Route 3");
         System.out.println("Barili       --- Route 4");
         System.out.println("Dumanjug     --- Route 4.2.1");
         System.out.println("Alcantara    --- Route 4.2.2");
         System.out.println("Moalboal     --- Arrived");

       }
   }

   static class Eta {
      public double est_time_arr(double distance, int speed) {
         double time = distance / speed;
         return time;
      }
   }
}