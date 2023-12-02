public class TwentyOne {
    public static void main(String[] args) {
        Twenty cat = new Twenty();
        Twenty dog = new Twenty();

        cat.name = "puffy";
        dog.name = "pluto";

        System.out.println("catName : " + cat.name);
        System.out.println("dogName : " + dog.name);

        cat.planet = "Earth";
        System.out.println("catPlanet : " + cat.planet);
        System.out.println("dogPlanet : " + dog.planet);

        cat.planet = "Mars";
        System.out.println("catPlanet : " + cat.planet);
        System.out.println("dogPlanet : " + dog.planet);

        // catPlanet : Earth
        // dogPlanet : Earth
        // catPlanet : Mars
        // dogPlanet : Mars
        // this is happening because planet is static attribute
        // so all ob will share same value for this planet attribute
    }
}