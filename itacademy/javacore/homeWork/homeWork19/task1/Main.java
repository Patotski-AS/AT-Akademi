package com.itacademy.javacore.homeWork.homeWork19.task1;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * С помощью Stax считать список email-ов,
 * создать список соответствующих объектов Java и вывести его на консоль.
 * Файл emails.xml
 * https://drive.google.com/file/d/1r3-W1_AeVGt-oAGsYb-HGCB5RUFMlcR5/view?usp=sharing
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "D:\\JAVA\\JAVA\\src\\com\\itacademy\\javacore\\homeWork\\homeWork19\\task1\\emails.xml";
        try {
            List<Email> emails = parseStAX(fileName);
            for (Email email:emails){
                System.out.println(email);
            }

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
    public static List<Email> parseStAX(String fileName) throws FileNotFoundException, XMLStreamException {
        List<Email> emails = null;
        Email email = null;
        boolean isEmails = false;
        boolean isEmail = false;
        boolean isId = false;
        boolean isTo = false;
        boolean isHeading = false;
        boolean isFrom = false;
        boolean isBody = false;
        XMLInputFactory factory = XMLInputFactory.newInstance();
        InputStream stream = new FileInputStream(fileName);
        XMLStreamReader reader = factory.createXMLStreamReader(stream);
        while (reader.hasNext()) {
            int res = reader.next();
            if (res == reader.START_ELEMENT) {
                switch (reader.getLocalName()) {
                    case "emails":
                        isEmails = true;
                        break;
                    case "email":
                        isEmail = true;
                        break;
                    case "id":
                        isId = true;
                        break;
                    case "from":
                        isFrom = true;
                        break;
                    case "to":
                        isTo = true;
                        break;
                    case "heading":
                        isHeading = true;
                        break;
                    case "body":
                        isBody = true;
                        break;
                }
            } else if (res == reader.CHARACTERS) {
                if (isEmails) {
                    emails = new ArrayList<>();
                    isEmails = false;
                } else if (isEmail) {
                    email = new Email();
                    isEmail = false;
                } else if (isId) {
                    assert email != null;
                    email.setId(Integer.parseInt(reader.getText()));
                    isId = false;
                } else if (isTo) {
                    assert email != null;
                    email.setTo(reader.getText());
                    isTo = false;
                } else if (isHeading) {
                    assert email != null;
                    email.setHeading(reader.getText());
                    isHeading = false;
                } else if (isFrom) {
                    assert email != null;
                    email.setFrom(reader.getText());
                    isFrom = false;
                } else if (isBody) {
                    assert email != null;
                    email.setBody(reader.getText());
                    isBody = false;
                }
            } else if (res == reader.END_ELEMENT) {
                if (reader.getLocalName().equals("email")) {
                    assert emails != null;
                    emails.add(email);
                }
            }
        }
        return emails;
    }
}

