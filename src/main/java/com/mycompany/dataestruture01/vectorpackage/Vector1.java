package com.mycompany.dataestruture01.vectorpackage;

public class Vector1 {
    
    private String[] elemments;
    private int cont, size = 0;
    
    public Vector1(int capacity){
        this.elemments = new String[capacity];
    }
    
    public void add(String elemment){
        if(!(this.size <= this.elemments.length)){
            throw new IllegalArgumentException("Size not suport");
        }
        this.elemments[this.size] = elemment;
        this.size++;
    }
    
    public void add(int indice, String elemment){
        if(!(indice > -1)){
            throw new IllegalArgumentException("Indice or argument is not valid");
        }
        
        String[] newElemments = new String[this.size];
        for(int i = indice; i < this.size; i++){
            
        }
    }
    
    public void remove(int position){
        if(!((position >= 0) && (position < this.size))){
            throw new IllegalArgumentException("Position invalid");
        }
        
        for(int i = position; i < this.size - 1; i++){
            this.elemments[i] = this.elemments[i + 1];
        }
        this.size--;
    }
    
    public int verifica(Object elemment){
        for(int i = 0; i < this.size; i++){
            if(this.elemments[i].equals(elemment)){
                return i;
            }
        }
        return -1;
    }
    
    public void removeAllPositions(Object elemment){
        while(true){
            if(verifica(elemment) == -1) break;
            
            this.remove(verifica(elemment));
        }
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < this.size - 1; i++) {
            s.append(this.elemments[i] + ", ");
        }
        if(this.size > 0) {
            s.append(this.elemments[this.size - 1]);
        }
        s.append("]");
        return s.toString();
    }
}
