package datastructures.graphs;

import java.util.*;

public class DirectedGraph {

    /*public static void main(String[] args) {
        Map<Character, Character[]> graph = new HashMap<>();
        graph.put('a', new Character[]{'b', 'c'});
        graph.put('b', new Character[]{'d'});
        graph.put('c', new Character[]{'e'});
        graph.put('d', new Character[]{'f'});
        graph.put('e', new Character[]{});
        graph.put('f', new Character[]{});
        depthFirstTraversal(graph, 'a');
        System.out.println();
        recursiveTraversal(graph, 'a');
        System.out.println();
        breathFirstTraversal(graph, 'a');
        System.out.println();
        // System.out.println( hasPathBetweenTwoEdgesUsingRecursion(graph, 'a', 'f'));
        // System.out.println( hasPathBetweenTwoEdgesUsingDepthFirstTraversal(graph, 'f', 'a'));
        System.out.println( hasPathBetweenTwoEdgesUsingBreathFirstTraversal(graph, 'a', 'f'));
    }*/

    public static void recursiveTraversal(Map<Character, Character[]> graph, Character startingVertex) {
        System.out.print(startingVertex + " ");
        Arrays.asList(graph.get(startingVertex)).forEach(neighbor -> recursiveTraversal(graph, neighbor));
    }

    public static void depthFirstTraversal(Map<Character, Character[]> graph, Character startingVertex) {
        Stack<Character> traversalStack = new Stack<>();
        traversalStack.push(startingVertex);
        while (traversalStack.size() > 0) {
            Character currentVertex = traversalStack.pop();
            System.out.print(currentVertex + " ");
            Arrays.asList(graph.get(currentVertex)).forEach(traversalStack::push);
        }
    }

    public static void breathFirstTraversal(Map<Character, Character[]> graph, Character startingVertex) {
        Queue<Character> traversalQueue = new LinkedList<>();
        traversalQueue.add(startingVertex);
        while (traversalQueue.size() > 0) {
            Character currentVertex = traversalQueue.remove();
            System.out.print(currentVertex + " ");
            traversalQueue.addAll(Arrays.asList(graph.get(currentVertex)));
        }
    }

    public static boolean hasPathBetweenTwoEdgesUsingRecursion(Map<Character, Character[]> graph, Character source, Character destination) {
        if(source == destination) return true;
        for (Character neighbor : graph.get(source) ) {
            return hasPathBetweenTwoEdgesUsingRecursion(graph, source, neighbor);
        }
        return false;
    }

    public static boolean hasPathBetweenTwoEdgesUsingDepthFirstTraversal( Map<Character, Character[]> graph, Character source, Character destination) {
        Stack<Character> traversalStack = new Stack<>();
        traversalStack.push(source);
        while (traversalStack.size() > 0) {
            Character vertexInTraversal = traversalStack.pop();
            if(vertexInTraversal == destination) return true;
            Arrays.asList(graph.get(vertexInTraversal)).forEach(traversalStack::push);
        }
        return false;
    }

    public static boolean hasPathBetweenTwoEdgesUsingBreathFirstTraversal( Map<Character, Character[]> graph, Character source, Character destination) {
        Queue<Character> traversalQueue = new LinkedList<>();
        traversalQueue.add(source);
        while (traversalQueue.size() > 0) {
            Character vertexInTraversal = traversalQueue.remove();
            if (vertexInTraversal == destination) return true;
            traversalQueue.addAll(Arrays.asList(graph.get(vertexInTraversal)));
        }
        return false;
    }
}
