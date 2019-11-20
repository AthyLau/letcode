package bizseer.demik.letcode.other.star;

public class Node {
    private String name;
    private Node father;
    private Integer f;
    private Integer g;
    private Integer h;
    private Coord coord;
    private Terrain terrain;

    public void init() {
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    public Node() {
        init();
    }

    public Node(Coord coord, Terrain terrain, String name) {
        this.coord = coord;
        this.name = name == null || name.isEmpty() ? terrain.name() : name;
        this.terrain = terrain;
        init();
    }

    public Node(String name, Node father, Integer f, Integer g, Integer h, Coord coord, Terrain terrain) {
        this.name = name;
        this.father = father;
        this.f = f;
        this.g = g;
        this.h = h;
        this.coord = coord;
        this.terrain = terrain;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", father=" + father +
                ", f=" + f +
                ", g=" + g +
                ", h=" + h +
                ", coord=" + coord +
                ", terrain=" + terrain +
                '}';
    }

    public String getNodeDescription() {
        return "name: " + name + "( " +
                coord.getX() + ", " + coord.getY() +
                ", " + terrain.getType() + " )";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
    }

    public Integer getF() {
        this.f = this.g + this.h;
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }
}
