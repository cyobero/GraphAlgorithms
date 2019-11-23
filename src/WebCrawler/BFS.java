package WebCrawler;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BFS {

    private Queue<String> queue;
    private List<String> discoveredSites;

    public BFS() {
        queue = new LinkedList<>();
        this.discoveredSites = new ArrayList<>();
    }

    public void discoveredSite(String root) {

        this.queue.add(root);
        this.discoveredSites.add(root);

        while (!queue.isEmpty()) {

            String v = this.queue.remove();
            String rawHtml = readURL(v);

            String regexp = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(rawHtml);

            while (matcher.find()) {
                String w = matcher.group();

                if (!discoveredSites.contains(w)) {
                    discoveredSites.add(w);
                    System.out.println("Website found with URL: " + w);
                    queue.add(w);
                }
            }
        }
    }

    private String readURL(String v) {

        String rawHtml = "";

        try {
            URL url = new URL(v);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine = "";
            while ((inputLine = in.readLine()) != null) {
                rawHtml += inputLine;
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rawHtml;
    }
}
