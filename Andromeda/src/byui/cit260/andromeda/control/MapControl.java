/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

import byui.cit260.andromeda.model.Map;
import byui.cit260.andromeda.model.Material;
import byui.cit260.andromeda.model.Planet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zane and oscar
 */
public class MapControl {

    public static List<Map> createMap() {
        List<Map> system = new ArrayList<>();

        Map LocalCluster = new Map();
        LocalCluster.setSystem("Local Cluster");
        LocalCluster.setPlanets(createPlanetList("Local Cluster"));
        LocalCluster.setCoordinates("LC");

        system.add(LocalCluster);

        Map CrescentNebula = new Map();
        CrescentNebula.setSystem("Crescent Nebula");
        CrescentNebula.setPlanets(createPlanetList("Crescent Nebula"));
        CrescentNebula.setCoordinates("CN");
        system.add(CrescentNebula);

        Map NubianExpanse = new Map();
        NubianExpanse.setSystem("Nubian Expanse");
        NubianExpanse.setPlanets(createPlanetList("Nubian Expanse"));
        NubianExpanse.setCoordinates("NE");
        system.add(NubianExpanse);

        Map KroganDMZ = new Map();
        KroganDMZ.setSystem("Krogan DMZ");
        KroganDMZ.setPlanets(createPlanetList("Krogan DMZ"));
        KroganDMZ.setCoordinates("KD");
        system.add(KroganDMZ);

        Map PerseusVeil = new Map();
        PerseusVeil.setSystem("Perseus Veil");
        PerseusVeil.setPlanets(createPlanetList("Perseus Veil"));
        PerseusVeil.setCoordinates("PV");
        system.add(PerseusVeil);

        return system;
    }

    public static List<Planet> createPlanetList(String system) {
            List<Planet> planetList = new ArrayList<>();

        if (system == "Local Cluster") {
            // Local Cluster
            //<editor-fold defaultstate="collapsed" desc="comment">
            Planet Earth = new Planet();
            Earth.setName("Earth");
            Earth.setDescription("This is Earth");
            Earth.setSystem(system);
            Earth.setVisited(Boolean.TRUE);
            Earth.setExplored(Boolean.FALSE);
            Earth.setX(0);
            Earth.setY(0);
            Earth.setEnemy("");
            planetList.add(Earth);

            Planet Mars = new Planet();
            Mars.setName("Mars");
            Mars.setDescription("This is Mars");
            Mars.setSystem(system);
            Mars.setVisited(Boolean.FALSE);
            Mars.setExplored(Boolean.FALSE);
            Mars.setX(1);
            Mars.setY(1);
            Mars.setEnemy("Humans");
            planetList.add(Mars);

            Planet Jupiter = new Planet();
            Jupiter.setName("Jupiter");
            Jupiter.setDescription("This is Jupiter");
            Jupiter.setSystem(system);
            Jupiter.setVisited(Boolean.FALSE);
            Jupiter.setExplored(Boolean.FALSE);
            Jupiter.setX(4);
            Jupiter.setY(4);
            Jupiter.setEnemy("");
            planetList.add(Jupiter);

            Planet Saturn = new Planet();
            Saturn.setName("Saturn");
            Saturn.setDescription("This is Saturn");
            Saturn.setSystem(system);
            Saturn.setVisited(Boolean.FALSE);
            Saturn.setExplored(Boolean.FALSE);
            Saturn.setX(8);
            Saturn.setY(5);
            Saturn.setEnemy("");
            planetList.add(Saturn);

            Planet Uranus = new Planet();
            Uranus.setName("Uranus");
            Uranus.setDescription("This is Uranus");
            Uranus.setSystem(system);
            Uranus.setVisited(Boolean.FALSE);
            Uranus.setExplored(Boolean.FALSE);
            Uranus.setX(18);
            Uranus.setY(7);
            Uranus.setEnemy("");
            planetList.add(Uranus);

            Planet Neptune = new Planet();
            Neptune.setName("Neptune");
            Neptune.setDescription("This is Neptune");
            Neptune.setSystem(system);
            Neptune.setVisited(Boolean.FALSE);
            Neptune.setExplored(Boolean.FALSE);
            Neptune.setX(30);
            Neptune.setY(7);
            Neptune.setEnemy("");
            planetList.add(Neptune);
//</editor-fold>
        }
        if (system == "Crescent Nebula") {
            // Crescent Nebula
            //<editor-fold defaultstate="collapsed" desc="comment">
            Planet Naxell = new Planet();
            Naxell.setName("Naxell");
            Naxell.setDescription(
                    "Naxell is an ammonia-methane ice giant. Several smaller energy "
                    + "\ncorporations shut out of the big market in the Faia gateway "
                    + "\nsystem are attempting to develop a local helium-3 fuel mining "
                    + "\ninfrastructure to service Illium. The leading investor is the "
                    + "\nhuman corporation Eldfell-Ashland Energy. Their efforts have "
                    + "\nbeen hampered by the extralegal presence the \"H-3 Cartels\" "
                    + "\nin Faia system can bring to bear, from simple price undercuts "
                    + "\nto bureaucratic obstructions (denied permits and constant "
                    + "\n\"health and safety\" inspections). ");
            Naxell.setSystem(system);
            Naxell.setVisited(Boolean.FALSE);
            Naxell.setExplored(Boolean.FALSE);
            Naxell.setX(-120);
            Naxell.setY(-280);
            Naxell.setEnemy("");
            planetList.add(Naxell);

            Planet Thail = new Planet();
            Thail.setName("Thail");
            Thail.setDescription(
                    "Thail is a typical hydrogen-helium gas giant. Its complex system "
                    + "\nof rings is unstable, dating back only a few million years. "
                    + "\nThey are thought to be the shattered remains of a comet.");
            Thail.setSystem(system);
            Thail.setVisited(Boolean.FALSE);
            Thail.setExplored(Boolean.FALSE);
            Thail.setX(-88);
            Thail.setY(-38);
            Thail.setEnemy("");
            planetList.add(Thail);

            Planet Beregale = new Planet();
            Beregale.setName("Beregale");
            Beregale.setDescription(
                    "While not a classical \"hothouse\" world like Venus, Beregalae "
                    + "\n[sic] is scarcely more hospitable. In addition to being the "
                    + "\nclosest to the star Tasale, its core contains many radioactives "
                    + "\nand other heavy elements. These increase the heat of the planet "
                    + "\nand drive volcanism.\n"
                    + "\n"
                    + "\nBeregale's crust is too rigid for plate tectonics to function, "
                    + "\nand the planet will go through cycles in which the pressure "
                    + "\nbuilds to a massive super volcanic eruption. These spew ejecta "
                    + "\nover thousands of kilometers, leave caldera a hundred kilometers "
                    + "\nacross, and spew enough molten material to repave entire "
                    + "\ncontinents. The last such event was 812,000 years ago; the "
                    + "\ncurrent rate of outgassing from volcanic hot spots suggests "
                    + "\nanother will occur within the next 10 millennia. ");
            Beregale.setSystem(system);
            Beregale.setVisited(Boolean.FALSE);
            Beregale.setExplored(Boolean.FALSE);
            Beregale.setX(0);
            Beregale.setY(0);
            Beregale.setEnemy("");
            planetList.add(Beregale);

            Planet Illium = new Planet();
            Illium.setName("Illium");
            Illium.setDescription(
                    "Illium is a classic garden world, developed to serve as entrepot "
                    + "\nbetween the Terminus Systems and the Asari Republics. To abet "
                    + "\nthis trade, the normally stringent customs laws of Council space "
                    + "\non product safety, proscribed materials, and sapient trafficking "
                    + "\nare relaxed. Officially Illium is not an asari world; it is "
                    + "\ncolonized and operated by asari corporate interests. This gives "
                    + "\nit the same legal latitude enjoyed by the human corporate research "
                    + "\nenclaves of Noveria.\n"
                    + "\n"
                    + "\nIllium is one of the youngest asari colonies settled during the "
                    + "\n7th Expansion Wave. The first child born on the world is only "
                    + "\nnow reaching her middle-age. The world is hot and massive; ground "
                    + "\nsettlement is only possible at the higher polar latitudes. In "
                    + "\nmore equatorial locations, the population is housed in arcology "
                    + "\nskyscrapers to escape the heat of the surface. ");
            Illium.setSystem(system);
            Illium.setVisited(Boolean.FALSE);
            Illium.setExplored(Boolean.FALSE);
            Illium.setX(11);
            Illium.setY(4);
            Illium.setEnemy("Asari");
            planetList.add(Illium);

            Planet Ponolus = new Planet();
            Ponolus.setName("Ponolus");
            Ponolus.setDescription(
                    "A fairly typical Venusian \"hothouse\", Ponolus seems almost tame "
                    + "\ncompared to the violent volcanic outbursts of the inner world "
                    + "\nBeregale. In contrast, Ponolus is nearly inert, with no active "
                    + "\nvolcanoes or plate tectonics. The most dramatic event in the "
                    + "\nlast million years was the foundering of the asari aerostat "
                    + "\nresearch platform Alviusic in 2092, which fell after being holed "
                    + "\nby an improbably unlucky meteor. Most of the crew successfully "
                    + "\nreached escape capsules, but six were lost. The crushed wreck "
                    + "\nof the platform now lies on the Kriusite Plain in the southern "
                    + "\nhemisphere.");
            Ponolus.setSystem(system);
            Ponolus.setVisited(Boolean.FALSE);
            Ponolus.setExplored(Boolean.FALSE);
            Ponolus.setX(46);
            Ponolus.setY(25);
            Ponolus.setEnemy("Pirates");
            planetList.add(Ponolus);
//</editor-fold>
        }
        if (system == "Nubian Expanse") {
            // Nubian Expanse
            //<editor-fold defaultstate="collapsed" desc="comment">
            Planet Gamayun = new Planet();
            Gamayun.setName("Gamayun");
            Gamayun.setDescription(
                    "Gamayun is a hydrogen-helium gas giant with six large, icy moons. "
                    + "\nThe outermost one, Gigula, is of note for a well-preserved "
                    + "\nwreckage of an ancient starship that was recognized by a turian "
                    + "\nmilitary surveyor. Little information has been released to the "
                    + "\npublic on the vessel, aside from a scholarly paper regarding "
                    + "\nhow the internal layout suggests a horizontally-oriented race.");
            Gamayun.setSystem(system);
            Gamayun.setVisited(Boolean.FALSE);
            Gamayun.setExplored(Boolean.FALSE);
            Gamayun.setX(-25);
            Gamayun.setY(36);
            Gamayun.setEnemy("");
            planetList.add(Gamayun);

            Planet Alkonost = new Planet();
            Alkonost.setName("Alkonost");
            Alkonost.setDescription(
                    "Alkonost is a standard ice giant with a methane-ammonia atmosphere. "
                    + "\nIt has an unusually strong magnetic field, which is occasionally "
                    + "\nuseful when ships need to discharge their drives. ");
            Alkonost.setSystem(system);
            Alkonost.setVisited(Boolean.FALSE);
            Alkonost.setExplored(Boolean.FALSE);
            Alkonost.setX(-21);
            Alkonost.setY(5);
            Alkonost.setEnemy("");
            planetList.add(Alkonost);

            Planet Bannik = new Planet();
            Bannik.setName("Bannik");
            Bannik.setDescription(
                    "Bannik is a large, superterrestrial \"hothouse\" with a crushing "
                    + "\ncarbon dioxide atmosphere. A high density of over 7 grams per "
                    + "\ncubic centimeter indicates that Bannik is a mineralogical treasure "
                    + "\ntrove. If only there were some way to safely reach its seas of "
                    + "\nmolten metal and lodes of radioactives. The planet's mass is so "
                    + "\ngreat that trace amounts of helium and molecular hydrogen can "
                    + "\nbe found in the atmosphere. ");
            Bannik.setSystem(system);
            Bannik.setVisited(Boolean.FALSE);
            Bannik.setExplored(Boolean.FALSE);
            Bannik.setX(0);
            Bannik.setY(0);
            Bannik.setEnemy("");
            planetList.add(Bannik);

            Planet Pragia = new Planet();
            Pragia.setName("Pragia");
            Pragia.setDescription(
                    "The jungle-planet Pragia is overrun by choking hypergrowth caused "
                    + "\nby industrially mutated plant species. This, combined with its "
                    + "\nrelative isolation and lack of population, has made Pragia an "
                    + "\noccasional base of operations for drug runners, weapons smugglers, "
                    + "\npirates, mercenaries, terrorists, and intelligence agents seeking "
                    + "\nsecrecy. Sustained habitation on Pragia is extremely difficult; "
                    + "\nmutant and even poisonous plant life can overgrow colonies in "
                    + "\ndays instead of years. ");
            Pragia.setSystem(system);
            Pragia.setVisited(Boolean.FALSE);
            Pragia.setExplored(Boolean.FALSE);
            Pragia.setX(13);
            Pragia.setY(-13);
            Pragia.setEnemy("Mercenaries");
            planetList.add(Pragia);

            Planet Zimitra = new Planet();
            Zimitra.setName("Zimitra");
            Zimitra.setDescription(
                    "Cold, distant Zirnitra has an extremely low density and is thought "
                    + "\nto be mainly ice around a small rocky core. It has little to "
                    + "\nrecommend it. ");
            Zimitra.setSystem(system);
            Zimitra.setVisited(Boolean.FALSE);
            Zimitra.setExplored(Boolean.FALSE);
            Zimitra.setX(34);
            Zimitra.setY(-48);
            Zimitra.setEnemy("Pirates");
            planetList.add(Zimitra);
//</editor-fold>
        }
        if (system == "Krogan DMZ") {
            // Krogan DMZ
            //<editor-fold defaultstate="collapsed" desc="comment">
            Planet Ruam = new Planet();
            Ruam.setName("Ruam");
            Ruam.setDescription(
                    "\nThe smaller of Aralakh's hydrogen-helium gas giants maintains "
                    + "\na small helium-3 recovery infrastructure. Although the depth "
                    + "\nof Ruam's gravity well makes it inefficient to export, visitors "
                    + "\nto Aralakh system often \"top off\" their fuel tanks at Ruam's "
                    + "\nstations. The Council Demilitarization Enforcement Mission (CDEM) "
                    + "\nmaintains a token garrison to monitor any potential sale of "
                    + "\nfuel to known subversives and terrorists. ");
            Ruam.setSystem(system);
            Ruam.setVisited(Boolean.FALSE);
            Ruam.setExplored(Boolean.FALSE);
            Ruam.setX(32);
            Ruam.setY(66);
            Ruam.setEnemy("");
            planetList.add(Ruam);

            Planet Tuchanka = new Planet();
            Tuchanka.setName("Tuchanka");
            Tuchanka.setDescription(
                    "Scarred by bombardment craters, radioactive rubble, choking ash, "
                    + "\nsalt flats, and alkaline seas, Tuchanka, the krogan homeworld, "
                    + "\ncan barely support life. Thousands of years ago life grew in "
                    + "\nfierce abundance under the F-class star Aralakh (a Raik clan "
                    + "\nword meaning \"Eye of Wrath\"). Tree analogs grew in thick "
                    + "\njungles, their roots growing out of shallow silty seas. Life "
                    + "\nfed upon life in an evolutionary crucible. This world died in "
                    + "\nnuclear firestorms after the krogan split the atom. A \"little"
                    + "\nice age\" of nuclear winter killed off the remaining plant "
                    + "\nlife. In recent centuries many krogan have returned to their "
                    + "\nhomeworld. The reduced albedo has caused global temperatures "
                    + "\nto rise. In order to maintain livable temperatures, a vast "
                    + "\nshroud was assembled at the L1 Lagrange point. It is maintained "
                    + "\nby the Council Demilitarization Enforcement Mission (CDEM) which "
                    + "\nis based on orbiting battlestations.\n"
                    + "\n"
                    + "\nCDEM ADVISORY: Visitors to Tuchanka land at their own risk. "
                    + "\nThe CDEM will not attempt to extract citizens threatened by "
                    + "\nclan warfare.\n"
                    + "\n"
                    + "\nTRAVEL ADVISORY: The ecology of Tuchanka is deadly. Nearly every"
                    + "\nnative species engages in some predatory behavior; even the "
                    + "\nremaining vegetation is carnivorous. Travel beyond guarded "
                    + "\nareas is strongly discouraged. ");
            Tuchanka.setSystem(system);
            Tuchanka.setVisited(Boolean.FALSE);
            Tuchanka.setExplored(Boolean.FALSE);
            Tuchanka.setX(33);
            Tuchanka.setY(60);
            Tuchanka.setEnemy("Krogan");
            planetList.add(Tuchanka);

            Planet Kruban = new Planet();
            Kruban.setName("Kruban");
            Kruban.setDescription(
                    "Kruban is a tidally locked Venusian hothouse. Its surface is "
                    + "\nperpetually obscured by clouds of sulfur and carbon dioxide. "
                    + "\nThe first group of krogan brought into orbit by the salarian "
                    + "\nuplift teams requested a trip to Kruban. The salarians at "
                    + "\nfirst thought the krogan were confused about the nature of "
                    + "\nKruban's environment; the planet is named for a krogan "
                    + "\nmythological paradise in which honorable warriors feast on the"
                    + "\ninternal organs of their enemies. In fact, krogan astronomers"
                    + "\nhad correctly deduced the nature of Kruban in the years before"
                    + "\nthe global holocaust. In the two millennia since Kruban had "
                    + "\ncome to be thought of as an ideal test of one's toughness. "
                    + "\nEvery year a few krogan attempt to land on Kruban and exit "
                    + "\ntheir ships naked in an attempt to prove their \"kroganhood\". "
                    + "\nThe planet's surface is littered with the crushed, corroded "
                    + "\nremains of their ships. Only one, Shath Norda, is known to have"
                    + "\nreturned from the surface alive, albeit with most of his bones"
                    + "\ncrushed and all four of his lungs damaged by sulfuric gas. "
                    + "\nNorda recovered from his trial to earn the adulation of his "
                    + "\npeople. Until he died in 1943 he could lay with any fertile "
                    + "\nfemale he wished. ");
            Kruban.setSystem(system);
            Kruban.setVisited(Boolean.FALSE);
            Kruban.setExplored(Boolean.FALSE);
            Kruban.setX(5);
            Kruban.setY(6);
            Kruban.setEnemy("Krogan");
            planetList.add(Kruban);

            Planet Durak = new Planet();
            Durak.setName("Durak");
            Durak.setDescription(
                    "Durak is a small, heat-blasted rock lost in the blinding glare "
                    + "\nof the star Aralakh. It occasionally traps a trace atmosphere "
                    + "\nof gases blown in on Aralakh's powerful solar wind, which "
                    + "\ninevitably blows the gases back out again. The planetoid has "
                    + "\na few valuable lodes of heavy metals, which were sporadically "
                    + "\nmined by the krogan at the height of their power. In the closing "
                    + "\nyears of the Rebellions the five clans working the planetoid "
                    + "\nfell to fighting over a particularly rich deposit of iridium. "
                    + "\nAll five clan warlords agreed to a Crush (a meeting at a neutral "
                    + "\nlocation) to negotiate a truce. Unfortunately, all five arrived "
                    + "\nplanning to betray their fellows. While the leaders and their "
                    + "\nseconds met, all their bases were destroyed by simultaneous "
                    + "\nhypervelocity cannon strikes. Left with only the food, water, "
                    + "\nand air in their hardsuits and with no way to call for rescue "
                    + "\nthe warlords apparently fought each other to the death. The "
                    + "\nsurvivors of the five \"Durak clans\" on Tuchanka still argue "
                    + "\nabout which clan's warlord was the last one standing. ");
            Durak.setSystem(system);
            Durak.setVisited(Boolean.FALSE);
            Durak.setExplored(Boolean.FALSE);
            Durak.setX(0);
            Durak.setY(0);
            Durak.setEnemy("Krogan");
            planetList.add(Durak);

            Planet Kanin = new Planet();
            Kanin.setName("Kanin");
            Kanin.setDescription(
                    "One of Kanin's hemispheres contains an impact crater 700 kilometers "
                    + "\nin diameter. Dubbed the Renkat Basin, it was mined for light "
                    + "\nmetals in the interbellum between the Rachni War and Krogan "
                    + "\nRebellions. Any obvious resource concentrations have long since "
                    + "\nbeen stripped. ");
            Kanin.setSystem(system);
            Kanin.setVisited(Boolean.FALSE);
            Kanin.setExplored(Boolean.FALSE);
            Kanin.setX(-2);
            Kanin.setY(-1);
            Kanin.setEnemy("");
            planetList.add(Kanin);
//</editor-fold>
        }
        if (system == "Perseus Veil") {
            // Perseus Veil
            //<editor-fold defaultstate="collapsed" desc="comment">
            Planet Uriyah = new Planet();
            Uriyah.setName("Uriyah");
            Uriyah.setDescription(
                    "Tikkun's asteroid belt is home to Uriyah, a rock large enough "
                    + "\nto qualify as a binary dwarf planet. Its companion, Etiel, is "
                    + "\nbelieved to have split off from the main body after an oblique "
                    + "\nimpact. Both were heavily mined early in the age of quarian "
                    + "\nspace exploration. Curiously, the geth have built over the old "
                    + "\nquarian space stations, even though the mined-out asteroids "
                    + "\nhave little obvious use. The current theory is that they provide "
                    + "\na staging base to exploit other asteroids in the belt. ");
            Uriyah.setSystem("Perseus Veil");
            Uriyah.setVisited(Boolean.FALSE);
            Uriyah.setExplored(Boolean.FALSE);
            Uriyah.setX(-2);
            Uriyah.setY(6);
            Uriyah.setEnemy("Geth");
            planetList.add(Uriyah);

            Planet Rannoch = new Planet();
            Rannoch.setName("Rannoch");
            Rannoch.setDescription(
                    "Although its orange sun is only about 90% the mass of Sol and "
                    + "\nhalf as luminous, Rannoch is arid by Earth standards because "
                    + "\nit formed closer to its star and has slightly less ocean "
                    + "\ncoverage. Photosynthetic life is concentrated around rivers "
                    + "\nand oceans, with large expanses of desert in between. The "
                    + "\nimportance of plant life and shade in ancient quarian culture "
                    + "\nis evident in the translation of Rannoch's name -- \"walled "
                    + "\ngarden.\"\n"
                    + "\n"
                    + "\nTo a starship's sensors, the most obvious feature of the "
                    + "\nquarian homeworld is the numerous heat sources in orbit. "
                    + "\nThousands of geth space stations watch over the planet. "
                    + "\nSomewhere in this artificial swarm of constructions lurks the "
                    + "\ngeth armada, waiting for its moment to counterattack. ");
            Rannoch.setSystem("Perseus Veil");
            Rannoch.setVisited(Boolean.FALSE);
            Rannoch.setExplored(Boolean.FALSE);
            Rannoch.setX(-2);
            Rannoch.setY(2);
            Rannoch.setEnemy("Geth");
            planetList.add(Rannoch);

            Planet GethDebrisField = new Planet();
            GethDebrisField.setName("Geth Debris Field");
            GethDebrisField.setDescription(
                    "Close to the star, the Excelsior's scanner can detect a "
                    + "\nnigh-uncountable number of geth statites -- satellites that "
                    + "\nuse solar sails to self-correct their position. The geth placed "
                    + "\nthe ultra-lightweight constructions around the sun to collect "
                    + "\nenergy, arranged in a vast array known as a Dyson bubble. "
                    + "\nScattered among them are space stations and servers that draw "
                    + "\npower from the statites through wireless energy transfer.\n"
                    + "\n"
                    + "\nMost of the space stations are wreckage now, and no small "
                    + "\nnumber of solar sails have also been destroyed. It appears "
                    + "\nthe quarians began to destroy them but were stopped before "
                    + "\nthe attack was complete. ");
            GethDebrisField.setSystem("Perseus Veil");
            GethDebrisField.setVisited(Boolean.FALSE);
            GethDebrisField.setExplored(Boolean.FALSE);
            GethDebrisField.setX(0);
            GethDebrisField.setY(0);
            GethDebrisField.setEnemy("Geth");
            planetList.add(GethDebrisField);

            Planet GethDreadnought = new Planet();
            GethDreadnought.setName("Geth Dreadnought");
            GethDreadnought.setDescription(
                    "Scans of the geth dreadnought orbiting Rannoch reveal an "
                    + "\nintimidating array of features, from an improved main gun and "
                    + "\nultraviolet antiship lasers to increased thruster output. The "
                    + "\ngeth workforce never demands rest, wages, or autonomy, and in "
                    + "\nthe creation of their flagship, they were limited only by time "
                    + "\nand raw materials. The damage inflicted by the quarian fleet "
                    + "\nappears minor at best. ");
            GethDreadnought.setSystem("Perseus Veil");
            GethDreadnought.setVisited(Boolean.FALSE);
            GethDreadnought.setExplored(Boolean.FALSE);
            GethDreadnought.setX(1);
            GethDreadnought.setY(-1);
            GethDreadnought.setEnemy("Geth");
            planetList.add(GethDreadnought);

            Planet MigrantFleet = new Planet();
            MigrantFleet.setName("Migrant Fleet");
            MigrantFleet.setDescription(
                    "Also known as the Flotilla, the Migrant Fleet is the massive "
                    + "\ncollection of starships that became home to the quarians after "
                    + "\nthey were driven from their home world by the geth. The Migrant "
                    + "\nFleet consists of roughly fifty thousand ships that house "
                    + "\nseventeen million quarians in total. The Fleet is so large it "
                    + "\ncan take days for all the ships to pass through a mass relay. "
                    + "\nSome of the vessels date from the original flight from the geth "
                    + "\nthree centuries ago.\n"
                    + "\n"
                    + "\nThe Migrant Fleet is rarely welcoming to outsiders, as any "
                    + "\nrisk to the Fleet is a risk to the quarian species. Quarians "
                    + "\nrarely leave except to go on Pilgrimage; ships sometimes leave "
                    + "\non an individual basis to pursue their own goals, on missions "
                    + "\nthat can last days or years, but usually return. As Tali'Zorah "
                    + "\nnar Rayya describes her culture: \"Home is a state of mind.\" ");
            MigrantFleet.setSystem("Perseus Veil");
            MigrantFleet.setVisited(Boolean.FALSE);
            MigrantFleet.setExplored(Boolean.FALSE);
            MigrantFleet.setX(2);
            MigrantFleet.setY(-4);
            MigrantFleet.setEnemy("");
            planetList.add(MigrantFleet);

            Planet MassRelay = new Planet();
            MassRelay.setName("Mass Relay");
            MassRelay.setDescription(
                    "Mass Relays are mass transit devices scattered throughout the "
                    + "\ngalaxy, usually located within star systems. They form an "
                    + "\nenormous network allowing interstellar travel. Hailed as one "
                    + "\nof the greatest achievements of the extinct Protheans, a mass "
                    + "\nrelay can transport starships instantaneously to another relay "
                    + "\nwithin the network, allowing for journeys that would otherwise "
                    + "\ntake years or even centuries with only FTL drives. ");
            MassRelay.setSystem("Perseus Veil");
            MassRelay.setVisited(Boolean.FALSE);
            MassRelay.setExplored(Boolean.FALSE);
            MassRelay.setX(66);
            MassRelay.setY(66);
            MassRelay.setEnemy("");
            //MassRelay.setResources(showMaterialsList());
            planetList.add(MassRelay);
//</editor-fold>
        }

        return planetList;
    }

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
