package com.example.polyclinic;

import org.xml.sax.SAXException;
import com.example.polyclinic.Patient;
import com.example.polyclinic.GetPatient;

import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class PatientsParser {

    public static ArrayList<Patient> patients = new ArrayList<>();

    public static void findAllPatients() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        GetPatient handler = new GetPatient();
        File a = new File("data/patients.xml");
        System.out.println(a.getPath());
        parser.parse(a, handler);
    }
}
