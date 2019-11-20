package bizseer.demik.letcode.other.star;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author AthyLau
 * @date: 2019/11/20 4:52 PM
 * @since JDK 1.8
 */
public class AStar {

    private static final List<Node> nodeMaps = new ArrayList<>();
    private static final Node startNode = new Node();
    private static final Node endNode = new Node();
    private static List<Node> open = new ArrayList<>();
    private static List<Node> close = new ArrayList<>();
    private static final Integer UDLFKey = 10;
    private static final Integer CKey = 14;

    public static void main(String args[]) {
        TestData testData = getTestMap();
        getMapByTer(testData.getTerrains(), testData.getStart(), testData.getEnd());
        start();
        getPath();
    }

    public static void start() {
        addNodeToList(startNode, open);
        while (!open.isEmpty()) {
            Node now = openGetOne();
            addNodeToList(now, close);
            List<Node> nearNodes = getNearNode(now);
            if (isNodeInList(endNode, nearNodes)) {
                open.add(endNode);
                endNode.setFather(now);
                break;
            }
            for (Node nearNode : nearNodes) {
                if (nearNode.getTerrain().getCanMove() == -1 || isNodeInList(nearNode, close)) {
                    continue;
                }
                if (addNodeToList(nearNode, open) || now.getG() + getGPay(now, nearNode) < nearNode.getG()) {
                    nearNode.setFather(now);
                    nearNode.setG(getGPay(now, nearNode));
                    nearNode.setH(getHPay(now, nearNode));
                    sortOpenList();
                }
            }
        }
    }

    public static Node openGetOne() {
        if (open.isEmpty()) {
            return null;
        }
        sortOpenList();
        Node node = open.get(0);
        open.remove(node);
        return node;
    }

    public static void getPath() {
        Node node = endNode;
        while (node != null) {
            System.out.println(node.getCoord().getX() + " , " + node.getCoord().getY());
            node = node.getFather();
        }
    }

    public static Integer getHPay(Node now, Node nearNode) {
        return UDLFKey * (now.getCoord().getY() - nearNode.getCoord().getY() + now.getCoord().getX() - nearNode.getCoord().getY());
    }

    public static Integer getGPay(Node now, Node nearNode) {
        int pay = now.getCoord().getY() - nearNode.getCoord().getY() + now.getCoord().getX() - nearNode.getCoord().getY();
        if (pay == 1) {
            return UDLFKey;
        }
        return CKey;
    }

    public static boolean addNodeToList(Node node, List<Node> nodes) {
        return !isNodeInList(node, nodes) && nodes.add(node) && sortOpenList();
    }

    public static List<Node> getNearNode(Node node) {
        return nodeMaps.stream().filter(n ->
           (n.getCoord().getX() - 1 == node.getCoord().getX() && n.getCoord().getY() - 1 == node.getCoord().getY())
           || (n.getCoord().getX() - 1 == node.getCoord().getX() && n.getCoord().getY().equals(node.getCoord().getY()))
           || (n.getCoord().getX() - 1 == node.getCoord().getX() && n.getCoord().getY() + 1 == node.getCoord().getY())
           || (n.getCoord().getX().equals(node.getCoord().getX()) && n.getCoord().getY() - 1 == node.getCoord().getY())
           || (n.getCoord().getX().equals(node.getCoord().getX()) && n.getCoord().getY() + 1 == (node.getCoord().getY()))
           || (n.getCoord().getX() + 1 == node.getCoord().getX() && n.getCoord().getY() - 1 == node.getCoord().getY())
           || (n.getCoord().getX() + 1 == node.getCoord().getX() && n.getCoord().getY().equals(node.getCoord().getY()))
           || (n.getCoord().getX() + 1 == node.getCoord().getX() && n.getCoord().getY() + 1 == node.getCoord().getY())
        ).collect(Collectors.toList());
    }

    public static boolean isNodeInList(Node node, List<Node> nodes) {
        for (Node nowNode : nodes) {
            if (nowNode.getCoord().equals(node.getCoord())) {
                return true;
            }
        }
        return false;
    }

    public static TestData getTestMap() {
        TestData testData = new TestData();
        Terrain[][] terrains = new Terrain[7][5];
        for (int i = 0; i < terrains.length; i++) {
            for (int j = 0; j < terrains[i].length; j++) {
                if (i == 3 && (j == 1 || j == 2 || j == 3)) {
                    terrains[i][j] = Terrain.RIVER;
                } else {
                    terrains[i][j] = Terrain.PLAIN;
                }
            }
        }
        testData.setTerrains(terrains);
        testData.setStart(new Coord(1, 2));
        testData.setEnd(new Coord(5, 2));
        return testData;
    }

    public static List<Node> getMapByTer(Terrain[][] maps, Coord start, Coord end) {
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                Coord coord = new Coord(i, j);
                String name = "";
                if (coord.equals(start)) {
                    name = "start";
                    startNode.setCoord(start);
                    startNode.setName(name);
                    startNode.setTerrain(maps[i][j]);
                } else if (coord.equals(end)) {
                    name = "end";
                    endNode.setCoord(end);
                    endNode.setName(name);
                    endNode.setTerrain(maps[i][j]);
                }
                nodeMaps.add(new Node(coord, maps[i][j], name));
            }
        }
        return nodeMaps;
    }

    public static boolean sortOpenList() {
        open = open.stream().sorted(Comparator.comparing(Node::getF)).collect(Collectors.toList());
        return true;
    }
}





