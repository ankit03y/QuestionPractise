import java.io.IOException;
import java.util.*;


class Result {

    private static void sortByValue(Map<String, Integer> map) {
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
    }

    public static List<String> mostActive(List<String> customers) {
        Map<String, Integer> companyCountMap = new LinkedHashMap<>();
        for (int i = 0; i < customers.size(); i++) {
            String companyName = customers.get(i);
            if (companyCountMap.get(companyName) == null) {
                companyCountMap.put(companyName, 1);
            } else {
                Integer count = companyCountMap.get(companyName);
                companyCountMap.put(companyName, count + 1);
            }
        }

        sortByValue(companyCountMap); // Decreasing

        HashMap<String, Float> companyPercentageMap = new HashMap<String, Float>();
        for (int i = 0; i < customers.size(); i++) {
            String companyName = customers.get(i);
            Integer count = companyCountMap.get(companyName);
            Float percentage = (float) count / customers.size() * 100;
            companyPercentageMap.put(companyName, percentage);
        }

        int i = 1;
        List<String> output = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : companyCountMap.entrySet()) {
            if (i < 4) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                Float perc = companyPercentageMap.get(key);
                if (perc < 5) {
                    continue;
                }
                output.add(key);
                i++;
            } else {
                break;
            }
        }

        return output;
    }


}

public class Test {
    public static void main(String[] args) throws IOException {
        Result result = new Result();
        List<String> input = new ArrayList<>();
        input.add("E");
        input.add("B");
        input.add("E");
        input.add("B");
        input.add("C");
        input.add("E");
        input.add("A");
        input.add("E");
        input.add("B");
        input.add("B");
        input.add("E");
        List<String> output = result.mostActive(input);
        System.out.println(output);
    }
}

