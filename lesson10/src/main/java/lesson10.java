import java.util.*;

public class lesson10 {
    public static void main(String[] args) {
        List<String> countryList = extracted(); //Заполняем список
        HashMap<String, Integer> countriesGroup = new HashMap<>();
        int counter = 0;
        Set<String> uniqueCountry = new HashSet(countryList); // Для уникальных элементов

        System.out.println("Список уникальных элементов:");
        for (String uniqCountry : uniqueCountry) {
            System.out.println(uniqCountry);
        }

        // Формируем коллекцию ,где ключ - Страна, значение - число повторений
        for (String country : countryList) {
            if (countriesGroup.containsKey(country)) {
                counter = countriesGroup.get(country) + 1;
                countriesGroup.put(country, counter);
            } else {
                countriesGroup.put(country, 1);
            }
        }

        // Выводим
        for (Map.Entry<String, Integer> o : countriesGroup.entrySet()) {
            System.out.println(o.getKey() + " - " + o.getValue());
        }
    }


    private static List<String> extracted() {
        List<String> countryList = new ArrayList();
        countryList.add("Russia");
        countryList.add("China");
        countryList.add("Brazil");
        countryList.add("China");
        countryList.add("Brazil");
        countryList.add("China");
        countryList.add("Brazil");
        countryList.add("Brazil");
        countryList.add("Peru");
        countryList.add("Korea");
        countryList.add("Chili");
        countryList.add("Chili");
        countryList.add("Sudan");
        return countryList;
    }
}
