package com.Employees.mangement.system;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson
{
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        System.out.println("HELLO");
        //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Arjun");
        employeeDetails.put("lastName", "Gupta");
        employeeDetails.put("website", "nirsoft.net");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Arav");
        employeeDetails2.put("lastName", "Schultz");
        employeeDetails2.put("website", "kaggle.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        //Third Employee
        JSONObject employeeDetails3 = new JSONObject();
        employeeDetails2.put("firstName", "piyush");
        employeeDetails2.put("lastName", "sharma");
        employeeDetails2.put("website", "roadmap.sh");

        JSONObject employeeObject3 = new JSONObject();
        employeeObject2.put("employee", employeeDetails3);

        //Fourth Employee
        JSONObject employeeDetails4 = new JSONObject();
        employeeDetails2.put("firstName", "Balvan");
        employeeDetails2.put("lastName", "Agarwal");
        employeeDetails2.put("website", "zty.pe");

        JSONObject employeeObject4 = new JSONObject();
        employeeObject2.put("employee", employeeDetails4);


        //Fifth Employee

        JSONObject employeeDetails5 = new JSONObject();
        employeeDetails2.put("firstName", "Rahul");
        employeeDetails2.put("lastName", "Patel");
        employeeDetails2.put("website", "alison.com");

        JSONObject employeeObject5 = new JSONObject();
        employeeObject2.put("employee", employeeDetails5);




        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        employeeList.add(employeeObject3);
        employeeList.add(employeeObject4);
        employeeList.add(employeeObject5);

        //Write JSON file
        try (FileWriter file = new FileWriter("employees.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(employeeList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}