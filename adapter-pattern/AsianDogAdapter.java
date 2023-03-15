public class AsianDogAdapter implements ILion {

   AsianDog dog;
   
   public AsianDogAdapter(AsianDog dog) {
      this.dog = dog;
   }
   
   public void roar() {
      dog.bark();
   }
}