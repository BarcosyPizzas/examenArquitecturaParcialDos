import java.sql.Date;

public class SolicitudPrestamo {
    private Estudiante estudiante;
    private Libro libro;
    private Date fechaPrestamo;
    private String notasEspeciales;
    private boolean renovacionAutomatica;
    private int numRenovaciones;

    public SolicitudPrestamo(SolicitudPrestamoBuilder builder) {
        this.estudiante = builder.estudiante;
        this.libro = builder.libro;
        this.fechaPrestamo = builder.fechaPrestamo;
        this.notasEspeciales = builder.notasEspeciales;
        this.renovacionAutomatica = builder.renovacionAutomatica;
        this.numRenovaciones = builder.numRenovaciones;
    }

    public static class SolicitudPrestamoBuilder {
        private Estudiante estudiante;
        private Libro libro;
        private Date fechaPrestamo;
        private String notasEspeciales;
        private boolean renovacionAutomatica;
        private int numRenovaciones;

        public SolicitudPrestamoBuilder setEstudiante(Estudiante estudiante) {
            this.estudiante = estudiante;
            return this;
        }

        public SolicitudPrestamoBuilder setLibro(Libro libro) {
            this.libro = libro;
            return this;
        }

        public SolicitudPrestamoBuilder setFechaPrestamo(Date fechaPrestamo) {
            this.fechaPrestamo = fechaPrestamo;
            return this;
        }

        public SolicitudPrestamoBuilder setNotasEspeciales(String notasEspeciales) {
            this.notasEspeciales = notasEspeciales;
            return this;
        }

        public SolicitudPrestamoBuilder setRenovacionAutomatica(boolean renovacionAutomatica) {
            this.renovacionAutomatica = renovacionAutomatica;
            return this;
        }

        public SolicitudPrestamoBuilder setNumRenovaciones(int numRenovaciones) {
            this.numRenovaciones = numRenovaciones;
            return this;
        }

        public SolicitudPrestamo construir() {
            if (this.estudiante == null) {
                throw new IllegalStateException("El estudiante es obligatorio");
            }
            if (this.libro == null) {
                throw new IllegalStateException("El libro es obligatorio");
            }
            if (this.fechaPrestamo == null) {
                throw new IllegalStateException("La fecha de préstamo es obligatoria");
            }
            return new SolicitudPrestamo(this);
        }
    }
    
}
