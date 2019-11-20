package bizseer.demik.letcode.other.star;

/**
 * @author AthyLau
 * @date: 2019/11/20 5:25 PM
 * @since JDK 1.8
 */
public enum Terrain {

    MOUNTAIN(-1, false, "mountain"),RIVER(-1, false, "river"),PLAIN(10, true, "plain");

    private Integer canMove;
    private boolean canAngles;
    private String type;

    Terrain(Integer canMove, boolean canAngles, String type) {
        this.canMove = canMove;
        this.canAngles = canAngles;
        this.type = type;
    }

    public Integer getCanMove() {
        return canMove;
    }

    public void setCanMove(Integer canMove) {
        this.canMove = canMove;
    }

    public boolean isCanAngles() {
        return canAngles;
    }

    public void setCanAngles(boolean canAngles) {
        this.canAngles = canAngles;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
