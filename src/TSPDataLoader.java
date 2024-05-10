package IO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TSPDataLoader {

    public static String loadDataFromFile(String filePath) {
        StringBuilder data = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isNodeCoordSection = false;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("NODE_COORD_SECTION")) {
                    isNodeCoordSection = true;
                    continue;
                }

                if (isNodeCoordSection && line.startsWith("EOF")) {
                    break;
                }

                if (isNodeCoordSection) {
                    data.append(line).append("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return data.toString();
    }
    

    public static int[][] convertTSPDataToDistanceMatrix(String tspData) {
        String[] lines = tspData.split("\n");

        List<double[]> coordinatesList = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.trim().split("\\s+");
            double x = Double.parseDouble(parts[1]);
            double y = Double.parseDouble(parts[2]);
            coordinatesList.add(new double[]{x, y});
        }

        int n = coordinatesList.size();
        int[][] distanceMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    distanceMatrix[i][j] = 0;
                } else {
                    double x1 = coordinatesList.get(i)[0];
                    double y1 = coordinatesList.get(i)[1];
                    double x2 = coordinatesList.get(j)[0];
                    double y2 = coordinatesList.get(j)[1];

                    distanceMatrix[i][j] = (int) Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
                }
            }
        }

        return distanceMatrix;
    }
}
