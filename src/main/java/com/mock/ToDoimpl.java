package com.mock;

import java.util.ArrayList;
import java.util.List;

public class ToDoimpl {

private ToDoService service;

    public ToDoimpl(ToDoService service) {
        this.service = service;
    }

    public List<String>  retrieveToDoRelatedTOString(String user){
        List<String> filteredTodos=new ArrayList<String>();
        List<String> todos=service.retrieveTodos(user);
        for(String todo:todos){
            if(todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

}
