public class Shelter {

    public int numberOfDogs;
    public int numberOfCats;
    public int lunch;
    public int lunchPrice;

    public Shelter(int numberOfDogs, int numberOfCats, int lunch, int lunchPrice) {

        this.numberOfDogs = numberOfDogs;
        this.numberOfCats = numberOfCats;
        this.lunch = lunch;
        this.lunchPrice = lunchPrice;
    }
        public static void CalcCatLunch (int numberOfCats, int lunch){
            int monthCatLunch = ((numberOfCats*3)*lunch*30)/1000;
            System.out.println("Amount of cat food per month: " + monthCatLunch + "kg.");
        }
        public static void CalcDogLunch (int numberOfDogs, int lunch){
            int monthDogLunch = ((numberOfDogs*3)*lunch*30)/1000;
            System.out.println("Amount of dog food per month: " + monthDogLunch + "kg.");
        }
        public static void CalcCash (int numberOfCats, int numberOfDogs, int lunch, int lunchPrice ) {
            int monthLunchCash =(((numberOfDogs*3*lunch*30)+(numberOfCats*3*lunch*30))/lunch)*lunchPrice ;
            System.out.println("Money for a month for food: " + monthLunchCash + "$");
        }
}
