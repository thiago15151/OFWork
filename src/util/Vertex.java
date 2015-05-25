
package util;

public class Vertex {
    private String id;
    private int degree;

    public Vertex(String id) {
        this.id = id;
        this.degree = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return String.valueOf(this.id);
    }
}
