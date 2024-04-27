/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cos_3015_project;

/**
 * file: Cred
 * @author Nikola Georgiev
 * date 27.04.2024
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cred {

    private String URL;
    private String User;
    private String Pass;
    private String Table;
    private String Algo;

    public Cred() {

        String csvFile = "config\\config.csv";
        String line = "";
        String csvSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Read the CSV line by line
            line = br.readLine();
            // Split the line by commas
            String[] data = line.split(csvSplitBy);
            this.URL = data[0];
            this.User = data[1];
            this.Pass = data[2];
            this.Table = data[3];
            this.Algo = data[4];

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getURL() {
        return URL;
    }

    public String getUser() {
        return User;
    }

    public String getPass() {
        return Pass;
    }

    public String getTable() {
        return Table;
    }

    public String getAlgo() {
        return Algo;
    }

}
