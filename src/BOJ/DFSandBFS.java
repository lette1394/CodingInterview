package BOJ;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Queue;

public class DFSandBFS {
    private int numberOfVertex, numberOfEdge, startVertex;
    private Graph graph = new Graph();
    private StringBuilder sb;
    private Queue<Vertex> queue;

    public static void main(String[] args) {
        DFSandBFS dfSandBFS = new DFSandBFS();

        System.out.println(dfSandBFS.DFS());
        System.out.println(dfSandBFS.BFS());
    }

    DFSandBFS() {
        parse();
        sortVertexes();
    }

    public String DFS() {
        sb = new StringBuilder();
        initialVertex();
        Vertex start = graph.getVertex(startVertex);
        DFSImpl(start);

        return sb.toString().trim();
    }

    private void initialVertex() {
        for (Vertex vertex : graph.list) {
            vertex.isVisited = false;
        }
    }

    private void DFSImpl(Vertex current) {
        if (!current.isVisited) {
            sb.append(current.id);
            sb.append(" ");
            current.isVisited = true;
        }

        for (Vertex vertex : current.adjVertex) {
            if (!vertex.isVisited) {
                DFSImpl(vertex);
            }
        }
    }

    public String BFS() {
        queue = new ArrayDeque<>();
        sb = new StringBuilder();
        initialVertex();
        Vertex start = graph.map.get(startVertex);
        BFSImpl(start);

        return sb.toString().trim();
    }

    private void BFSImpl(Vertex current) {
        if (!current.isVisited) {
            sb.append(current.id);
            sb.append(" ");
            current.isVisited = true;
        }

        for (Vertex vertex : current.adjVertex) {
            if (!vertex.isVisited) {
                queue.add(vertex);
            }
        }

        while (!queue.isEmpty()) {
            BFSImpl(queue.poll());
        }
    }

    private void sortVertexes() {
        for (Vertex vertex : graph.list) {
            vertex.adjVertex.sort(Comparator.comparingInt(v -> v.id));
        }
    }

    private void parse() {
        InputStream in = new BufferedInputStream(System.in);
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader buf = new BufferedReader(reader);

        try {
            String line = buf.readLine();
            numberOfVertex = Integer.parseInt(line.split(" ")[0]);
            numberOfEdge = Integer.parseInt(line.split(" ")[1]);
            startVertex = Integer.parseInt(line.split(" ")[2]);

            for (int i = 0; i < numberOfVertex; i++) {
                graph.addVertex(i+1);
            }

            while (buf.ready()) {
                line = buf.readLine();
                int start = Integer.parseInt(line.split(" ")[0]);
                int end = Integer.parseInt(line.split(" ")[1]);

                graph.addEdge(start, end);
            }
        }
        catch (Exception e) {
            e.getMessage();
        }

    }


    class Graph {
        Map<Integer, Vertex> map = new HashMap<>();
        List<Vertex> list = new ArrayList<>();

        void addVertex(int id) {
            Vertex newVertex = new Vertex(id);
            map.put(id, newVertex);
            list.add(newVertex);
        }

        void addEdge(int start, int end) {
            Vertex from = map.get(start);
            Vertex to = map.get(end);

            to.adjVertex.add(from);
            from.adjVertex.add(to);
        }

        Vertex getVertex(int id) {
            return map.get(id);
        }

    }

    class Vertex {
        int id = 0;
        boolean isVisited = false;
        List<Vertex> adjVertex = new ArrayList<>();

        Vertex(int id) {
            this.id = id;
        }
    }
}
