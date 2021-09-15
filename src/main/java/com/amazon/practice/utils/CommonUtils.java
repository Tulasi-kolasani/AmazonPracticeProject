package com.amazon.practice.utils;



import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class CommonUtils {

    public static int randomNumberGenerator(int min, int max)
    {

        System.out.println("Max limit :"+max);
        int randomNum = ThreadLocalRandom.current().nextInt(min, max -2);
        System.out.println("Random Number:"+randomNum);
        return randomNum;
    }

    public static void writeRunTimeDataToFile(String variable, String value) throws Exception {
        try {
            boolean updateValue = false;
            String totalContent="";

            File fileToBeModified = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\configurations\\RunTimeData.txt");
            if(!fileToBeModified.exists()) {
                System.out.println("File not found");
            }
            BufferedReader file =
                    new BufferedReader(
                     new FileReader(fileToBeModified)) ;

            String line = file.readLine();
            while (line != null)
            {
                if(line.contains(variable+":"))
                {
                //    String str[]= line.split(":");
                    line = variable+":"+value;
                    updateValue = true;
                }
                totalContent=totalContent+line+"\n";
                line = file.readLine();
            }
            if(updateValue==false)
            {
                totalContent =totalContent+variable+":"+value+"\n";
            }
            FileWriter fileWriter = new FileWriter(fileToBeModified);

            fileWriter.write(totalContent);
            fileWriter.close();

        } catch (FileNotFoundException ex) {

        }
    }

    public static String readRunTimeDataFromFile(String variable) throws Exception {
        String value =null;
        File fileToBeUsed = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\configurations\\RunTimeData.txt");
        if(!fileToBeUsed.exists()) {
            System.out.println("File not found");
        }
        BufferedReader file =
                new BufferedReader(
                        new FileReader(fileToBeUsed)) ;

        String line = file.readLine();
        while (line != null)
        {
            if(line.contains(variable+":"))
            {
                String str[]= line.split(":");

                value=str[1];
                break;
            }

            line = file.readLine();
        }
        file.close();
        return value;
    }
}
