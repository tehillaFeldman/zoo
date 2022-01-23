import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    ArrayList<iAnimal> zooAnimals = new ArrayList<>();

      Scanner scanner = new Scanner(System.in);

      //user input for animal
      while (true) {
        System.out.print("Do you want to add a Frog? (y/n)? ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("y")) {
          frog bobby = new frog();
          System.out.print("Enter ID tag: ");
          int id = scanner.nextInt();
          scanner.nextLine();
          bobby.setIdTag(id);
          boolean alreadyExist = false;

          //loop to check if animal exists
          for (iAnimal animal : zooAnimals) {

            if (bobby instanceof frog) {
              frog afrog = (frog) bobby;

              if (afrog.compareTo(bobby) == 0) {
                System.out.println("This animal already exists.");
                alreadyExist = true;
                }
            }
          }
          
          if (!alreadyExist) {
            zooAnimals.add(bobby);
            System.out.println("Frog added to the animal list");
          }
          }

        //user input for alligator
         System.out.print("Do you want to add an Alligator? (y/n)? ");
          answer = scanner.nextLine();
          if (answer.equalsIgnoreCase("y")) {

            Alligator alli = new Alligator();
            System.out.print("Enter ID tag? ");
            int id = scanner.nextInt();
            scanner.nextLine();
            alli.setIdTag(id);
            boolean alreadyExist = false;

          //loop to check if animal exists
            for (iAnimal animal : zooAnimals) {

            if (alli instanceof Alligator) {
              Alligator aAlligator = (Alligator) alli;

              if (aAlligator.compareTo(alli) == 0) {
                System.out.println("This animal already exists.");
                alreadyExist = true;
                }
            }
          }
            
            if (!alreadyExist) {
               zooAnimals.add(alli);
              System.out.println("Alligator added to the animal list");
            }

      System.out.print("Do you want to continue? (y/n): ");
      answer =scanner.nextLine();

      if (answer.equalsIgnoreCase("n")) {
        break;
      }

      }

        for (iAnimal animal : zooAnimals) {
            System.out.println(animal);
        }

    
  }
}
}

//frog class implementing iAnimal with compare
class frog implements iAnimal, Comparable<iAnimal>{

	//private fields
	private String type;
	private int minTemperature;
	private int maxTemperature;
	private int IdTag = 0; //default value
	
//create frog info
	public frog() {
		type = "Frog";
		minTemperature = 86;
		maxTemperature = 93;
	}

//getter animaltype
	public String getAnimalType() {
		return type;
	}

//getter idtag
	public int getIdTag() {
		return IdTag;
	}

//setter id tag
	public void setIdTag(int anIdTag) {
		IdTag = anIdTag;
	}
//getter min temp
	public int getMinTemperature() {
		return minTemperature;
	}

//getter max temp
	public int getMaxTemperature() {
		return maxTemperature;
	}

//compareto
    public int compareTo(iAnimal iAnimal) {
        return type.compareTo(iAnimal.getAnimalType()) + IdTag - iAnimal.getIdTag();
    }
    
    //tostring
    public String toString() {
        return "Frog: ID - " + getIdTag() + ", Max Temp: " + getMaxTemperature() + ", Min Temp: " + getMinTemperature();
    }

}

//alligator class implementing iAnimal with compare
class Alligator implements iAnimal, Comparable<iAnimal>{

	private String type;
	private int minTemperature;
	private int maxTemperature;
	private int IdTag = 0; 
	
//create Alligaotr info
	public Alligator() {
		type = "Alligator";
		minTemperature = 86;
		maxTemperature = 93;
	}

//getter animaltype
	public String getAnimalType() {
		return type;
	}

//getter idtag
	public int getIdTag() {
		return IdTag;
	}

//setter idtag
	public void setIdTag(int anIdTag) {
		IdTag = anIdTag;
	}

//getter min temp
	public int getMinTemperature() {
		return minTemperature;
	}

//getter max temp
	public int getMaxTemperature() {
		return maxTemperature;
	}

    //compareto
    public int compareTo(iAnimal iAnimal) {
        return type.compareTo(iAnimal.getAnimalType()) + IdTag - iAnimal.getIdTag();
    }

    //tostring
    public String toString() {
        return "Alligator: ID - " + getIdTag() + ", Max Temp: " + getMaxTemperature() + ", Min Temp: " + getMinTemperature();
    }

}


