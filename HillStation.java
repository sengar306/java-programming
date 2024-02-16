
class HillStations {
  
    public void location() {
        System.out.println("Location: Generic Hill Station");
    }


    public void famousFor() {
        System.out.println("Famous For: Natural Beauty");
    }
}


class Manali extends HillStations {
   
  
    public void location() {
        System.out.println("Location: Manali, Himachal Pradesh");
    }


    public void famousFor() {
        System.out.println("Famous For: Rohtang Pass and Adventure Sports");
    }
}

class Mussoorie extends HillStations {
   

    public void location() {
        System.out.println("Location: Mussoorie, Uttarakhand");
    }

    public void famousFor() {
        System.out.println("Famous For: Kempty Falls and Mall Road");
    }
}

class Gulmarg extends HillStations {
    
    public void location() {
        System.out.println("Location: Gulmarg, Jammu and Kashmir");
    }

  
    public void famousFor() {
        System.out.println("Famous For: Skiing and Gulmarg Gondola");
    }
}

public class HillStation {
    public static void main(String[] args) {

        HillStations s1 = new HillStations();
        s1.location();
        s1.famousFor();
        System.out.println();

        
        Manali manaliStation = new Manali();
        manaliStation.location();
        manaliStation.famousFor();
        System.out.println();

        Mussoorie mussoorieStation = new Mussoorie();
        mussoorieStation.location();
        mussoorieStation.famousFor();
        System.out.println();

        Gulmarg gulmargStation = new Gulmarg();
        gulmargStation.location();
        gulmargStation.famousFor();
    }
}
