package graph;
public class TestGraph{

    public static void main(String[] args){
        Vertex v1 = new Vertex(9, "Test", "red");
        Vertex v2 = new Vertex(10, "Test", "red");
        Edge e = new UndirectedEdge(2, "red", new Vertex[]{v1, v2}, 4.5);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(e);
    }
}