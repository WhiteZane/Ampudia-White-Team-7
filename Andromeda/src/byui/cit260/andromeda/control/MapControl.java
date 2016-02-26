/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

/**
 *
 * @author zane and oscar
 */
public class MapControl {

    String planets[][] = {
        //Local Cluster
        {"Earth", "0", "0"},
        {"Mars", "1", "1"},
        {"Jupiter", "4", "4"},
        {"Saturn", "8", "5"},
        {"Uranus", "18", "7"},
        {"Neptune", "30", "7"},
        //Crescent Nebula
        {"Naxel", "-120", "-280"},
        {"Thai", "-88", "-38"},
        {"Bergale", "0", "0"},
        {"Illium", "11", "4"},
        {"Ponolus", "46", "25"},
        //Nubian Expanse
        {"Gamayun","-25","36"},
        {"Alkonost","-21","5"},
        {"Bannik","0","0"},
        {"Pragia","13","-13"},
        {"Zimitra","34","-48"},
        //Krogan System
        {"Ruam","32","66"},
        {"Tuchanka","33","60"},
        {"Kruban","5","6"},
        {"Durak","0","0"},
        {"Kanin","-2","-1"},
        //Perseus Veil
        {"Uriyah","-2","6"},
        {"Rannoch","-2","2"},
        {"Geth Debris Field","0","0"},
        {"Geth Dreadnought","1","-1"},
        {"Migrant Fleet","2","-4"},
        {"Mass Relay","6","6"}
    };

    public double calcPlanetDistance(String fromPlanet, double x1, double y1, String toPlanet, double x2, double y2) {

        if ((x1 < -100 || x1 > 100) || (y1 < -100 || y1 > 100)) {
            return -1;

        }
        if ((x2 < -100 || x2 > 100) || (y2 < -100 || y2 > 100)) {
            return -1;
        }

        double isValid = 0;
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        for (int i = 0; i <= planets.length; i++) {
            try {
                if (fromPlanet.equals(planets[i][0])) {
                    if ((Double.parseDouble(planets[i][1]) == x1) && Double.parseDouble(planets[i][2]) == y1) {
                        isValid = 1;

                        for (int j = 0; j <= planets.length; j++) {
                            if (toPlanet.equals(planets[j][0]) && isValid == 1) {
                                if ((Double.parseDouble(planets[j][1]) == x2) && Double.parseDouble(planets[j][2]) == y2) {
                                    return distance;
                                } else {
                                    return -1;
                                }
                            }
                        }

                    } else {
                        return -1;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        return -1;
    }

    public double calcTime(double inputDistance, int speed, String fromPlanet, String toPlanet) {

        double distance = Math.round(planetDistance(fromPlanet, toPlanet) * 10) / 10.0;

        double time = distance / speed;

        if (distance == inputDistance && speed >= 6 && speed <= 8) {
            return time;
        }
        return -1;
    }

    public double planetDistance(String fromPlanet, String toPlanet) {

        //From planet coodinates
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;

        for (int i = 0; i <= planets.length - 1; i++) {
            if (fromPlanet.equals(planets[i][0])) {
                x1 = Double.parseDouble(planets[i][1]);
            }
            if (fromPlanet.equals(planets[i][0])) {
                y1 = Double.parseDouble(planets[i][2]);
            }
            if (toPlanet.equals(planets[i][0])) {
                x2 = Double.parseDouble(planets[i][1]);
            }
            if (toPlanet.equals(planets[i][0])) {
                y2 = Double.parseDouble(planets[i][2]);
            }
        }

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }
}
