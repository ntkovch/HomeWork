package class26;

import java.util.*;

public class Employee {
    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
    John Smith=$100000
     */
    public static void main(String[] args) {
        Map<String, Integer> employee = new HashMap<>();
        employee.put("John Smith", 100000);
        employee.put("Nety Vinzdor", 80000);
        employee.put("Liam Slam", 40000);
        employee.put("Kate Rokty", 60000);
        employee.put("Solya Wien", 70000);

        int maxValue = 0;
        for (Map.Entry<String, Integer> entry : employee.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }}
        for(Map.Entry<String,Integer> e:employee.entrySet()){
            if(e.getValue()==maxValue){
                System.out.println(e.getKey()+"=$"+e.getValue());
            }
        }
    }
    }

