
package HospitalDemo;

public class hospital {
    public String name;
    public double bodytemp;
    public int duration;
    
    public hospital(){
    
    }
    public hospital(String name,double bodytemp,int duration){
    this.name=name;
    this.bodytemp=bodytemp;
    this.duration=duration;
    }
    
    public String diagonsepatient(){
    if(bodytemp>=103&&duration>7){
    return "Dengue";
    }else if(bodytemp>=100&&duration<7){
    return "Common Fever";
    
    
    }else{
    return "Nothing";
    }
        
    }
    
}
