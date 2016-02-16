import java.util.Scanner;

public class WindChillTemp {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter temperature and wind speed: ");
      double temperature = input.nextDouble();
      double windspeed = input.nextDouble();
      
      if ((temperature < -58) || (temperature > 41))
          System.out.print("temperature invalid");
      else{
          if (windspeed < 2)
              System.out.print("wind speed is invalid");
          else{
            double wctemp = 35.74 + (0.6215 * temperature) 
                    - (35.75 * (Math.pow(windspeed, 0.16)))
                    + (0.4275 * temperature * Math.pow(windspeed, 0.16));
            System.out.println("wind-chill temperature is " + wctemp);
          } // else
      } // else
  } // main
} //WindChillTemp
