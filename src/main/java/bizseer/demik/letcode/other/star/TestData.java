package bizseer.demik.letcode.other.star;

import java.util.Arrays;

/**
 * @author AthyLau
 * @date: 2019/11/20 5:56 PM
 * @since JDK 1.8
 */
public class TestData {

    private Terrain[][] terrains;
    private Coord start;
    private Coord end;

    public TestData() {

    }

    public TestData(Terrain[][] terrains, Coord start, Coord end) {
        this.terrains = terrains;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "TestData{" +
                "terrains=" + Arrays.toString(terrains) +
                ", start=" + start +
                ", end=" + end +
                '}';
    }

    public Terrain[][] getTerrains() {
        return terrains;
    }

    public void setTerrains(Terrain[][] terrains) {
        this.terrains = terrains;
    }

    public Coord getStart() {
        return start;
    }

    public void setStart(Coord start) {
        this.start = start;
    }

    public Coord getEnd() {
        return end;
    }

    public void setEnd(Coord end) {
        this.end = end;
    }
}
