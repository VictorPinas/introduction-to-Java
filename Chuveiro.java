class Chuveiro{
    
    boolean on = false;
    float temperature = 0;
    
    void turnOn(boolean switchOn){
        on = switchOn;
    }
    
    void changeTemp(float newTemp){
        temperature = newTemp;
    }
    
    void tempUp(float aumentar){
        temperature = temperature + aumentar;
    }
    
    void tempDown(float diminuir){
        temperature = temperature - diminuir;
    }
    
    void printStates(){
        System.out.println("Ligado: " + on +
        " temperatura: " + temperature);
    }
}