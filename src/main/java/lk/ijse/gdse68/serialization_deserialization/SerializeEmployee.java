package lk.ijse.gdse68.serialization_deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SerializeEmployee {
    public static void main(String[] args){
        Employee employee = new Employee("Chamith","23","Galle");

        ObjectMapper mapper = new ObjectMapper();
        try{
            mapper.writeValue(new File("employee.json"), employee);
            System.out.println("Employee serialized to 'employee.json'");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
