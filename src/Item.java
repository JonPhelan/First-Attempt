public class Item<ItemType> {
    private final Object type;
    private int x, y;
    private final ItemType KEY;

    public Item(int x, int y, ItemType type, ItemType key) {
        this.x = x;
        this.y = y;
        KEY = key;
        this.type = type;
    }

    public void draw() {
        // Draw the item on the screen
        // ...
    }

    public <ItemType>Object getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

