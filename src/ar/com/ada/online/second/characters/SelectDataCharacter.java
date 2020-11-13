package ar.com.ada.online.second.characters;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SelectDataCharacter {

    public static Character getDataCharacter() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Seleccione tipo de personaje 1-MAGO 2-ELFO");
        int characterType = keyboard.nextInt();

        switch (characterType) {

            case 1:
                selectWizard();
                break;

            case 2:
                break;
        }


        return null;
    }


    public static Wizard selectWizard() {

        Scanner keyboard = new Scanner(System.in);
        Wizard wizardPlayer = new Wizard();


        //seleccion de nombre
        System.out.println("Seleccione el nombre de su personaje!");

        ArrayList<String> arrayCharacters = new ArrayList<>();
        arrayCharacters.add("Harry");
        arrayCharacters.add("Hermione");
        arrayCharacters.add("CharacterExample");
        arrayCharacters.add("CharacerExample2");
        arrayCharacters.add("CharacterExample3");

        System.out.println(arrayCharacters);
        System.out.println();
        System.out.println("O escriba su nombre!");
        String playerName = keyboard.nextLine();
        wizardPlayer.setName(playerName);

        //seleccion de ubicacion

        System.out.println("Seleccione ubicacion: 1-IZQUIERDA, 2-CENTRO, 3-DERECHA");
        System.out.println("");
        int option = 0;
        switch (option) {

            case 1:
                wizardPlayer.setLocation("IZQUIERDA");
                break;

            case 2:
                wizardPlayer.setLocation("CENTRO");
                break;

            case 3:
                wizardPlayer.setLocation("DERECHA");

            default:
                System.out.println("Seleccione una ubicacion ingresando 1, 2 o 3");
                break;
        }

        //seteamos demas atributos de mago

        wizardPlayer.setMagicLevel(100);
        wizardPlayer.setEnergyLevel(100);
        wizardPlayer.setWand(randomWandSelection());

        return wizardPlayer;


    }


    //seleccion de varita

    public static Wand randomWandSelection() {

        ArrayList<Wand> arrayRandomWands = new ArrayList<>();

        arrayRandomWands.add(new Wand("Varita1", 1));
        arrayRandomWands.add(new Wand("Varita2", 2));
        arrayRandomWands.add(new Wand("Varita3", 3));
        arrayRandomWands.add(new Wand("Varita4", 4));
        arrayRandomWands.add(new Wand("Varita5" , 5));

        Random random = new Random();

        Wand randomWand = arrayRandomWands.get(random.nextInt(arrayRandomWands.size()));

        System.out.println("Una varita te elegira... ... ...");
        System.out.println("La varita que te eligio es: " + randomWand);

        return randomWand;

    }




}








