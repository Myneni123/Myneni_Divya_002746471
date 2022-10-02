/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.operations.hr;

import java.util.ArrayList;

/**
 *
 * @author mynenidivya
 */
public class Employeersdata {
    private ArrayList<CRUDOperationsHR> data;
    public Employeersdata(){
          this.data=new ArrayList<CRUDOperationsHR>();
    }

    public ArrayList<CRUDOperationsHR> getData() {
        return data;
    }

    public void setData(ArrayList<CRUDOperationsHR> data) {
        this.data = data;
    }
    
public CRUDOperationsHR addnewemployee(){
        
        CRUDOperationsHR newdata=new CRUDOperationsHR();
        data.add(newdata);
        return newdata;
}
public void DeleteRow(CRUDOperationsHR a){
    data.remove(a);
}
    
}
    

