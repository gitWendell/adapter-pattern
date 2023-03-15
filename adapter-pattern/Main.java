import java.io.*;

class Main {
   
   public static void main(String[] args) {
      ILion african_lion = new AfricanLion();
      ILion asian_lion = new AsianLion();
      ILion asian_dog_adapter = new AsianDogAdapter(new AsianDog());
      
      Hunter hunter = new Hunter();
      
      hunter.hunt(african_lion);
      hunter.hunt(asian_lion);
      hunter.hunt(asian_dog_adapter);
   }
}