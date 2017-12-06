/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception2;

/**
 *
 * @author jahur
 */
public class Asignacion {

    Estudiante[] Estudiante;
    double[] notas_mats;
    double[] notas_sociales;

    public Asignacion() {
        this.Estudiante = new Estudiante[4];
        this.notas_mats = new double[4];
        this.notas_sociales = new double[4];

    }

    public String getEstudiante(int index) {
        return Estudiante[index].toString();
    }

    public void setAsignacion1(Estudiante Estudiante, double nota_mat, double nota_soc, int index) {
        this.Estudiante[index] = Estudiante;
        this.notas_mats[index] = nota_mat;
        this.notas_sociales[index] = nota_soc;

    }

    public void setEstudiante(Estudiante[] Estudiante) {
        this.Estudiante = Estudiante;
    }

    public double getNotas_mats(int index) {
        return notas_mats[index];
    }

    public void setNotas_mats(double[] notas_mats) {
        this.notas_mats = notas_mats;
    }

    public double getNotas_sociales(int index) {
        return notas_sociales[index];
    }

    public void setNotas_sociales(double[] notas_sociales) {
        this.notas_sociales = notas_sociales;
    }

    public double getPromedio_mat() {
        double total = 0;
        for (double nota : this.notas_mats) {
            total += nota;
        }
        return total / 4;
    }

    public double getPromedio_soc() {
        double total = 0;
        for (double nota : this.notas_sociales) {
            total += nota;
        }
        return total / 4;
    }

    public double getPromedio_est(int index) {
        return (this.notas_mats[index] + this.notas_sociales[index]) / 2;
    }

    public String getEstudianteFinal() {
        String resul = "";
        for (int i = 0; i < 4; i++) {
            resul += String.format("%s\n"
                    + "  Matemáticas %.2f\n"
                    + "  Sociales %.2f\n"
                    + "  Promedio %.2f\n\n",
                    this.getEstudiante(i), this.getNotas_mats(i), this.getNotas_sociales(i), this.getPromedio_est(i));
        }
        return resul;

    }

    @Override
    public String toString() {
        return String.format("Lista de Estuandes\n"
                + "%s\n"
                + "Promedio Generales\n"
                + "Promedio de Matemáticas %.2f\n"
                + "Promedio de Sociales %.2f\n",
                this.getEstudianteFinal(), this.getPromedio_mat(), this.getPromedio_soc());
    }
}
