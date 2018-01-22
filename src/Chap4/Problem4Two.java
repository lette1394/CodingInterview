package Chap4;

import java.util.*;

public class Problem4Two {


    public String solve(String[] projects, String[][] dependencies) {

        Graph graph = buildGraph(projects, dependencies);

        return graph.getOrder();
    }

    private Graph buildGraph(String[] projects, String[][] dependencies) {
        Graph graph = new Graph();

        for (String name : projects) {
            graph.addNode(new Project(name));
        }

        for (String[] dependency : dependencies) {
            String from = dependency[0];
            String to = dependency[1];

            graph.getOrCreateNode(from).addEdge(to);
        }

        return null;
    }

    class Project {
        Map<String, Project> children = new HashMap<>();
        String name;
        int dependencies = 0;

        Project(String name) {
            this.name = name;
        }

        public void addEdge(String to) {
            if (!children.containsKey(to)) {

            }
        }
    }

    class Graph {
        Map<String, Project> projects = new HashMap<>();

        String getOrder() {

            return "";
        }

        Project getOrCreateNode(String from) {
            if (!projects.containsKey(from)) {
                projects.put(from, new Project(from));
            }

            return projects.get(from);
        }

        public void addNode(Project project) {
        }
    }
}
