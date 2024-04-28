package relation.has_a.composition;

/**
 * Represents a room in a house.
 * This class is a part of a composition relationship where the lifecycle of a Room
 * is tied to the lifecycle of the House it belongs to.
 */
public class Room {
    private String roomType;

    /**
     * Constructs a Room with a specified type.
     * @param roomType The type of the room (e.g., kitchen, bedroom, etc.)
     */
    public Room(String roomType) {
        this.roomType = roomType;
    }

    /**
     * Returns the type of the room.
     * @return A string representing the type of the room.
     */
    public String getRoomType() {
        return roomType;
    }
}
