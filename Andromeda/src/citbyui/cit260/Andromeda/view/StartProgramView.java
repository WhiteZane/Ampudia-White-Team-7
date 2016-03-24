/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import byui.cit260.andromeda.control.GameControl;
import byui.cit260.andromeda.control.MapControl;
import byui.cit260.andromeda.model.Excelsior;
import byui.cit260.andromeda.model.Map;
import byui.cit260.andromeda.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ghosty
 */
public class StartProgramView {
    
    protected final BufferedReader keyboard = Andromeda.getInfile();
    protected final PrintWriter console = Andromeda.getOutfile();

    //private String promptMessage;
    public StartProgramView() {
        displayBanner();
    }

    private void displayBanner() {
        this.console.println(
                 "\n      ___    _   ______  ____  ____  __  _____________  ___ "
                + "\n     /   |  / | / / __ \\/ __ \\/ __ \\/  |/  / ____/ __ \\/   |"
                + "\n    / /| | /  |/ / / / / /_/ / / / / /|_/ / __/ / / / / /| |"
                + "\n   / ___ |/ /|  / /_/ / _, _/ /_/ / /  / / /___/ /_/ / ___ |"
                + "\n  /_/  |_/_/ |_/_____/_/ |_|\\____/_/  /_/_____/_____/_/  |_|"
                + "\n"
                + "\n                         - Welcome -                            "
                + "\n"
                + "\nIn this game, you will be taking on the role as Commander Locke "
                + "\nwith his starship named Excelsior. He has been assigned to a "
                + "\nspecial mission to reach and investigate the Andromeda Galaxy. "
                + "\nHe will need a team of experts to be able to reach Andromeda and "
                + "\nbe prepared to whatever he would encounter. The year is 2549. "
                + "\nHumanity has already discovered FTL (faster-than-light) travel,"
                + "\nthrough an alien tech device found on Earth at the bottom of"
                + "\nthe sea in 2016.");
        //this.console.println(welcome);
    }

    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
            {
                return; //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(playersName);

        } while (!done);

    }

    private String getPlayersName() {

        boolean isValidName = false; //initalize not valid
        String value = ""; //value returned
        Scanner keyboard = new Scanner(System.in); // get from keyboard

        this.console.println("\nPlease enter your name: ");

        while (!isValidName) { //loop when invalid value is entered

            value = keyboard.nextLine(); // get next line typed
            value = value.trim();

            /*if (value.length() < 1) {//value is blank
            System.out.println("\n*** Error *** Value can not be blank");
            continue;
            }*/
            break; //end loop
        }
        return value; // return entered value
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2 || playersName.length() >= 20 || playersName == null) {
            ErrorView.display(this.getClass().getName(),"\n\t*** Error *** Invalid player's name."
                    + "\n\tThe name must be greater than one and less than 20 characters in length.");
            return false;
        }

        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        GameControl.createExcelsior();
        
        if (player == null) {
            ErrorView.display(this.getClass().getName(),"\n*** Error *** Error creating the player.");
            return false;
        }

        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        this.console.println("––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––"
                + "\n\tWelcome to Andromeda " + player.getName()
                + "\n\tA great adventure awaits you!"
                + "\n––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––"
        );

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}
