package java_two;

import java.lang.constant.Constable;

public class ServerNameGenerator {
    private static String[] adjects = {"Extroverted", "Efficient", "Plucky", "Masculine", "Powerful", "Modest", "Resourceful", "Frank", "Optimistic", "Witty"};
    private static String[] nouns = {"Eye", "Time", "War", "Life", "Woman", "Fact", "Problem", "Group", "Week", "Case"};


    private static String generateRandom(String[] strings) {
        int randomNum = (int) (Math.random() * strings.length);
        return strings[randomNum];
    }


    public static String generateServerName(String[] strings1, String[] strings2){
        String firstPart = generateRandom(strings1);
        String secondPart = generateRandom(strings2);
        return firstPart + "-" + secondPart;
    }


    public static void main(String[] args) {
        System.out.println("Your server name is:");
        System.out.println(generateServerName(adjects,nouns));
    }
}


