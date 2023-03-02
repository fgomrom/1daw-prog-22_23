package org.ieslosremedios.daw1.prog.ut5.listas.a5_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>(); // por defecto se utiliza ArrayList
    }

    public TaskList(String type) {
        if ("arraylist".equalsIgnoreCase(type)) {
            tasks = new ArrayList<>();
        } else if ("linkedlist".equalsIgnoreCase(type)) {
            tasks = new LinkedList<>();
        }
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public void completeTask(String task) {
        int index = tasks.indexOf(task);
        if (index >= 0) {
            tasks.set(index, task + " (completada)");
        }
    }

    public String[] getTasks() {
        return tasks.toArray(new String[0]);
    }
}
