package IO;
import java.io.IOException;

public class Main {
    public static String data1 = "eil51.tsp";
    public static void main(String[] args) throws IOException {

        //MyReader.getArrayOfCities().toString();

        MyReader.read(data1);

        //MyReader.getArrayOfCities().toString();

        Simulated_anneling a = new Simulated_anneling();
        a.simulate();
        //Simulated_anneling.simulate();
    }
}
