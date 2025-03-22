class OperacionesMatDouble implements Operable<Double> {
    private Double valor;

    public OperacionesMatDouble(Double valor) {
        this.valor = valor;
    }
    @Override
    public Double suma(Double otro) { 
        return valor + otro; 
    }
    @Override
    public Double resta(Double otro) { 
        return valor - otro; 
    }
    @Override
    public Double producto(Double otro) { 
        return valor * otro; 
    }
    @Override
    public Double division(Double otro) { 
        return otro != 0 ? valor / otro : 0.0; 
    }
    @Override
    public Double potencia(Double exponente) { 
        return Math.pow(valor, exponente); 
    }
    @Override
    public Double raizCuadrada() { 
        return Math.sqrt(valor); 
    }
    @Override
    public Double raizCubica() { 
        return Math.cbrt(valor); 
    }
}