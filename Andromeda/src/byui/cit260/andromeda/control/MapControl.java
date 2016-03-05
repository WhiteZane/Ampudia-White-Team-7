/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

import byui.cit260.andromeda.model.Map;
import byui.cit260.andromeda.model.Planet;

/**
 *
 * @author zane and oscar
 */
public class MapControl {

    /*    public static Map[] createPlanetList() {
    
    /////////////////////////////////////// Local Cluster
    Planet[] planet = new Planet[27];
    
    Planet Earth = new Planet();
    Earth.setDescription("This is Earth");
    Earth.setSystem("Local Cluster");
    Earth.setVisited(Boolean.FALSE);
    Earth.setExplored(Boolean.FALSE);
    Earth.setX(0);
    Earth.setY(0);
    Earth.setEnemy("");
    planet[Planet.Earth.ordinal()] = Earth;
    
    Planet Mars = new Planet();
    Mars.setDescription("This is Mars");
    Mars.setSystem("Local Cluster");
    Mars.setVisited(Boolean.FALSE);
    Mars.setExplored(Boolean.FALSE);
    Mars.setX(1);
    Mars.setY(1);
    Mars.setEnemy("Humans");
    planet[Planet.Mars.ordinal()] = Mars;
    
    Planet Jupiter = new Planet();
    Jupiter.setDescription("This is Jupiter");
    Jupiter.setSystem("Local Cluster");
    Jupiter.setVisited(Boolean.FALSE);
    Jupiter.setExplored(Boolean.FALSE);
    Jupiter.setX(4);
    Jupiter.setY(4);
    Jupiter.setEnemy("");
    planet[Planet.Jupiter.ordinal()] = Jupiter;
    
    Planet Saturn = new Planet();
    Saturn.setDescription("This is Saturn");
    Saturn.setSystem("Local Cluster");
    Saturn.setVisited(Boolean.FALSE);
    Saturn.setExplored(Boolean.FALSE);
    Saturn.setX(8);
    Saturn.setY(5);
    Saturn.setEnemy("");
    planet[Planet.Saturn.ordinal()] = Saturn;
    
    Planet Uranus = new Planet();
    Uranus.setDescription("This is Uranus");
    Uranus.setSystem("Local Cluster");
    Uranus.setVisited(Boolean.FALSE);
    Uranus.setExplored(Boolean.FALSE);
    Uranus.setX(18);
    Uranus.setY(7);
    Uranus.setEnemy("");
    planet[Planet.Uranus.ordinal()] = Uranus;
    
    Planet Neptune = new Planet();
    Neptune.setDescription("This is Neptune");
    Neptune.setSystem("Local Cluster");
    Neptune.setVisited(Boolean.FALSE);
    Neptune.setExplored(Boolean.FALSE);
    Neptune.setX(30);
    Neptune.setY(7);
    Neptune.setEnemy("");
    planet[Planet.Neptune.ordinal()] = Neptune;
    
    /////////////////////////////////////// Crescent Nebula
    Planet Naxell = new Planet();
    Naxell.setDescription("Naxell is an ammonia-methane ice giant. Several smaller energy corporations shut out of the big market in the Faia gateway system are attempting to develop a local helium-3 fuel mining infrastructure to service Illium. The leading investor is the human corporation Eldfell-Ashland Energy. Their efforts have been hampered by the extralegal presence the \"H-3 Cartels\" in Faia system can bring to bear, from simple price undercuts to bureaucratic obstructions (denied permits and constant \"health and safety\" inspections). ");
    Naxell.setSystem("Local Cluster");
    Naxell.setVisited(Boolean.FALSE);
    Naxell.setExplored(Boolean.FALSE);
    Naxell.setX(-120);
    Naxell.setY(-280);
    Naxell.setEnemy("");
    planet[Planet.Naxell.ordinal()] = Naxell;
    
    Planet Thail = new Planet();
    Thail.setName("Thail");
    Thail.setDescription("Thail is a typical hydrogen-helium gas giant. Its complex system of rings is unstable, dating back only a few million years. They are thought to be the shattered remains of a comet.");
    Thail.setSystem("Crescent Nebula");
    Thail.setVisited(Boolean.FALSE);
    Thail.setExplored(Boolean.FALSE);
    Thail.setX(-88);
    Thail.setY(-38);
    Thail.setEnemy("");
    planet[Planet.Thail.ordinal()] = Thail;
    
    Planet Beregale = new Planet();
    Beregale.setName("Beregale");
    Beregale.setDescription("While not a classical \"hothouse\" world like Venus, Beregalae [sic] is scarcely more hospitable. In addition to being the closest to the star Tasale, its core contains many radioactives and other heavy elements. These increase the heat of the planet and drive volcanism.\n"
    + "\n"
    + "Beregale's crust is too rigid for plate tectonics to function, and the planet will go through cycles in which the pressure builds to a massive super volcanic eruption. These spew ejecta over thousands of kilometers, leave caldera a hundred kilometers across, and spew enough molten material to repave entire continents. The last such event was 812,000 years ago; the current rate of outgassing from volcanic hot spots suggests another will occur within the next 10 millennia. ");
    Beregale.setSystem("Crescent Nebula");
    Beregale.setVisited(Boolean.FALSE);
    Beregale.setExplored(Boolean.FALSE);
    Beregale.setX(0);
    Beregale.setY(0);
    Beregale.setEnemy("");
    planet[Planet.Beregale.ordinal()] = Beregale;
    
    Planet Illium = new Planet();
    Illium.setName("Illium");
    Illium.setDescription("Illium is a classic garden world, developed to serve as entrepot between the Terminus Systems and the Asari Republics. To abet this trade, the normally stringent customs laws of Council space on product safety, proscribed materials, and sapient trafficking are relaxed. Officially Illium is not an asari world; it is colonized and operated by asari corporate interests. This gives it the same legal latitude enjoyed by the human corporate research enclaves of Noveria.\n"
    + "\n"
    + "Illium is one of the youngest asari colonies settled during the 7th Expansion Wave. The first child born on the world is only now reaching her middle-age. The world is hot and massive; ground settlement is only possible at the higher polar latitudes. In more equatorial locations, the population is housed in arcology skyscrapers to escape the heat of the surface. ");
    Illium.setSystem("Crescent Nebula");
    Illium.setVisited(Boolean.FALSE);
    Illium.setExplored(Boolean.FALSE);
    Illium.setX(11);
    Illium.setY(4);
    Illium.setEnemy("Asari");
    planet[Planet.Illium.ordinal()] = Illium;
    
    Planet Ponolus = new Planet();
    Ponolus.setName("Ponolus");
    Ponolus.setDescription("A fairly typical Venusian \"hothouse\", Ponolus seems almost tame compared to the violent volcanic outbursts of the inner world Beregale. In contrast, Ponolus is nearly inert, with no active volcanoes or plate tectonics. The most dramatic event in the last million years was the foundering of the asari aerostat research platform Alviusic in 2092, which fell after being holed by an improbably unlucky meteor. Most of the crew successfully reached escape capsules, but six were lost. The crushed wreck of the platform now lies on the Kriusite Plain in the southern hemisphere.");
    Ponolus.setSystem("Crescent Nebula");
    Ponolus.setVisited(Boolean.FALSE);
    Ponolus.setExplored(Boolean.FALSE);
    Ponolus.setX(46);
    Ponolus.setY(25);
    Ponolus.setEnemy("Pirates");
    planet[Planet.Ponolus.ordinal()] = Ponolus;
    
    /////////////////////////////////////// Nubian Expanse
    Planet Gamayun = new Planet();
    Gamayun.setName("Gamayun");
    Gamayun.setDescription("Gamayun is a hydrogen-helium gas giant with six large, icy moons. The outermost one, Gigula, is of note for a well-preserved wreckage of an ancient starship that was recognized by a turian military surveyor. Little information has been released to the public on the vessel, aside from a scholarly paper regarding how the internal layout suggests a horizontally-oriented race.");
    Gamayun.setSystem("Nubian Expanse");
    Gamayun.setVisited(Boolean.FALSE);
    Gamayun.setExplored(Boolean.FALSE);
    Gamayun.setX(-25);
    Gamayun.setY(36);
    Gamayun.setEnemy("");
    planet[Planet.Gamayun.ordinal()] = Gamayun;
    
    Planet Alkonost = new Planet();
    Alkonost.setName("Alkonost");
    Alkonost.setDescription("Alkonost is a standard ice giant with a methane-ammonia atmosphere. It has an unusually strong magnetic field, which is occasionally useful when ships need to discharge their drives. ");
    Alkonost.setSystem("Nubian Expanse");
    Alkonost.setVisited(Boolean.FALSE);
    Alkonost.setExplored(Boolean.FALSE);
    Alkonost.setX(-21);
    Alkonost.setY(5);
    Alkonost.setEnemy("");
    planet[Planet.Alkonost.ordinal()] = Alkonost;
    
    Planet Bannik = new Planet();
    Bannik.setName("Bannik");
    Bannik.setDescription("Bannik is a large, superterrestrial \"hothouse\" with a crushing carbon dioxide atmosphere. A high density of over 7 grams per cubic centimeter indicates that Bannik is a mineralogical treasure trove. If only there were some way to safely reach its seas of molten metal and lodes of radioactives. The planet's mass is so great that trace amounts of helium and molecular hydrogen can be found in the atmosphere. ");
    Bannik.setSystem("Nubian Expanse");
    Bannik.setVisited(Boolean.FALSE);
    Bannik.setExplored(Boolean.FALSE);
    Bannik.setX(0);
    Bannik.setY(0);
    Bannik.setEnemy("");
    planet[Planet.Bannik.ordinal()] = Bannik;
    
    Planet Pragia = new Planet();
    Pragia.setName("Pragia");
    Pragia.setDescription("The jungle-planet Pragia is overrun by choking hypergrowth caused by industrially mutated plant species. This, combined with its relative isolation and lack of population, has made Pragia an occasional base of operations for drug runners, weapons smugglers, pirates, mercenaries, terrorists, and intelligence agents seeking secrecy. Sustained habitation on Pragia is extremely difficult; mutant and even poisonous plant life can overgrow colonies in days instead of years. ");
    Pragia.setSystem("Nubian Expanse");
    Pragia.setVisited(Boolean.FALSE);
    Pragia.setExplored(Boolean.FALSE);
    Pragia.setX(13);
    Pragia.setY(-13);
    Pragia.setEnemy("Mercenaries");
    planet[Planet.Pragia.ordinal()] = Pragia;
    
    Planet Zimitra = new Planet();
    Zimitra.setName("Zimitra");
    Zimitra.setDescription("Cold, distant Zirnitra has an extremely low density and is thought to be mainly ice around a small rocky core. It has little to recommend it. ");
    Zimitra.setSystem("Nubian Expanse");
    Zimitra.setVisited(Boolean.FALSE);
    Zimitra.setExplored(Boolean.FALSE);
    Zimitra.setX(34);
    Zimitra.setY(-48);
    Zimitra.setEnemy("Pirates");
    planet[Planet.Zimitra.ordinal()] = Zimitra;
    
    /////////////////////////////////////// Krogan System
    Planet Ruam = new Planet();
    Ruam.setName("Ruam");
    Ruam.setDescription("The smaller of Aralakh's hydrogen-helium gas giants maintains a small helium-3 recovery infrastructure. Although the depth of Ruam's gravity well makes it inefficient to export, visitors to Aralakh system often \"top off\" their fuel tanks at Ruam's stations. The Council Demilitarization Enforcement Mission (CDEM) maintains a token garrison to monitor any potential sale of fuel to known subversives and terrorists. ");
    Ruam.setSystem("Krogan System");
    Ruam.setVisited(Boolean.FALSE);
    Ruam.setExplored(Boolean.FALSE);
    Ruam.setX(32);
    Ruam.setY(66);
    Ruam.setEnemy("");
    planet[Planet.Ruam.ordinal()] = Ruam;
    
    Planet Tuchanka = new Planet();
    Tuchanka.setName("Tuchanka");
    Tuchanka.setDescription("Scarred by bombardment craters, radioactive rubble, choking ash, salt flats, and alkaline seas, Tuchanka, the krogan homeworld, can barely support life. Thousands of years ago life grew in fierce abundance under the F-class star Aralakh (a Raik clan word meaning \"Eye of Wrath\"). Tree analogs grew in thick jungles, their roots growing out of shallow silty seas. Life fed upon life in an evolutionary crucible. This world died in nuclear firestorms after the krogan split the atom. A \"little ice age\" of nuclear winter killed off the remaining plant life. In recent centuries many krogan have returned to their homeworld. The reduced albedo has caused global temperatures to rise. In order to maintain livable temperatures, a vast shroud was assembled at the L1 Lagrange point. It is maintained by the Council Demilitarization Enforcement Mission (CDEM) which is based on orbiting battlestations.\n"
    + "\n"
    + "CDEM ADVISORY: Visitors to Tuchanka land at their own risk. The CDEM will not attempt to extract citizens threatened by clan warfare.\n"
    + "\n"
    + "TRAVEL ADVISORY: The ecology of Tuchanka is deadly. Nearly every native species engages in some predatory behavior; even the remaining vegetation is carnivorous. Travel beyond guarded areas is strongly discouraged. ");
    Tuchanka.setSystem("Krogan System");
    Tuchanka.setVisited(Boolean.FALSE);
    Tuchanka.setExplored(Boolean.FALSE);
    Tuchanka.setX(33);
    Tuchanka.setY(60);
    Tuchanka.setEnemy("Krogan");
    planet[Planet.Tuchanka.ordinal()] = Tuchanka;
    
    Planet Kruban = new Planet();
    Kruban.setName("Kruban");
    Kruban.setDescription("Kruban is a tidally locked Venusian hothouse. Its surface is perpetually obscured by clouds of sulfur and carbon dioxide. The first group of krogan brought into orbit by the salarian uplift teams requested a trip to Kruban. The salarians at first thought the krogan were confused about the nature of Kruban's environment; the planet is named for a krogan mythological paradise in which honorable warriors feast on the internal organs of their enemies. In fact, krogan astronomers had correctly deduced the nature of Kruban in the years before the global holocaust. In the two millennia since Kruban had come to be thought of as an ideal test of one's toughness. Every year a few krogan attempt to land on Kruban and exit their ships naked in an attempt to prove their \"kroganhood\". The planet's surface is littered with the crushed, corroded remains of their ships. Only one, Shath Norda, is known to have returned from the surface alive, albeit with most of his bones crushed and all four of his lungs damaged by sulfuric gas. Norda recovered from his trial to earn the adulation of his people. Until he died in 1943 he could lay with any fertile female he wished. ");
    Kruban.setSystem("Krogan System");
    Kruban.setVisited(Boolean.FALSE);
    Kruban.setExplored(Boolean.FALSE);
    Kruban.setX(5);
    Kruban.setY(6);
    Kruban.setEnemy("Krogan");
    planet[Planet.Kruban.ordinal()] = Kruban;
    
    Planet Durak = new Planet();
    Durak.setName("Durak");
    Durak.setDescription("Durak is a small, heat-blasted rock lost in the blinding glare of the star Aralakh. It occasionally traps a trace atmosphere of gases blown in on Aralakh's powerful solar wind, which inevitably blows the gases back out again. The planetoid has a few valuable lodes of heavy metals, which were sporadically mined by the krogan at the height of their power. In the closing years of the Rebellions the five clans working the planetoid fell to fighting over a particularly rich deposit of iridium. All five clan warlords agreed to a Crush (a meeting at a neutral location) to negotiate a truce. Unfortunately, all five arrived planning to betray their fellows. While the leaders and their seconds met, all their bases were destroyed by simultaneous hypervelocity cannon strikes. Left with only the food, water, and air in their hardsuits and with no way to call for rescue the warlords apparently fought each other to the death. The survivors of the five \"Durak clans\" on Tuchanka still argue about which clan's warlord was the last one standing. ");
    Durak.setSystem("Krogan System");
    Durak.setVisited(Boolean.FALSE);
    Durak.setExplored(Boolean.FALSE);
    Durak.setX(0);
    Durak.setY(0);
    Durak.setEnemy("Krogan");
    planet[Planet.Durak.ordinal()] = Durak;
    
    Planet Kanin = new Planet();
    Kanin.setName("Kanin");
    Kanin.setDescription("One of Kanin's hemispheres contains an impact crater 700 kilometers in diameter. Dubbed the Renkat Basin, it was mined for light metals in the interbellum between the Rachni War and Krogan Rebellions. Any obvious resource concentrations have long since been stripped. ");
    Kanin.setSystem("Krogan System");
    Kanin.setVisited(Boolean.FALSE);
    Kanin.setExplored(Boolean.FALSE);
    Kanin.setX(-2);
    Kanin.setY(-1);
    Kanin.setEnemy("");
    planet[Planet.Kanin.ordinal()] = Kanin;
    
    /////////////////////////////////////// Perseus Veil
    Planet Uriyah = new Planet();
    Uriyah.setName("Uriyah");
    Uriyah.setDescription("Tikkun's asteroid belt is home to Uriyah, a rock large enough to qualify as a binary dwarf planet. Its companion, Etiel, is believed to have split off from the main body after an oblique impact. Both were heavily mined early in the age of quarian space exploration. Curiously, the geth have built over the old quarian space stations, even though the mined-out asteroids have little obvious use. The current theory is that they provide a staging base to exploit other asteroids in the belt. ");
    Uriyah.setSystem("Perseus Veil");
    Uriyah.setVisited(Boolean.FALSE);
    Uriyah.setExplored(Boolean.FALSE);
    Uriyah.setX(-2);
    Uriyah.setY(6);
    Uriyah.setEnemy("Geth");
    planet[Planet.Uriyah.ordinal()] = Uriyah;
    
    Planet Rannoch = new Planet();
    Rannoch.setName("Rannoch");
    Rannoch.setDescription("Although its orange sun is only about 90% the mass of Sol and half as luminous, Rannoch is arid by Earth standards because it formed closer to its star and has slightly less ocean coverage. Photosynthetic life is concentrated around rivers and oceans, with large expanses of desert in between. The importance of plant life and shade in ancient quarian culture is evident in the translation of Rannoch's name -- \"walled garden.\"\n"
    + "\n"
    + "To a starship's sensors, the most obvious feature of the quarian homeworld is the numerous heat sources in orbit. Thousands of geth space stations watch over the planet. Somewhere in this artificial swarm of constructions lurks the geth armada, waiting for its moment to counterattack. ");
    Rannoch.setSystem("Perseus Veil");
    Rannoch.setVisited(Boolean.FALSE);
    Rannoch.setExplored(Boolean.FALSE);
    Rannoch.setX(-2);
    Rannoch.setY(2);
    Rannoch.setEnemy("Geth");
    planet[Planet.Rannoch.ordinal()] = Rannoch;
    
    Planet GethDebrisField = new Planet();
    GethDebrisField.setName("Geth Debris Field");
    GethDebrisField.setDescription("Close to the star, the Excelsior's scanner can detect a nigh-uncountable number of geth statites -- satellites that use solar sails to self-correct their position. The geth placed the ultra-lightweight constructions around the sun to collect energy, arranged in a vast array known as a Dyson bubble. Scattered among them are space stations and servers that draw power from the statites through wireless energy transfer.\n"
    + "\n"
    + "Most of the space stations are wreckage now, and no small number of solar sails have also been destroyed. It appears the quarians began to destroy them but were stopped before the attack was complete. ");
    GethDebrisField.setSystem("Perseus Veil");
    GethDebrisField.setVisited(Boolean.FALSE);
    GethDebrisField.setExplored(Boolean.FALSE);
    GethDebrisField.setX(0);
    GethDebrisField.setY(0);
    GethDebrisField.setEnemy("Geth");
    planet[Planet.GethDebrisField.ordinal()] = GethDebrisField;
    
    Planet GethDreadnought = new Planet();
    GethDreadnought.setName("Geth Dreadnought");
    GethDreadnought.setDescription("Scans of the geth dreadnought orbiting Rannoch reveal an intimidating array of features, from an improved main gun and ultraviolet antiship lasers to increased thruster output. The geth workforce never demands rest, wages, or autonomy, and in the creation of their flagship, they were limited only by time and raw materials. The damage inflicted by the quarian fleet appears minor at best. ");
    GethDreadnought.setSystem("Perseus Veil");
    GethDreadnought.setVisited(Boolean.FALSE);
    GethDreadnought.setExplored(Boolean.FALSE);
    GethDreadnought.setX(1);
    GethDreadnought.setY(-1);
    GethDreadnought.setEnemy("Geth");
    planet[Planet.GethDreadnought.ordinal()] = GethDreadnought;
    
    Planet MigrantFleet = new Planet();
    MigrantFleet.setName("Migrant Fleet");
    MigrantFleet.setDescription("Also known as the Flotilla, the Migrant Fleet is the massive collection of starships that became home to the quarians after they were driven from their home world by the geth. The Migrant Fleet consists of roughly fifty thousand ships that house seventeen million quarians in total. The Fleet is so large it can take days for all the ships to pass through a mass relay. Some of the vessels date from the original flight from the geth three centuries ago.\n"
    + "\n"
    + "The Migrant Fleet is rarely welcoming to outsiders, as any risk to the Fleet is a risk to the quarian species. Quarians rarely leave except to go on Pilgrimage; ships sometimes leave on an individual basis to pursue their own goals, on missions that can last days or years, but usually return. As Tali'Zorah nar Rayya describes her culture: \"Home is a state of mind.\" ");
    MigrantFleet.setSystem("Perseus Veil");
    MigrantFleet.setVisited(Boolean.FALSE);
    MigrantFleet.setExplored(Boolean.FALSE);
    MigrantFleet.setX(2);
    MigrantFleet.setY(-4);
    MigrantFleet.setEnemy("");
    planet[Planet.MigrantFleet.ordinal()] = MigrantFleet;
    
    Planet MassRelay = new Planet();
    MassRelay.setName("Mass Relay");
    MassRelay.setDescription("Mass Relays are mass transit devices scattered throughout the galaxy, usually located within star systems. They form an enormous network allowing interstellar travel. Hailed as one of the greatest achievements of the extinct Protheans, a mass relay can transport starships instantaneously to another relay within the network, allowing for journeys that would otherwise take years or even centuries with only FTL drives. ");
    MassRelay.setSystem("Perseus Veil");
    MassRelay.setVisited(Boolean.FALSE);
    MassRelay.setExplored(Boolean.FALSE);
    MassRelay.setX(66);
    MassRelay.setY(66);
    MassRelay.setEnemy("");
    planet[Planet.MassRelay.ordinal()] = MassRelay;
    
    return planet;
    }*/    
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
        {"Thail", "-88", "-38"},
        {"Bergale", "0", "0"},
        {"Illium", "11", "4"},
        {"Ponolus", "46", "25"},
        //Nubian Expanse
        {"Gamayun", "-25", "36"},
        {"Alkonost", "-21", "5"},
        {"Bannik", "0", "0"},
        {"Pragia", "13", "-13"},
        {"Zimitra", "34", "-48"},
        //Krogan System
        {"Ruam", "32", "66"},
        {"Tuchanka", "33", "60"},
        {"Kruban", "5", "6"},
        {"Durak", "0", "0"},
        {"Kanin", "-2", "-1"},
        //Perseus Veil
        {"Uriyah", "-2", "6"},
        {"Rannoch", "-2", "2"},
        {"Geth Debris Field", "0", "0"},
        {"Geth Dreadnought", "1", "-1"},
        {"Migrant Fleet", "2", "-4"},
        {"Mass Relay", "66", "66"}
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
