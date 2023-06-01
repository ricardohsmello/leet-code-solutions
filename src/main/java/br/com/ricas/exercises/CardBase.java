package br.com.ricas.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
*
* Splendor is a card-based board game where players buy cards in exchange for colored gems.
*  In this game, today, we care about two things, gems and cards.

Players can have any number of gems of five different colors: (B)lue, (W)hite, (G)reen, (R)ed, and (Y)ellow.

Players can exchange gems for cards. A card appears as such:

+----------+
|        G |
|          |
|          |
| 3W       |
| 2G       |
| 1R       |
+----------+

This indicates that the card costs 3 (W)hite gems, 2 (G)reen gems, and 1 (R)ed.
* The  the upper right indicates the color of the card (this will be useful later)

For this entire problem, we want to keep things simple by assuming that there is only one player.

The data model and structure of the program is up to you.

[execution time limit] 3 seconds (java)

[memory limit] 1 GB
* */
public class CardBase {

    public static void main(String[] args) {

        Card card = new Card();
        card.createGem("W", 3);
        card.createGem("G", 2);

        Player player = new Player();
        Map<String, Integer> gems = new HashMap<>();
        gems.put("W", 4);
        gems.put("G", 2);

        player.createPlayer("Ricardo", gems);
        boolean value = canPurchase(card.getGems(), player.gems);
        System.out.println(value);
    }

    static boolean canPurchase(Map<String, Integer> cards, Map<String, Integer> players) {
        for (Map.Entry<String, Integer> c : cards.entrySet()) {

            if (! players.containsKey(c.getKey())) {
                return false;
            }

            if (players.get(c.getKey()) < c.getValue()) {
                return false;
            }
        }
        return true;
    }
}

class Player {
    String name;
    Map<String, Integer> gems = new HashMap<>();


    void createPlayer(String name, Map<String, Integer> gems) {
        this.name = name;
        this.gems = gems;
    }
}

class Card {
    Map<String, Integer> gems = new HashMap<>();

    void createGem(String color, int value) {
        gems.put(color, value);
    }

    public Map<String, Integer> getGems() {
        return gems;
    }
}
