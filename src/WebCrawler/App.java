package WebCrawler;

public class App {
    public static void main(String[] args) {

        String root = "https://nytimes.com/";
        BFS bfs= new BFS();
        bfs.discoveredSite(root);
    }
}
