public class Main {
    public static void main(String[] args) {
        String[] arrayList = {"011", "999", "8812", "12938", "123", "89732", "89732498", "98324"};        for (int i = 0; i < arrayList.length - 1; i++) {
            int minimum = i;            for (int j = i + 1; j < arrayList.length; j++) {
                if (Integer.parseInt(arrayList[j]) < Integer.parseInt(arrayList[minimum])) {
                    minimum = j;                }
            }
            if (minimum != i) {
                String temp = arrayList[i];                arrayList[i] = arrayList[minimum];                arrayList[minimum] = temp;            }
        }

        for (String number : arrayList) {
            System.out.println(number);        }
    }
}