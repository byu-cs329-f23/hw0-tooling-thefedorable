import java.io.IOException;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;
import com.google.gson.Gson;
import Attractions.*;

/**
 * Main class of program
 * @author Tanner Hartwell
 */
public class Main {

  /**
   * constructor for main class
   */
  public Main(){}

  /**
   * main function of program
   * @param args arguments given at running of program
   * @throws IOException throw error if URL isn't good
   */
  public static void main(String[] args) throws IOException {

    JSONObject json=null;
    URL url = new URL("https://queue-times.com/en-US/parks/17/queue_times.json");

    try (BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()))) {
      StringBuilder sb=new StringBuilder();
      String line;
      while ((line=reader.readLine()) != null) {
        sb.append(line);
      }
      json=new JSONObject(sb.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      Gson gson = new Gson();
      assert json != null;
      Park park = gson.fromJson(String.valueOf(json), Park.class);

      System.out.print("Average wait: ");
      System.out.println(park.getAverageWait()+ " min");
      System.out.println();
      System.out.println(park);

      Land[] lands= park.getLands();

      for (Land land : lands) {
        System.out.print("Average Wait in " + land.getName()+": ");
        System.out.println(land.avWaitTime()+"min");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
