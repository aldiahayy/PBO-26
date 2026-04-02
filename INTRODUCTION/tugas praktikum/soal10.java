package praktikum1;
public class soal10 {
    public static void main(String[] args) {

        String s1 = "Informatika";
        String s2 = "informatika";
        String s3 = "  Java PBO  ";
        String kosong = "   ";
        char[] dataChar = {'J', 'A', 'V', 'A'};

        // 1. charAt(int index)
        System.out.println("charAt: " + s1.charAt(0));

        // 2. compareTo()
        System.out.println("compareTo: " + s1.compareTo(s2));

        // 3. compareToIgnoreCase()
        System.out.println("compareToIgnoreCase: " + s1.compareToIgnoreCase(s2));

        // 4. concat()
        System.out.println("concat: " + s1.concat(" Unsulbar"));

        // 5. contains()
        System.out.println("contains: " + s1.contains("Info"));

        // 6. copyValueOf()
        System.out.println("copyValueOf: " + String.copyValueOf(dataChar));
        System.out.println("copyValueOf range: " + String.copyValueOf(dataChar, 1, 2));

        // 7. equals()
        System.out.println("equals: " + s1.equals(s2));

        // 8. equalsIgnoreCase()
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));

        // 9. format()
        System.out.println("format: " + String.format("Nama: %s, Nilai: %d", "Aldi", 90));

        // 10. hashCode()
        System.out.println("hashCode: " + s1.hashCode());

        // 11. indexOf()
        System.out.println("indexOf: " + s1.indexOf("a"));
        System.out.println("indexOf from index: " + s1.indexOf("a", 3));

        // 12. isBlank()
        System.out.println("isBlank: " + kosong.isBlank());

        // 13. length()
        System.out.println("length: " + s1.length());

        // 14. lines()
        String multi = "Baris1\nBaris2\nBaris3";
        multi.lines().forEach(System.out::println);

        // 15. matches()
        System.out.println("matches: " + s1.matches("[A-Za-z]+"));

        // 16. repeat()
        System.out.println("repeat: " + s1.repeat(2));

        // 17. replace()
        System.out.println("replace: " + s1.replace("a", "o"));

        // 18. replaceAll()
        System.out.println("replaceAll: " + s1.replaceAll("a", "o"));

        // 19. replaceFirst()
        System.out.println("replaceFirst: " + s1.replaceFirst("a", "o"));

        // 20. split()
        String kalimat = "Java PBO Unsulbar";
        String[] hasil = kalimat.split(" ");
        for (String h : hasil) {
            System.out.println("split: " + h);
        }

        // 21. substring()
        System.out.println("substring begin: " + s1.substring(2));
        System.out.println("substring range: " + s1.substring(2, 5));

        // 22. toCharArray()
        char[] arr = s1.toCharArray();
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 23. toLowerCase()
        System.out.println("toLowerCase: " + s1.toLowerCase());

        // 24. toString()
        System.out.println("toString: " + s1.toString());

        // 25. toUpperCase()
        System.out.println("toUpperCase: " + s1.toUpperCase());

        // 26. trim()
        System.out.println("trim: " + s3.trim());

        // 27. valueOf()
        System.out.println("valueOf int: " + String.valueOf(10));
        System.out.println("valueOf double: " + String.valueOf(10.5));
        System.out.println("valueOf long: " + String.valueOf(100L));
        System.out.println("valueOf char: " + String.valueOf('A'));
        System.out.println("valueOf boolean: " + String.valueOf(true));
        System.out.println("valueOf char array: " + String.valueOf(dataChar));
        System.out.println("valueOf char array range: " + String.valueOf(dataChar, 1, 2));

    }
}
