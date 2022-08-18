public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Rocky Balboa");
        v[2] = new Video("Gaara vs Rock Lee");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Roger", 24, "M", "Tartarugao");
        g[1] = new Gafanhoto("Thais", 21, "F", "Gominha");

        Visualizacao vis[] = new Visualizacao[5];
        vis [0] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar();

        vis[1] = new Visualizacao(g[0], v[2]);
        vis[1].avaliar(85.0f);
    }
}
