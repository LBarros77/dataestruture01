package com.mycompany.dataestruture01.vectorpackage;

import java.util.Arrays;

public class Vector {
    
    private String[] elemments;
    private int size = 0;
    
    public Vector(int capacity) {
        this.elemments = new String[capacity];
    }
    
    public void add(String elemment){
        if(!(this.elemments[this.size - 1] == null)){
            throw new IllegalArgumentException("Is not valid position!");
        }
        
        for(int i = 0; i < this.size; i++){
            if(this.elemments[i] == null){
                this.elemments[i] = elemment;
                break;
            }
        }
    }
    
    public void add(int position, String elemment){
        if(!((position >= 0) && (position < this.elemments.length))){
            throw new IllegalArgumentException("Is not valid position!");
        }

        this.elemments[position] = elemment;
        this.size++;
    }
    
    public void increaseCapacity(){
        if(!(this.size <= 0)){
            throw new IllegalArgumentException();
        }
        String[] newElemments = this.elemments;
        this.elemments = new String[this.size - 1];
        
        System.arraycopy(newElemments, 0, this.elemments, 0, this.elemments.length);
        
        this.size = this.elemments.length;
        
        for(int i = this.size - 1; i >= 0; i--){
            if(this.elemments[i] == null){
                this.remove(null);
            }
        }
    }
    
    public void remove(){
        String[] newElemments = new String[this.size -1];
        
        System.arraycopy(this.elemments, 0, newElemments, 0, this.size -1);
        this.size--;
        
        this.elemments = new String[this.size];
        System.arraycopy(newElemments, 0, this.elemments, 0, this.size);
    }
    
    public void remove(String elemment){
        boolean position;
        
        for(int i = 0; i < this.size -1; i--){
            position = (elemment.equals(this.elemments[i]));
            if(position){
                for(int p = i; p < this.size -1; p++){
                    this.elemments[p] = this.elemments[p + 1];
                }
            }
        }
        this.size--;
        this.increaseCapacity();
    }
    
    public Object firstParameter(Object elemment){
        for(int i = 0; i < this.size; i++){
            if(elemment.equals(this.elemments[i])) return "Index: " + i;
        }
        return null;
    }
    
    public void clear(){
        //this.elemments = new String[this.size];
        while(this.size > 1){
            this.remove();
        }
        this.elemments[0] = null;
    }
    
    public void lastIndexOf(Object objeto){
        for(int i = this.size -1; i > -1; i--){
            if(objeto.equals(this.elemments[i])) break;
        }
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        
        s.append("[");
        for(int i = 0; i < this.size - 1; i++){
            s.append(this.elemments[i] + ", ");
        }
        if(this.size > 0){
            s.append(this.elemments[this.size - 1]);
        }
        s.append("]");
        
        return s.toString();
    }
}
