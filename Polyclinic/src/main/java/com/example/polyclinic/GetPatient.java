package com.example.polyclinic;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import com.example.polyclinic.Patient;
import com.example.polyclinic.PatientsParser;

import java.time.LocalDate;

public class GetPatient extends DefaultHandler {

    //@Override
    public void startPatient(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equals("patient")) {
            int id = Integer.parseInt(attributes.getValue("id"));
            String surname = attributes.getValue("surname");
            String firstname = attributes.getValue("firstname");
            String lastname = attributes.getValue("lastname");
            LocalDate dateOfBirth = LocalDate.parse(attributes.getValue("dateOfBirth"));
            String address = attributes.getValue("address");
            String phone = attributes.getValue("phone");
            String diseases = attributes.getValue("diseases");
            if (!PatientsParser.patients.contains(id)) {
                PatientsParser.patients.add(new Patient(id, surname, firstname, lastname, dateOfBirth, address, phone, diseases));
            }
        }
    }
}
