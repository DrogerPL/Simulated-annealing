package IO;
import java.io.IOException;
import java.util.ArrayList;

public class MyReader {

    public static ArrayList<City> cities = new ArrayList<>();

    public static void read(String path) throws IOException {
        String tspData = TSPDataLoader.loadDataFromFile(path);

        if (tspData != null) {
            int[][] distanceMatrix = TSPDataLoader.convertTSPDataToDistanceMatrix(tspData);

            for (int i = 0; i < distanceMatrix.length; i++) {
                ArrayList<Integer> distances = new ArrayList<>();
                for (int j = 0; j < distanceMatrix[i].length; j++) {
                    distances.add(distanceMatrix[i][j]);
                }
                cities.add(new City(i, distances));
            }
        } else {
            System.out.println("Błąd wczytywania danych.");
        }
    }

    public static ArrayList<City> getArrayOfCities() {
        return cities;
    }
}
