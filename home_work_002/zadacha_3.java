// Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

import java.io.*;

public class zadacha_3 {
    public static void main(String[] args) {
        try (BufferedReader BufReader = new BufferedReader(new FileReader("zadacha_003.json"))) {
            StringBuilder strBuild = new StringBuilder();
            String strRead;
            while ((strRead = BufReader.readLine()) != null) {
                strBuild.append(strRead);
            }
            strBuild.deleteCharAt(strBuild.length() - 1)
                    .deleteCharAt(strBuild.length() - 1)
                    .replace(0, 1, "  ");
            String upgradeText = strBuild.toString();
            upgradeText = upgradeText.replace("}", "\n").replace("{", "")
                    .replace("фамилия", "Студент")
                    .replace("оценка", "получил")
                    .replace("предмет", "по предмету")
                    .replace("\"", "")
                    .replace(":", " ")
                    .replace(",", " ");
            try (FileWriter fw = new FileWriter("file.txt", false)) {
                fw.write(upgradeText);
                System.out.println(upgradeText);
            }
        } catch (IOException ex) {
            System.out.println("error");
        }
    }
}