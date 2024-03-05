/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_3;

/**
 *
 * @author User
 */
// Prototype interface representing level templates
interface LevelTemplate extends Cloneable {
    LevelTemplate clone();
    void customLevel(String terrain, String obstacles, String enemies);
}

// Concrete implementation of the Prototype pattern for a Level
class Level implements LevelTemplate {
    private String terrain;
    private String obstacles;
    private String enemies;

    public Level(String terrain, String obstacles, String enemies) {
        this.terrain = terrain;
        this.obstacles = obstacles;
        this.enemies = enemies;
    }

    @Override
    public LevelTemplate clone() {
        try {
            return (LevelTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void customLevel(String terrain, String obstacles, String enemies) {
        // Logic to customize the level
        this.terrain = terrain;
        this.obstacles = obstacles;
        this.enemies = enemies;
        System.out.println("the terrain " + terrain + ",the obstacles " + obstacles + ",the enemies " + enemies);
    }

    // Getters and setters for terrain, obstacles, and enemies
    // ...
}

// Client class for level design tool
public class LevelTool {
    public static void main(String[] args) {
        // Create a prototype level template
        LevelTemplate levelprot = new Level("Default terrain", "Default obstacles", "Default enemies");

        // Clone the prototype and customize the level
        LevelTemplate level1 = levelprot.clone();
        level1.customLevel("Buldings","walls","zombies");

        // Clone the prototype for another customization
        LevelTemplate level2 = levelprot.clone();
        level2.customLevel("House","Dors","vampires");

        // Repeat the process for other levels
    }
}