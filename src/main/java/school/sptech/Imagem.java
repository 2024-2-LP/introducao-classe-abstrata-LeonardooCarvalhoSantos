package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaAreas = 0.0;

        for (Figura figura : figuras) {
            somaAreas += figura.calcularArea();
        }

        return somaAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figurasMaior20 = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20) {
                figurasMaior20.add(figura);
            }
        }

        return figurasMaior20;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> figurasQuadradas = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                figurasQuadradas.add(figura);
            }
        }

        return figurasQuadradas;
    }
}
