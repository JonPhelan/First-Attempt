import java.util.ArrayList;

import static javax.swing.SwingConstants.TOP;

public class Room {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final ArrayList<Wall> walls;
    private final ArrayList<Door> doors;
    private final ArrayList<Enemy> enemies;
    private final ArrayList<Item> items;

    public Room(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        walls = new ArrayList<>();
        doors = new ArrayList<>();
        enemies = new ArrayList<>();
        items = new ArrayList<>();
        generateWalls();
        generateDoors();
        populate();
    }

    private void generateWalls() {
        // Generate the walls of the room
        walls.add(new Wall(x, y, x + width, y)); // Top wall
        walls.add(new Wall(x, y + height, x + width, y + height)); // Bottom wall
        walls.add(new Wall(x, y, x, y + height)); // Left wall
        walls.add(new Wall(x + width, y, x + width, y + height)); // Right wall
    }

    private void generateDoors() {
        // Generate the doors of the room
        doors.add(new Door(x + width/2, y, TOP)); // Top door
        doors.add(new Door(x + width/2, y + height, Door.Orientation.BOTTOM)); // Bottom door
        doors.add(new Door(x, y + height/2, Door.Orientation.LEFT)); // Left door
        doors.add(new Door(x + width, y + height/2, Door.Orientation.RIGHT)); // Right door
    }

    private void populate() {
        // Populate the room with enemies and items
        enemies.add(new Enemy(x + 2, y + 2)); // Add an enemy at (2,2)
        items.add(new Item(x + width/2, y + height/2, ItemType.POTION, key)); // Add a potion at the center of the room
    }

    public void draw() {
        // Draw the room on the screen, including its walls, doors, enemies, and items
        for (Wall wall : walls) {
            wall.draw();
        }
        for (Door door : doors) {
            door.draw();
        }
        for (Enemy enemy : enemies) {
            enemy.draw();
        }
        for (Item item : items) {
            item.draw();
        }
    }
}