public class Main {
    public static void main(String[] args) {
        Saludo saludo = new Saludo();

        Empleado emp1 = new Empleado("José", saludo, false);
        Empleado emp2 = new Empleado("Manuel", saludo, false);
        Empleado emp3 = new Empleado("Carlos", saludo, false);
        Empleado emp4 = new Empleado("Rocío", saludo, false);
        Empleado emp5 = new Empleado("Belén", saludo, false);
        Empleado emp6 = new Empleado("María", saludo, false);
        Empleado emp7 = new Empleado("Luis", saludo, false);
        Empleado jefe = new Empleado("Fernando", saludo, true);

        emp2.start();
        emp3.start();
        emp1.start();
        jefe.start();
        emp4.start();
        emp5.start();
        emp6.start();
        emp7.start();

    }
}