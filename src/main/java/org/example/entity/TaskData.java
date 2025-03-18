package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        switch (name.toLowerCase()){
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;
            default:
                return null;
        }
    }

    public Set<Task> getUnion(Set<Task>... sets) {
        Set<Task> result = new HashSet<>();
        for (Set<Task> set : sets) {
            result.addAll(set);
        }
        return result;
    }


    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
        Set<Task> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2) {
        Set<Task> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}
