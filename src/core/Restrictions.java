
package core;

import util.Edge;
import util.Vertex;

public abstract class Restrictions {
    abstract boolean restrictVertex(Vertex v);
    abstract boolean restrictEdge(Edge e);
    boolean restrict(Vertex v, Edge e) {
        return restrictEdge(e) && restrictVertex(v);
    }
}